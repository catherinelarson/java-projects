import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Click1 implements ActionListener {
  public void actionPerformed(ActionEvent event) {
    CatherineLarsonCalorieCalculator frame = new CatherineLarsonCalorieCalculator();
    frame.setTitle("calc");
    //use hide on close to not completely exit the program.
    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
