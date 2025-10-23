import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class calc implements ActionListener
{
JFrame f = new JFrame("calculator");
JLabel l1,l2,l3,l;
JPanel panel;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b6,cb,buttons;
//JScrollBar s;
JPopupMenu popupmenu;
calc()
{
text();
//scroll();
//pop();
button();
label();
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
cb.addActionListener(this);
f.add(panel);
f.add(buttons);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(cb);
f.add(l1);
f.add(l2);
f.add(l3);
//f.add(s); 
//f.add(label); 
f.setSize(500, 500);
f.setLayout(new BorderLayout());  //if you add layout remove this line  
f.setVisible(true);
//f.add(popupmenu);
}
private void text()
{
t1 = new JTextField();
t1.setBounds(50, 50, 100, 40);
t2 = new JTextField();
t2.setBounds(50, 120, 100, 40);
t3 = new JTextField();
t3.setBounds(300, 100, 100, 40);
}
public void label()
{
  l1 = new JLabel("num1");
  l1.setBounds(160,50,100,40);
  l2 = new JLabel("num2");
  l2.setBounds(160, 120, 100, 40);
  l3 = new JLabel("answer");
  l3.setBounds(300,60,100,40);
}
/*public void scroll()
{
  f.getContentPane().setLayout(new FlowLayout());  
  JTextArea textArea = new JTextArea(20, 20);  
  JScrollPane scrollableTextArea = new JScrollPane(textArea);
  scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
  scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  f.getContentPane().add(scrollableTextArea);         
} */
/*public void pop()
{
  final JPopupMenu popupmenu = new JPopupMenu("Edit");   
  JMenuItem cut = new JMenuItem("Cut");  
  JMenuItem copy = new JMenuItem("Copy");  
  JMenuItem paste = new JMenuItem("Paste");  
  popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);
}*/
public void button()
{
  /*b1 = new JButton("+");
  b1.setBounds(150, 200, 100 ,40);
  b2 = new JButton("-");
  b2.setBounds(280, 200, 100, 40);
  b3 = new JButton("*");
  b3.setBounds(150, 250, 100, 40);
  b4 = new JButton("/");
  b4.setBounds(280, 250, 100, 40);
  cb = new JButton("Clear");
  cb.setBounds(220,300,100,40);*/
  JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 4, 10, 10)); 
  String[] buttons = {
    "7", "8", "9", "/",
    "4", "5", "6", "*",
    "1", "2", "3", "-",
    "0", "c", "=", "+"
};

// Add buttons to panel
for (String button : buttons) {
    JButton b = new JButton(button);
    b.addActionListener((ActionListener) new ButtonClickListener());
    panel.add(b);
}
}
public void actionPerformed(ActionEvent e)
{
JButton actionSource = (JButton) e.getSource();
if(actionSource.equals(b1))
{
String s1 = t1.getText();
String s2 = t2.getText();
String s3; 
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a+b;
s3 = String.valueOf(c);
t3.setText(s3);
}
if(actionSource.equals(b2))
{
String s1 = t1.getText();
String s2 = t2.getText();
String s3; 
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a-b;
s3 = String.valueOf(c);
t3.setText(s3);
}
if(actionSource.equals(b3))
{
String s1 = t1.getText();
String s2 = t2.getText();
String s3; 
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a*b;
s3 = String.valueOf(c);
t3.setText(s3);
}
if(actionSource.equals(b4))
{
String s1 = t1.getText();
String s2 = t2.getText();
String s3; 
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = a/b;
s3 = String.valueOf(c);
t3.setText(s3);
if(actionSource.equals(cb))
{
  if (e.getSource() == cb)
  t1.setText("");
  t2.setText("");
  t3.setText("");
}
}
}
public static void main(String args[]) 
{  
  new calc();
        }    
}


