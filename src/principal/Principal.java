package principal;

import javax.swing.JOptionPane;
import model.Tempo;

public class Principal {

    public static void main(String[] args) {
        
        int escolha;
        Tempo clock = new Tempo();

        clock.setHora(Integer.parseInt(JOptionPane.showInputDialog("Informe a hora: ")));
        clock.setMinuto(Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto: ")));
        clock.setSegundo(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo: ")));

        JOptionPane.showMessageDialog(null, clock.getTempo());

        escolha = (Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 1 - Incrementar Segundo \n 2 - Incrementar Minuto \n 3 - Incrementar hora \n 4 - Mostrar tempo em segundos \n 5 - Outras opções")));       
        if (escolha >= 5) {
            escolha = (Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 6 - Decrementar Segundo \n 7 - Decrementar Minuto \n 8 - Decrementar hora \n 9 - Sair")));
        }
        switch (escolha) {
            case 1:
                clock.incrementarSegundo();
                JOptionPane.showMessageDialog(null, clock.getTempo());
                break;

            case 2:
                clock.incrementarMinuto();
                JOptionPane.showMessageDialog(null, clock.getTempo());
                break;

            case 3:
                clock.incrementarHora();
                JOptionPane.showMessageDialog(null, clock.getTempo());
                break;

            case 4:
                JOptionPane.showMessageDialog(null, clock.getSegundos() + " segundos.");
                break;

            case 6:
                clock.decrementarSegundo();
                JOptionPane.showMessageDialog(null, clock.getTempo());
                break;

            case 7:
                clock.decrementarMinuto();
                JOptionPane.showMessageDialog(null, clock.getTempo());
                break;

            case 8:
                clock.decrementarHora();
                JOptionPane.showMessageDialog(null, clock.getTempo());
                break;

            default:
                break;
        }        
    }
}