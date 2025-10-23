import java.awt.*;

import javax.swing.JFrame;     
class IconExample {     
    IconExample(){     
    JFrame f = new JFrame();     
    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\msesh\\OneDrive\\Pictures\\photo.jpg");    
    f.setIconImage(icon);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);     
    f.setSize(400,400);     
    f.setVisible(true);     
    }     
    public static void main(String args[]){     
    new IconExample();     
    }     
    }    
