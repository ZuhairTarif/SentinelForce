import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//2nd page:Label-2,Text Field-2,Button-2,Panel-1

public class Form15 extends JFrame implements ActionListener
{
	JLabel l1,l2,lb;
	JTextField t1,t2;
	JButton b1,b2;
	JPanel p1;

 public Form15()
 {
	 super("Crime Management System");
	 this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		this.add(p1);
		
	lb = new JLabel("***Police Login***");
		lb.setForeground(Color.YELLOW);
		lb.setBounds(850,150,350,50);
		lb.setFont(new Font("Diploma regular",Font.PLAIN,30));
		p1.add(lb);
	
	l1 = new JLabel("Police Name: ");
		l1.setForeground(Color.YELLOW);
		l1.setBounds(770,350,150,50);
		l1.setFont(new Font("Bonveno Cf",Font.PLAIN,15));
		p1.add(l1);

    l2 = new JLabel("Police ID: ");
		l2.setForeground(Color.YELLOW);
		l2.setBounds(770,450,150,50);
		l2.setFont(new Font("Bonveno Cf",Font.PLAIN,15));
		p1.add(l2);		
		
	t1 = new JTextField();
    t1.setBounds(950,350,100,30);
	p1.add(t1);
	
	t2 = new JTextField();
	t2.setBounds(950,450,100,30);
	p1.add(t2);
	
	b1 = new JButton("Back");
		b1.setForeground(Color.red);
        b1.setBounds(650,650,200,100);		
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b1.addActionListener(this);
		p1.add(b1);

	b2 = new JButton("Submit");
		b2.setForeground(Color.red);
        b2.setBounds(1050,650,200,100);		
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
		b2.addActionListener(this);
		p1.add(b2);	
}	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{Form1 f = new Form1();
		this.setVisible(false);
		f.setVisible(true);}
		else if(ae.getSource()==b2)
		{Form16 f = new Form16();
		this.setVisible(false);
		f.setVisible(true);}
		}
		
	}	