    import java.awt.event.*;  
    import javax.swing.*;    
    public class ButtonExample1 {  
    public static void main(String[] args) {  
        JFrame f=new JFrame("Button Example");  
        final JTextField tf=new JTextField();
	    final JTextField tf1=new JTextField();  
        tf.setBounds(50,50, 150,20);
        tf1.setBounds(50,150, 150,20);  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        b.addActionListener(new ActionListener()
	{  
    		public void actionPerformed(ActionEvent e)
		{  
                tf1.setText(tf.getText());  
            	}  
        });  
        f.add(b);f.add(tf);  f.add(tf1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    }  