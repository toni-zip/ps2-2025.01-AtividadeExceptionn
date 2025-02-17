package br.dev.joaquim;

/**
 * Classe principal que inicia a aplicação bancária.
 * @author Antonio Pereira
 * @see UserInterface
 *
 */
public class App {
    /**
     * Método de entrada do sistema.
     * @param args Argumentos não utilizados
     */
    public static void main(String[] args) {
        UserInterface main = new UserInterface();
        main.start();
    }
}