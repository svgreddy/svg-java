import javax.swing.*;  
class jp2
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Mini project");  
    JLabel l1,l2,l3,l4;  
    JTextField t1,t2,t3,t4;  
		    
 l1=new JLabel("Name.");  
    l1.setBounds(50,50, 150,30); 
		    
    t1=new JTextField(" ");  
t1.setBounds(200,50,200,30);   
    
    l2=new JLabel("email");  
    l2.setBounds(50,100, 150,30);  
    t2=new JTextField(" ");  
    t2.setBounds(200,100,200,30);  

    l3=new JLabel("Languages known");  
    l3.setBounds(50,150, 150,30);  

	JCheckBox cb1 = new JCheckBox("C");  
        cb1.setBounds(200,150,75,50);  
        JCheckBox cb2 = new JCheckBox("c++");  
        cb2.setBounds(275,150,75,50);  
	JCheckBox cb3 = new JCheckBox("java");  
        cb3.setBounds(350,150,75,50);  
        JCheckBox cb4 = new JCheckBox("python");  
        cb4.setBounds(425,150,75,50);  
        f.add(cb1);  
        f.add(cb2);  
        f.add(cb3);  
        f.add(cb4);  

   
    l4=new JLabel("Experience-years");  
    l4.setBounds(50,200, 150,30);  
    t4=new JTextField(" ");  
    t4.setBounds(200,200,200,30);  
    
    f.add(l1); f.add(l2);  f.add(l3); f.add(l4);  
    f.add(t1); f.add(t2);             f.add(t4);   
     

    JButton b1=new JButton("Apply");  
    b1.setBounds(100,300,95,30);  
    f.add(b1);  
    JButton b2=new JButton("cancel");  
    b2.setBounds(250,300,95,30);  
    f.add(b2);  
f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true); 
    
    }  
    }  




    
 
  