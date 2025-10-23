import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;     
class IconExample {     
    IconExample(){     
    Frame f=new Frame();     
    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\msesh\\OneDrive\\Pictures\\seshu");    
    f.setIconImage(icon);  
    BufferedImage myPicture = null;
    try {
        myPicture = ImageIO.read(new File("C:\\Users\\msesh\\OneDrive\\Pictures"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
   f.add(picLabel);
    f.setLayout(null);     
    f.setSize(400,400);     
    f.setVisible(true);     
    }     
    public static void main(String args[]){     
    new IconExample();     
    }     
    }    
