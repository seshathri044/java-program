    import javax.swing.*;  
    public class TabbedPaneExample {  
    JFrame f;  
	JLabel jl;

    TabbedPaneExample(){  
        f=new JFrame();  
	jl=new JLabel("Welcome to vist tab");
        JTextArea ta=new JTextArea(200,200);  
        JPanel p1=new JPanel();  
        p1.add(ta);  
        JPanel p2=new JPanel();
	p2.add(jl);  
        JPanel p3=new JPanel();  
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(50,50,200,200);  
        tp.add("main",p3);  
        tp.add("visit",p2);  
        tp.add("help",p1);    
        f.add(tp);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public static void main(String[] args) {  
        new TabbedPaneExample();  
    }}  