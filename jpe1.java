import javax.swing.*;  
import java.awt.event.*;
public class jpe1 implements ActionListener
{  
static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;  
static JTextField t1,t2,t3,t4; 
static JFrame f;
static JButton b1,b2;
static JPasswordField p1,p2;
jpe1()
{
}
public static void main(String args[])  
    {  
  JFrame f= new JFrame("Mini project");  
   
jpe1 ob=new jpe1();    
   
    l1=new JLabel("Name");  
    l1.setBounds(50,50, 150,30); 
    t1=new JTextField(" ");  
    t1.setBounds(200,50,200,30);   
    

    l2=new JLabel("email");  
    l2.setBounds(50,100, 150,30);  
    t2=new JTextField(" ");  
    t2.setBounds(200,100,200,30);  

    l3=new JLabel("password");  
    l3.setBounds(50,150,150,30);  
    p1=new JPasswordField();  
    p1.setBounds(200,150,200,30);  

    l4=new JLabel("confirm password");  
    l4.setBounds(50,200, 150,30);  
    p2=new JPasswordField();  
    p2.setBounds(200,200,200,30);   

l5=new JLabel("");   
l5.setBounds(100,450,150,30);  

l6=new JLabel("");   
l6.setBounds(250,450,150,30);  

l7=new JLabel("");   
l7.setBounds(100,500,150,30);  

l8=new JLabel("");   
l8.setBounds(250,500,200,30);  

l9=new JLabel("Registration success"); 

l10=new JLabel("");     
l10.setBounds(100,375,150,30);  

l11=new JLabel("check password"); 

l12=new JLabel("");     
l12.setBounds(100,350,150,30);  

l13=new JLabel("Bye"); 
l14=new JLabel(""); 
l14.setBounds(100,400,150,30);  

  JButton b1=new JButton("Register");  
    b1.setBounds(100,300,95,30);  
    
b1.addActionListener(ob);

    JButton b2=new JButton("cancel");  
    b2.setBounds(250,300,95,30);  
b2.addActionListener(ob);   
f.add(l1); f.add(l2);      f.add(l3); f.add(l4);  f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);f.add(l12);f.add(l13);f.add(l14);
    f.add(t1); f.add(t2);        
    f.add(b1);   f.add(b2); f.add(p1);f.add(p2);

    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    }  
public void actionPerformed(ActionEvent e) 
{  
String st=e.getActionCommand();

if(st.equals("cancel"))
l14.setText(l13.getText());

if(st.equals("Register"))
{
if(p1.getText().equals(p2.getText()))
{
l10.setText(l9.getText());
l5.setText(l1.getText());
l6.setText(t1.getText());
l7.setText(l2.getText());
l8.setText(t2.getText());
}  
else
l12.setText(l11.getText());
}
}
}


    
 
  