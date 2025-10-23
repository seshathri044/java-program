import java.awt.*;  
import javax.swing.JFrame;  
  
public class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) {  
        g.drawString("Hello Welcome to the class",40,40);  
        setBackground(Color.CYAN);  
        g.fillRect(130, 130,100, 80);  
        setForeground(Color.GREEN);  
	 g.drawOval(30,130,50, 60);  
       
        g.fillOval(230,230,50, 60);  
      //  setForeground(Color.RED);
	g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
          
    }  
        public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
} 