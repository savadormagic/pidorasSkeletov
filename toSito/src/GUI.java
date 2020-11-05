import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  extends JFrame {

    private JButton button1 = new JButton("add");
    private JButton button2 = new JButton("show one");
    private JButton button3 = new JButton("show all");
    private JButton button4 = new JButton("exit");
    private JLabel label1 = new JLabel("Input: ");
    private JLabel label2 = new JLabel("Input2: ");
    private JTextField textField1 = new JTextField("", 15);

    public GUI(){
        super("test");
        this.setBounds(100,100,400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 3, 2,2));

/*        container.add(label1);
        container.add(textField1);*/
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);

        button1.addActionListener(new ButtonEventListener());

    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(GUI.this, "as");
        }
    }
}