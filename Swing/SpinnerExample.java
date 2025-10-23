    import javax.swing.*;    
    public class SpinnerExample {  
        public static void main(String[] args) {    
        JFrame f=new JFrame("Spinner Example");    
        SpinnerModel value =  
                 new SpinnerNumberModel(1, //initial value  
                    0, //minimum value  
                    1000, //maximum value  
                    10); //step  
        JSpinner spinner = new JSpinner(value);   
                spinner.setBounds(100,100,50,30);    
                f.add(spinner);    
                f.setSize(300,300);    
                f.setLayout(null);    
                f.setVisible(true);     
    }  
    }  