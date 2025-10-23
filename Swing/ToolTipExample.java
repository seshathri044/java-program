    import javax.swing.*;    
    public class ToolTipExample {  
        public static void main(String[] args) {    
         JFrame f=new JFrame("Password Field Example");    
         //Creating PasswordField and label  
         JPasswordField value = new JPasswordField();   
 JLabel jl = new JLabel("hai");   
	jl.setBounds(200,200,100,30);
	jl.setToolTipText("this is the label box");
         value.setBounds(100,100,100,30);    
         value.setToolTipText("Enter your Password");  
         JLabel l1=new JLabel("Password:");    
         l1.setBounds(20,100, 80,30);    
         //Adding components to frame  
         f.add(value);  f.add(l1);  
	f.add(jl);
         f.setSize(300,300);    
         f.setLayout(null);    
         f.setVisible(true);      
    }  
    }  