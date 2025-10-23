import java.io.*;  
import javax.swing.*;  
import java.awt.event.*;  
import javax.swing.filechooser.*;  
class HelloWorld  
{  
public static void main(String[] args) {  
        // creating object to the JFileChooser class  
         JFileChooser jf = new JFileChooser("c:"); // parameterised constructor JFileChooser(File currentDirectory, FileSystemViewfsv) is called.  
        jf.showSaveDialog(null); // opening the saved dialogue  
    }  
}  