import java.awt.*;
import javax.swing.*;  
class jpfl
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Mini project");  
    JLabel l1,l2,l3,l4;  
    JTextField t1,t2,t3,t4;  

f.getContentPane().setLayout(new FlowLayout());
 l1=new JLabel("Name.");  
f.getContentPane().add(l1);
		    
    t1=new JTextField("                      ");  
 
 f.getContentPane().add(t1);

    l2=new JLabel("email");  
f.getContentPane().add(l2);
    t2=new JTextField("                      ");  
f.getContentPane().add(t2);
    l3=new JLabel("Languages known");  
f.getContentPane().add(l3);
	JCheckBox cb1 = new JCheckBox("C");  
f.getContentPane().add(cb1);
        JCheckBox cb2 = new JCheckBox("c++");  
f.getContentPane().add(cb2);
	JCheckBox cb3 = new JCheckBox("java");  
f.getContentPane().add(cb3);
        JCheckBox cb4 = new JCheckBox("python");  
f.getContentPane().add(cb4);

   
    l4=new JLabel("Experience-years");  
f.getContentPane().add(l4);
    t4=new JTextField("                     ");  
f.getContentPane().add(t4);
    JButton b1=new JButton("Apply");  
    f.getContentPane().add(b1);

    JButton b2=new JButton("cancel");  
f.getContentPane().add(b2);
f.pack();
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  


    
    }  
    }  




    
 
  