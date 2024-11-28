import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {

    // Declaração dos componentes
    private JFrame frame;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    // Construtor da tela de login
    public TelaLogin() {
        // Criar a janela principal
        frame = new JFrame("Tela de Login");

        // Criar os campos de texto e o botão
        txtUsuario = new JTextField(20);
        txtSenha = new JPasswordField(20);
        btnEntrar = new JButton("Entrar");

        // Configuração do layout (usando FlowLayout neste caso)
        frame.setLayout(new FlowLayout());

        // Adicionar componentes ao frame
        frame.add(new JLabel("Usuário:"));
        frame.add(txtUsuario);
        frame.add(new JLabel("Senha:"));
        frame.add(txtSenha);
        frame.add(btnEntrar);

        // Configurar a janela para ser fechada corretamente
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar o tamanho da janela
        frame.setSize(300, 150);

        // Centralizar a janela na tela
        frame.setLocationRelativeTo(null);

        // Tornar a janela visível
        frame.setVisible(true);

        // Adicionar ação para o botão de login
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter o usuário e senha inseridos
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());

                // Validar as credenciais (exemplo simples)
                if (usuario.equals("admin") && senha.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                    // Aqui, você pode adicionar a lógica para abrir a próxima tela
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário ou senha inválidos.");
                }
            }
        });
    }

    
}
