import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava {
    private JPanel panelMain;
    private JLabel lblMensagem;
    private JTextField txtName;
    private JButton btnClick;

    public OlaMundoJava() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            lblMensagem.setText("Olá Mundo");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
