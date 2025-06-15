const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());
app.use(express.static('public'));

// Armazenamento em memória
let jogos = [
    { id: 1, nome: "Super Mario Bros", genero: "Plataforma", plataforma: "NES" },
    { id: 2, nome: "The Legend of Zelda", genero: "Aventura", plataforma: "SNES" },
    { id: 3, nome: "Street Fighter II", genero: "Luta", plataforma: "Arcade" },
    { id: 4, nome: "Sonic the Hedgehog", genero: "Plataforma", plataforma: "Mega Drive" },
    { id: 5, nome: "Final Fantasy VII", genero: "RPG", plataforma: "PlayStation" }
];

// GET: Listar jogos (com filtro por gênero opcional)
app.get('/jogos', (req, res) => {
    const genero = req.query.genero;
    if (genero) {
        res.json(jogos.filter(jogo => jogo.genero.toLowerCase() === genero.toLowerCase()));
    } else {
        res.json(jogos);
    }
});

// POST: Adicionar novo jogo
app.post('/jogos', (req, res) => {
    const { nome, genero, plataforma } = req.body;
    if (!nome || !genero || !plataforma) {
        return res.status(400).json({ erro: "Nome, gênero e plataforma são obrigatórios" });
    }
    const novoJogo = {
        id: jogos.length + 1,
        nome,
        genero,
        plataforma
    };
    jogos.push(novoJogo);
    res.status(201).json(novoJogo);
});

app.listen(port, () => {
    console.log(`Servidor rodando em http://localhost:${port}`);
});