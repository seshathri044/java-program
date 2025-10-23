import javax.swing.*;  
import java.awt.event.*;  
public class swap1 implements ActionListener {  
JTextField tf1, tf2, tf3;  
JButton b1;   
swap1() 
{    
 JFrame f = new JFrame();           
 tf1 = new JTextField();  
 tf1.setBounds(50, 50, 150, 20);          
 tf2 = new JTextField();  
 tf2.setBounds(50, 100, 150, 20);          
 tf3 = new JTextField();  
 tf3.setBounds(50, 150, 150, 20);  
 tf3.setEditable(false);  
 b1 = new JButton("swap");  
 b1.setBounds(50, 200, 50, 50);          
 b1.addActionListener(this);  
 f.add(tf1);  
 f.add(tf2);    
 f.add(b1);    
 f.setSize(300, 300);  
 f.setLayout(null);
 f.setVisible(true);  
} 
public void actionPerformed(ActionEvent e) 
{       
 String s1 = tf1.getText();  
 String s2 = tf2.getText();          
 int a = Integer.parseInt(s1);  
 int b = Integer.parseInt(s2);                      
 int temp = 0;
 temp=a;
 a=b;
 b=temp;       
s1 = String.valueOf(a);
s2 = String.valueOf(b);         
 tf1.setText(s1);           
 tf2.setText(s2);  
        }  
        public static void main(String[] args) {  
            
            new swap1();  
        }  
    }  