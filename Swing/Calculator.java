/*    import javax.swing.*;    
    public class ButtonExample {  
    public static void main(String[] args) {  
        JFrame f=new JFrame(" This is the Button Example");  
        JButton b=new JButton("Click Here!!!");  
        b.setBounds(150,100,195,130);  
        f.add(b);  
        f.setSize(600,800);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    }  */
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    
    public class Calculator {
        // Create frame
        private JFrame frame;
        private JTextField textField;
        private String operator;
        private double firstNum, secondNum, result;
    
        // Constructor
        public Calculator() {
            frame = new JFrame("Simple Calculator");
            textField = new JTextField();
            operator = "";
            firstNum = secondNum = result = 0;
    
            // Set the layout of the frame
            frame.setLayout(new BorderLayout());
            frame.add(textField, BorderLayout.NORTH);
    
            // Panel for buttons
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid
    
            // Add buttons to the panel
            String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "c", "=", "+"
            };
    
            // Add buttons to panel
            for (String button : buttons) {
                JButton b = new JButton(button);
                b.addActionListener(new ButtonClickListener());
                panel.add(b);
            }
    
            frame.add(panel, BorderLayout.CENTER);
    
            // Set up frame properties
            frame.setSize(300, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    
        // Button click listener
        class ButtonClickListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = e.getActionCommand();
                
                if (text.equals("=")) {
                    secondNum = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+":
                            result = firstNum + secondNum;
                            break;
                        case "-":
                            result = firstNum - secondNum;
                            break;
                            case "c":
                             String textField = "";
                            break;
                        case "*":
                            result = firstNum * secondNum;
                            break;
                        case "/":
                            if (secondNum != 0) {
                                result = firstNum / secondNum;
                            } else {
                                textField.setText("Error");
                                return;
                            }
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    operator = "";
                } else if (text.equals("/") || text.equals("*") || text.equals("-") || text.equals("+")) {
                    operator = text;
                    firstNum = Double.parseDouble(textField.getText());
                    textField.setText("");
                } else {
                    textField.setText(textField.getText() + text);
                }
            }
        }
    
        // Main method to run the calculator
        public static void main(String[] args) {
            new Calculator();
        }
    }