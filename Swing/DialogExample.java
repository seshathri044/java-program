import java.awt.event.*;
import javax.swing.*;
class DialogExample extends JFrame implements ActionListener {
static JFrame frame;
public static void main(String[] args)
{
frame = new JFrame("JFrame");
DialogExample t = new DialogExample();
JPanel panel = new JPanel();
JButton button = new JButton("click here to see dialog box");
button.addActionListener(t);
panel.add(button);
frame.add(panel);
frame.setSize(400, 400);
frame.setVisible();
}
@Override
public void actionPerformed(ActionEvent e)
{
String s = e.getActionCommand();
if (s.equals("click here to see dialog box")) {
JDialog dialog = new JDialog(frame, "JDialog Box");
JLabel lab = new JLabel("This is a dialog box inside frame..");
dialog.add(lab);
dialog.setSize(300, 300);
dialog.setVisible(true);
}
} }