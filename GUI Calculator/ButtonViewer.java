import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

class ButtonViewer {
  private static final int FRAME_WIDTH = 400;
  private static final int FRAME_HEIGHT = 150;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Button Viewer");
    JPanel panel1 = new JPanel();
    JButton button1 = new JButton("calorie calculator");
    JTextField textField = new JTextField();
    ActionListener listener1 = new Click1();

    frame.setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.insets = new Insets(10,10,10,10);

    panel1.add(button1);
    frame.add(panel1, constraints);
    button1.addActionListener(listener1);

    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setResizable(false);
    frame.setVisible(true);
  }
}
