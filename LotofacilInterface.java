import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class LotofacilInterface extends JFrame {

    private JLabel titleLabel;
    private JButton bet0to100Button;
    private JButton betAToZButton;
    private JButton betParImparButton;
    private JLabel imageLabel;

    private Random random;

    public LotofacilInterface() {
        setTitle("Lotofácil");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));





        titleLabel = new JLabel("Escolha uma opção:");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        bet0to100Button = new JButton("Apostar de 0 a 100");
        bet0to100Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play0to100();
            }
        });
        add(bet0to100Button);

        betAToZButton = new JButton("Apostar de A à Z");
        betAToZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playAToZ();
            }
        });
        add(betAToZButton);

        betParImparButton = new JButton("Apostar em par ou ímpar");
        betParImparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playParImpar();
            }
        });
        add(betParImparButton);

        random = new Random();
    }

    private void play0to100() {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 100:"));

        if (userNumber < 0 || userNumber > 100) {
            JOptionPane.showMessageDialog(this, "Aposta inválida.");
            return;
        }

        int randomNumber = random.nextInt(101);

        if (userNumber == randomNumber) {
            JOptionPane.showMessageDialog(this, "Você ganhou R$ 1.000,00 reais.");
        } else {
            JOptionPane.showMessageDialog(this, "Que pena! O número sorteado foi: " + randomNumber + ".");
        }
    }

    private void playAToZ() {
        String userCharStr = JOptionPane.showInputDialog("Digite uma letra de A à Z:");
        char userChar = userCharStr.toUpperCase().charAt(0);

        if (!Character.isLetter(userChar)) {
            JOptionPane.showMessageDialog(this, "Aposta inválida.");
            return;
        }

        char winningChar = 'J'; // Exemplo de letra premiada

        if (userChar == winningChar) {
            JOptionPane.showMessageDialog(this, "Você ganhou R$ 500,00 reais.");
        } else {
            JOptionPane.showMessageDialog(this, "Que pena! A letra sorteada foi: " + winningChar + ".");
        }
    }

    private void playParImpar() {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        if (userNumber % 2 == 0) {
            JOptionPane.showMessageDialog(this, "Você ganhou R$ 100,00 reais.");
        } else {
            JOptionPane.showMessageDialog(this, "Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LotofacilInterface().setVisible(true);
            }
        });
    }
}
