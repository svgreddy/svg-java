import java.awt.*;  
import javax.swing.*;  
class jpbl
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Mini project");  
    JLabel l1,l2,l3,l4;  
    JTextField t1,t2,t3,t4;  

        f.setLayout(new BorderLayout());         
    
  
    t1=new JTextField("Name");  
	f.getContentPane().add(BorderLayout.NORTH, t1);     
 

    
    t2=new JTextField("e mail"); 
f.getContentPane().add(BorderLayout.SOUTH, t2);      

    
    t3=new JTextField("password");  
f.getContentPane().add(BorderLayout.EAST, t3);


    t4=new JTextField("confirm password");  
f.getContentPane().add(BorderLayout.WEST, t4);
     

    JButton b1=new JButton("Register");  

f.getContentPane().add(BorderLayout.CENTER, b1);
f.pack(); 
    
    
    
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true); 
    }  
    }  




    
 
  