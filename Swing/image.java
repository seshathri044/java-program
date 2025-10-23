import javax.swing.*;
import java.awt.*;

public class ImageInSwing {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Image in Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("path/to/your/image.png"); // Replace with your image path

        // Create a JLabel and set the icon
        JLabel label = new JLabel(imageIcon);

        // Optional: Set layout to null for custom positioning
        frame.setLayout(null);
        label.setBounds(50, 50, imageIcon.getIconWidth(), imageIcon.getIconHeight()); // Adjust position and size

        // Add JLabel to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}