import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {


    // Método main para iniciar a aplicação
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Construtor da classe LoginScreen
    public LoginScreen() {
        // Configurações do JFrame
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel para os campos de entrada de login
        JPanel loginPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Labels e campos de texto para usuário e senha
        JLabel userLabel = new JLabel("Usuário:");
        JTextField userField = new JTextField();
        JLabel passwordLabel = new JLabel("Senha:");
        JPasswordField passwordField = new JPasswordField();

        // Adicionando os componentes ao painel
        loginPanel.add(userLabel);
        loginPanel.add(userField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        // Painel para os botões
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancela");

        // Adicionando botões ao painel
        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);

        // Adicionando painéis ao JFrame
        add(loginPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Ação do botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());

                // Simples verificação de login
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Ação do botão de cancelar
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userField.setText("");
                passwordField.setText("");
            }
        });
    }

    
}
