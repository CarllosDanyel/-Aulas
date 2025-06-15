class Jogo {
    constructor(id, nome, genero, plataforma) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
    }
    toString() {
        return `${this.nome} (${this.genero}, ${this.plataforma})`;
    }
}

class ColecaoJogos {
    constructor(jogos = []) {
        this.jogos = jogos;
    }
    criarIterador() {
        return new IteradorJogos(this.jogos);
    }
    definirJogos(jogos) {
        this.jogos = jogos.map(j => new Jogo(j.id, j.nome, j.genero, j.plataforma));
    }
}

class IteradorJogos {
    constructor(jogos) {
        this.jogos = jogos;
        this.indiceAtual = -1;
    }
    proximo() {
        this.indiceAtual++;
        if (this.indiceAtual < this.jogos.length) {
            return { valor: this.jogos[this.indiceAtual], concluido: false };
        }
        return { valor: null, concluido: true };
    }
    anterior() {
        this.indiceAtual--;
        if (this.indiceAtual >= 0) {
            return { valor: this.jogos[this.indiceAtual], concluido: false };
        }
        return { valor: null, concluido: true };
    }
    temProximo() {
        return this.indiceAtual + 1 < this.jogos.length;
    }
    temAnterior() {
        return this.indiceAtual - 1 >= 0;
    }
}

const colecao = new ColecaoJogos();
let iterador = colecao.criarIterador();
const infoJogo = document.getElementById('info-jogo');
const btnAnterior = document.getElementById('btn-anterior');
const btnProximo = document.getElementById('btn-proximo');
const filtroGenero = document.getElementById('filtro-genero');
const formAdicionarJogo = document.getElementById('form-adicionar-jogo');

function atualizarBotoes() {
    btnAnterior.disabled = !iterador.temAnterior();
    btnProximo.disabled = !iterador.temProximo();
}

function exibirJogo(jogo) {
    infoJogo.textContent = jogo ? jogo.toString() : "Nenhum jogo disponível.";
}

async function buscarJogos(genero = '') {
    try {
        const url = genero ? `/jogos?genero=${genero}` : '/jogos';
        const resposta = await fetch(url);
        const jogos = await resposta.json();
        colecao.definirJogos(jogos);
        iterador = colecao.criarIterador();
        exibirJogo(null);
        atualizarBotoes();
    } catch (erro) {
        infoJogo.textContent = "Erro ao carregar jogos.";
        console.error(erro);
    }
}

btnProximo.addEventListener('click', () => {
    const resultado = iterador.proximo();
    if (!resultado.concluido) {
        exibirJogo(resultado.valor);
        atualizarBotoes();
    }
});

btnAnterior.addEventListener('click', () => {
    const resultado = iterador.anterior();
    if (!resultado.concluido) {
        exibirJogo(resultado.valor);
        atualizarBotoes();
    }
});

filtroGenero.addEventListener('change', (e) => {
    buscarJogos(e.target.value);
});

formAdicionarJogo.addEventListener('submit', async (e) => {
    e.preventDefault();
    const nome = document.getElementById('nome-jogo').value;
    const genero = document.getElementById('genero-jogo').value;
    const plataforma = document.getElementById('plataforma-jogo').value;

    try {
        const resposta = await fetch('/jogos', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ nome, genero, plataforma })
        });
        if (resposta.ok) {
            formAdicionarJogo.reset();
            buscarJogos(filtroGenero.value);
        } else {
            infoJogo.textContent = "Erro ao adicionar jogo.";
        }
    } catch (erro) {
        infoJogo.textContent = "Erro ao adicionar jogo.";
        console.error(erro);
    }
});

// Carregar jogos iniciais
buscarJogos();