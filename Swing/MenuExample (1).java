    import javax.swing.*;  
    class MenuExample  
    {  
              JMenu menu, submenu, menu1;  
              JMenuItem i1, i2, i3, i4, i5,i6,i7; 
 
              MenuExample()
              {  
              JFrame f= new JFrame("Menu and MenuItem Example");  
              JMenuBar mb=new JMenuBar();  
              menu=new JMenu("Menu");
              submenu=new JMenu("Sub Menu");  
              i1=new JMenuItem("Item 1");  
              i2=new JMenuItem("Item 2");  
              i3=new JMenuItem("Item 3");  
              i4=new JMenuItem("Item 4");  
              i5=new JMenuItem("Item 5");  
              menu1=new JMenu("Edit");
		i6=new JMenuItem("Cut");
		i7=new JMenuItem("Copy");
		menu.add(i1); menu.add(i2); menu.add(i3);  
		menu1.add(i6);menu1.add(i7);
              submenu.add(i4); submenu.add(i5);  
              menu.add(submenu);  
              mb.add(menu);  
		mb.add(menu1);
              f.setJMenuBar(mb);  
              f.setSize(400,400);  
              f.setLayout(null);  
              f.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
    new MenuExample();  
    }}  