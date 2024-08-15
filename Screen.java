import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Screen extends JFrame implements ActionListener{

    JTextField text;
    JTextField num1;
    JTextField num2;

    public Screen(){
        
        setTitle("TERMO");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setLayout(null);
        
        JButton jButton = new JButton();
        jButton.setText("Somar");
        jButton.setBounds(300, 400, 200, 50);
        jButton.setFont(new Font("Arial", Font.BOLD, 30));
        jButton.setForeground(new Color(0, 0, 0));
        jButton.setBackground(new Color(255, 255, 255));
        
        JButton jButton2 = new JButton();
        jButton2.setText("Okay");
        jButton2.setBounds(300, 200, 200, 50);
        jButton2.setFont(new Font("Arial", Font.BOLD, 30));
        jButton2.setForeground(new Color(0, 0, 0));
        jButton2.setBackground(new Color(255, 255, 255));
        
        text = new JTextField();
        text.setBounds(100, 100, 100, 100);
        text.setFont(new Font("Arial", Font.ITALIC, 40));
        text.setText("texto");

        num1 = new JTextField();
        num1.setBounds(200, 100, 100, 100);
        num1.setFont(new Font("Arial", Font.ITALIC, 40));
        num1.setText("num1");

        num2 = new JTextField();
        num2.setBounds(300, 100, 100, 100);
        num2.setFont(new Font("Arial", Font.ITALIC, 40));
        num2.setText("num2");
        
        add(text);
        add(num1);
        add(num2);
        add(jButton2);
        add(jButton);
        
        
        jButton.addActionListener(this);
        jButton2.addActionListener(this::teste);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Integer numero1 = Integer.parseInt(num1.getText());
        Integer numero2 = Integer.parseInt(num2.getText());

        Integer soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "Palavra: " + text.getText() + "\nSoma: " + soma, "Titulo", JOptionPane.WARNING_MESSAGE);
    }

    private void teste(ActionEvent actionEvent) {
        System.out.println("OKAY");
        String texto = text.getText();
        System.out.println(texto);
    }
}
