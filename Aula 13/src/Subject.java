
// Subject.java
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observadores;

    public Subject() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observer obs) {
        if (observadores.size() < 10) {
            observadores.add(obs);
            System.out.println("Observador adicionado com sucesso!\n");
        } else {
            System.out.println("Limite máximo de observadores atingido!\n");
        }
    }

    public void removerObservador(Observer obs) {
        if (observadores.remove(obs)) {
            System.out.println("Observador removido com sucesso!\n");
        } else {
            System.out.println("Observador não encontrado!\n");
        }
    }

    public void notificarObservadores(String mensagem) {
        System.out.println("=== NOTIFICANDO OBSERVADORES ===");
        for (Observer obs : observadores) {
            obs.atualizar(mensagem);
        }
        System.out.println("=== FIM DAS NOTIFICAÇÕES ===\n");
    }
}
