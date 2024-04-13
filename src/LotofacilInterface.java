import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.Color;

public class LotofacilInterface extends JFrame {

    JPanel painel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    ImageIcon image = new ImageIcon("imgRoleta.png");//Cria um icone
    JFrame frame = new JFrame(); // Cria um quadro

    Border border = BorderFactory.createLineBorder(Color.green,3);

    ImageIcon icon = new ImageIcon("imgRoleta.png");
    JLabel label = new JLabel(icon);


    private JLabel titleLabel;
    private JButton bet0to100Button;
    private JButton betAToZButton;
    private JButton betParImparButton;
    private JLabel imageLabel;

    private Random random;

    public LotofacilInterface() {
        setTitle("Lotofácil");
        frame.setIconImage(image.getImage());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));



        painel.setSize(600, 900);
        add(painel, BorderLayout.CENTER);


        titleLabel = new JLabel("Escolha uma opção:");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);
        frame = new JFrame("Apostas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600); // Definir um tamanho maior para a janela JFrame para acomodar o JPanel
        frame.getContentPane().add(painel); // Adicionar o JPanel ao JFrame
        frame.setIconImage(image.getImage());

        // Exibir o JFrame
        frame.setVisible(true);
        painel.add(label);
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

    public void playAToZ() {
        try {
            JTextField textField = new JTextField(10); // Criando um JTextField para entrada de texto
            int option = JOptionPane.showConfirmDialog(null, textField, "Escolha uma letra de A à Z:", JOptionPane.OK_CANCEL_OPTION);

            char letraPremiada = 'R';
            String texto = textField.getText().toUpperCase(); // Obtém o texto do JTextField e converte para maiúsculas
            if (texto.length() == 1 && Character.isLetter(texto.charAt(0))) { // Verifica se o texto tem apenas um caractere e se é uma letra
                char letra = texto.charAt(0); // Obtém o caractere digitado pelo usuário
                if (letra == letraPremiada) {
                    JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou R$500,00.");
                } else {
                    JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letraPremiada);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Aposta inválida! Deve ser uma letra entre A e Z.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao processar a aposta de letra.");
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