import javax.swing.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class FrameOne extends JFrame { 
    public FrameOne() { 
        setTitle("Frame One"); 
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        JButton button = new JButton("Go to Frame Two"); 
        button.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                // Create and show the second frame 
                FrameTwo frameTwo = new FrameTwo(); 
                frameTwo.setVisible(true); 
                dispose(); // Close the current frame 
            } 
        }); 
 
        add(button); 
    } 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            FrameOne frameOne = new FrameOne(); 
            frameOne.setVisible(true); 
        }); 
    } 
} 