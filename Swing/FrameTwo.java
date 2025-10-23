import javax.swing.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

class FrameTwo extends JFrame { 
    public FrameTwo() { 
        setTitle("Frame Two"); 
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
 
        JLabel label = new JLabel("Welcome to Frame Two", SwingConstants.CENTER); 
        add(label); 
    } 
} 