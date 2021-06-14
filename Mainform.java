import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
class Main implements ActionListener
{
	JFrame frm;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5,m6,m7,m8;
	JMenuItem op1,op2,op3,op4,op5,op6,op7,op8,op9,op10,op11,op12,op13,op14,op15,op16,op17,op18,op19,op20;
	ImageIcon img;
	JLabel lpic1;
	Main()
	{
		frm=new JFrame("My Menu");
		mb=new JMenuBar();
		frm.setLayout(new BorderLayout());
		frm.add("North",mb);
		img=new ImageIcon("pcture.jpg");
		lpic1=new JLabel(img);
		lpic1.setBounds(1,1,1700,1000);
		m1=new JMenu("Student");
		m2=new JMenu("Course");
		m3=new JMenu("Faculty");
		m4=new JMenu("Report");
		m5=new JMenu("Salary");
		m6=new JMenu("Fee");
		m7=new JMenu("Security");
		m8=new JMenu("Exit");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m5);
		mb.add(m6);
		mb.add(m4);
		mb.add(m7);
		mb.add(m8);
		op1=new JMenuItem("Add Student Information");
		op2=new JMenuItem("Edit Student Information");
		op3=new JMenuItem("Search Student Information");
		op4=new JMenuItem("Add Course Information");
		op5=new JMenuItem("Edit Course Information");
		op6=new JMenuItem("Search Course Information");
		op7=new JMenuItem("Add Faculty Information");
		op8=new JMenuItem("Edit Faculty Information");
		op9=new JMenuItem("Search Faculty Information");
		op10=new JMenuItem("Salary Slip Information");
		op11=new JMenuItem("Search Salary Information");
		op12=new JMenuItem("Fee Slip Information");
		op13=new JMenuItem("Search Fee Information");
		op14=new JMenuItem("List of Student");
		op15=new JMenuItem("List of Course");
		op16=new JMenuItem("List of Faculty");
		op17=new JMenuItem("Change Password");
		op18=new JMenuItem("Yes");
		op19=new JMenuItem("No");
		m1.add(op1);
		m1.add(op2);
		m1.add(op3);
		m2.add(op4);
		m2.add(op5);
		m2.add(op6);
		m3.add(op7);
		m3.add(op8);
		m3.add(op9);
		m5.add(op10);
		m4.add(op14);
		m4.add(op15);
		m4.add(op16);
		m5.add(op11);
		
		m6.add(op12);
		m6.add(op13);
		m7.add(op17);
		m8.add(op18);
		m8.add(op19);
		
		frm.add(lpic1);
		frm.setBounds(1,1,1700,1000);
		frm.show();
		
		//Generating events
		
		op1.addActionListener(this);
		op2.addActionListener(this);
		op3.addActionListener(this);
		op4.addActionListener(this);
		op5.addActionListener(this);
		op6.addActionListener(this);
		op7.addActionListener(this);
		op8.addActionListener(this);
		op9.addActionListener(this);
		op10.addActionListener(this);
		op11.addActionListener(this);
		op12.addActionListener(this);
		op13.addActionListener(this);
		op14.addActionListener(this);
		op15.addActionListener(this);
		op16.addActionListener(this);
		op17.addActionListener(this);
		op18.addActionListener(this);
		op19.addActionListener(this);
		
		
		
	}
	public  void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==op1)
		{
			AddStudent obj=new AddStudent();
		}
		if(e.getSource()==op2)
		{
			EditStudent obj=new EditStudent();
		}
		if(e.getSource()==op3)
		{
			SearchStudent obj=new SearchStudent();
		}
		if(e.getSource()==op4)
		{
			AddCourse obj=new AddCourse();
		}
		if(e.getSource()==op5)
		{
			Editcourse obj=new Editcourse();
		}
		if(e.getSource()==op6)
		{
			Searchcourse obj=new Searchcourse();
		}
		if(e.getSource()==op7)
		{
			Addfaculty obj=new Addfaculty();
		}
		if(e.getSource()==op8)
		{
			Editfaculty obj=new Editfaculty();
		}
		if(e.getSource()==op9)
		{
			Searchfaculty obj=new Searchfaculty();
		}
		if(e.getSource()==op10)
		{
			Salaryslip obj=new Salaryslip();
		}
		if(e.getSource()==op11)
		{
			Salarysearch obj=new Salarysearch();
		}
		if(e.getSource()==op12)
		{
			Feeslip obj=new Feeslip();
		}
		if(e.getSource()==op13)
		{
			Fee obj=new Fee();
		}
		if(e.getSource()==op14)
		{
			Liststudent obj=new Liststudent();
		}
		if(e.getSource()==op15)
		{
			Listcourse obj=new Listcourse();
		}
		if(e.getSource()==op16)
		{
			Listfaculty obj=new Listfaculty();
		}
		if(e.getSource()==op17)
		{
			Changepsword obj=new Changepsword();
		}
		if(e.getSource()==op18)
		{
			System.exit(0);
		}
	}
}

// Add student

class AddStudent implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton save,exit;
	JTextField txtrno,txtname,txtmname,txtfname,txtdob,txtcontect,txtemail,txtcourse,txtaddress;
	JComboBox cb;
	AddStudent()
	{
		frm=new JFrame("AddStudent Form");
		l1=new JLabel("Rollno");
		l2=new JLabel("Name");
		l3=new JLabel("Fname");
		l4=new JLabel("Mname");
		l5=new JLabel("gender");
		l6=new JLabel("Date of birth");
		l7=new JLabel("contect no");
		l8=new JLabel("Email ID");
		l9=new JLabel("course");
		l10=new JLabel("address");
		txtrno =new JTextField(20);
		txtname=new JTextField(20);
		txtfname=new JTextField(20);
		txtmname=new JTextField(20);
		txtdob=new JTextField(20);
		txtcontect=new JTextField(20);
		txtemail=new JTextField(20);
		txtcourse=new JTextField(20);
		txtaddress=new JTextField(20);
        cb=new JComboBox();
		cb.addItem(" ");
		cb.addItem("male");
		cb.addItem("female");
		save =new JButton("save");
		exit=new JButton("Exit");
		frm.setLayout(new GridLayout(11,2));
		frm.add(l1);
		frm.add(txtrno);
		frm.add(l2);
		frm.add(txtname);
		frm.add(l3);
		frm.add(txtfname);
		frm.add(l4);
		frm.add(txtmname);
		frm.add(l5);
		frm.add(cb);
		frm.add(l6);
		frm.add(txtdob);
		frm.add(l7);
		frm.add(txtcontect);
		frm.add(l8);
		frm.add(txtemail);
		frm.add(l9);
		frm.add(txtcourse);
		frm.add(l10);
		frm.add(txtaddress);
		frm.add(save);
		frm.add(exit);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(300,200,400,450);
		frm.show();
		save.addActionListener(this);
		exit.addActionListener(this);

		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(400,300,400,300);
		frm.show();
		}
		public void actionPerformed(ActionEvent e)
		{
  		if(e.getSource()==save)
  		{
    		 int rollno;
	 		String name,fname,mname,gender,dob,contactno,emailid,course,address;
	 		try
	 		{
	 		rollno=Integer.parseInt(txtrno.getText());
	 		name=txtname.getText();
	 		fname=txtfname.getText();
	 		mname=txtmname.getText();
	 		gender=cb.getSelectedItem().toString();
	 		dob=txtdob.getText();
	 		contactno=txtcontect.getText();
	 		emailid=txtemail.getText();
	 		course=txtcourse.getText();
	 		address=txtaddress.getText();
	 		
  		//connectivity
  		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  		Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
  		Statement stmt=cn.createStatement();
  		String query="insert into studenttable values("+rollno+",'"+name+"','"+fname+"','"+mname+"','"+gender+"','"+dob+"','"+contactno+"','"+emailid+"','"+course+"','"+address+"')";
  		stmt.executeUpdate(query);
  		JOptionPane.showMessageDialog(null,"data stored");
  		}
  		catch(Exception e2)
  		{JOptionPane.showMessageDialog(null,e2.getMessage());}
  		}
  		else if(e.getSource()==exit)
  		frm.dispose();
  		}
  		}
  

//Edit Student
class EditStudent implements ActionListener
{
  JFrame frm;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
  JButton exit,ok,delete,update;
  JTextField txtrno,txtname,txtmname,txtfname,txtdob,txtcontect,txtgender,txtemail,txtcourse,txtaddress;
   EditStudent()
  {
    frm=new JFrame("EditStudent Form");
    l1=new JLabel("Enter Rollno");
    l2=new JLabel("Name");
    l3=new JLabel("Fname");
    l4=new JLabel("Mname");
    l5=new JLabel("Date of birth");
    l6=new JLabel("contect no");
    l7=new JLabel("Email ID");
    l8=new JLabel("course");
    l9=new JLabel("address");
    l10=new JLabel("gender");
    txtrno =new JTextField(20);
    txtname=new JTextField(20);
    txtfname=new JTextField(20);
    txtmname=new JTextField(20);
    txtdob=new JTextField(20);
    txtgender=new JTextField(20);
    txtcontect=new JTextField(20);
    txtemail=new JTextField(20);
    txtcourse=new JTextField(20);
    txtaddress=new JTextField(20);
    delete=new JButton("Delete");
    update=new JButton("update");
    ok=new JButton("OK");
    exit=new JButton("Exit");
    frm.setLayout(new GridLayout(12,2));
    frm.add(l1);
    frm.add(txtrno);
	frm.add(ok);
	frm.add(exit);
    frm.add(l2);
    frm.add(txtname);
    frm.add(l3);
    frm.add(txtfname);
    frm.add(l4);
    frm.add(txtmname);
    frm.add(l5);
    frm.add(txtdob);
    frm.add(l6);
    frm.add(txtcontect);
    frm.add(l7);
    frm.add(txtemail);
    frm.add(l8);
    frm.add(txtcourse);
    frm.add(l9);
    frm.add(txtaddress);
	frm.add(l10);
    frm.add(txtgender);
    frm.add(delete);
    frm.add(update);
    frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
    frm.setBounds(300,200,400,450);
    frm.show();
	ok.addActionListener(this);
	exit.addActionListener(this);
	delete.addActionListener(this);
	update.addActionListener(this);
   }
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int rno,name;
				rno=Integer.parseInt(txtrno.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="select *from studenttable where rollno="+rno;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtrno.setText(res.getString("rollno"));
					txtname.setText(res.getString("name"));
					txtfname.setText(res.getString("Fname"));
					txtmname.setText(res.getString("Mname"));
					txtdob.setText(res.getString("dob"));
					txtcontect.setText(res.getString("contactno"));
					txtemail.setText(res.getString("Emailid"));
					txtcourse.setText(res.getString("Course"));
					txtaddress.setText(res.getString("Address"));
					txtgender.setText(res.getString("gender"));
					
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{ JOptionPane.showMessageDialog(null,e2.getMessage());}
		}
		else if(e.getSource()==delete)
		{
			try
			{
				int rno;
				rno=Integer.parseInt(txtrno.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="delete from studenttable where rollno="+rno;
				stmt.executeUpdate(query);
				txtrno.setText("");
				txtname.setText("");
				txtmname.setText("");
				txtfname.setText("");
				txtdob.setText("");
				txtcontect.setText("");
				txtcourse.setText("");
				txtaddress.setText("");
				txtgender.setText("");
				JOptionPane.showMessageDialog(null,"Data deleted");
			}
			catch(Exception e3)
			{}
		}
		else if(e.getSource()==update)
		{
			try
			{
				int rno;
				String name,mname,fname,dob,contect,course,address,email,gender;
				rno=Integer.parseInt(txtrno.getText());
				
				name=(txtname.getText());
				mname=(txtmname.getText());
				fname=(txtfname.getText());
				dob=(txtdob.getText());
				contect=(txtcontect.getText());
				gender=(txtgender.getText());
				email=(txtemail.getText());
				course=(txtcourse.getText());
				address=(txtaddress.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				
				String query=("update studenttable set name='"+name+"',fname='"+fname+"',mname='"+mname+"',gender='"+gender+"',dob='"+dob+"',contactno='"+contect+"',emailid='"+email+"',course='"+course+"',address='"+address+"' where rollno="+rno);
				stmt.executeUpdate(query);
				txtrno.setText("");
				txtname.setText("");
				txtmname.setText("");
				txtfname.setText("");
				txtdob.setText("");
				txtcontect.setText("");
				txtemail.setText("");
				txtcourse.setText("");
				txtaddress.setText("");
				
				JOptionPane.showMessageDialog(null,"Data updated");
			}
			catch(Exception e3)
			{JOptionPane.showMessageDialog(null,e3.getMessage());}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
			
	}
	}

//Search student
class SearchStudent implements ActionListener
{
  JFrame frm;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
  JButton exit,ok;
  JTextField txtrno,txtname,txtmname,txtfname,txtdob,txtcontect,txtgender,txtemail,txtcourse,txtaddress;
   SearchStudent()
  {
    frm=new JFrame("Search Student Form");
    l1=new JLabel("Enter Rollno");
    l2=new JLabel("Name");
    l3=new JLabel("Fname");
    l4=new JLabel("Mname");
    l5=new JLabel("Date of birth");
    l6=new JLabel("contect no");
    l7=new JLabel("Email ID");
    l8=new JLabel("course");
    l9=new JLabel("address");
    l10=new JLabel("gender");
    txtrno =new JTextField(20);
    txtname=new JTextField(20);
    txtfname=new JTextField(20);
    txtmname=new JTextField(20);
    txtdob=new JTextField(20);
    txtgender=new JTextField(20);
    txtcontect=new JTextField(20);
    txtemail=new JTextField(20);
    txtcourse=new JTextField(20);
    txtaddress=new JTextField(20);
    ok=new JButton("ok");
    exit=new JButton("Exit");
    frm.setLayout(new GridLayout(11,2));
    frm.add(l1);
    frm.add(txtrno);
	frm.add(ok);
	frm.add(exit);
    frm.add(l2);
    frm.add(txtname);
    frm.add(l3);
    frm.add(txtfname);
    frm.add(l4);
    frm.add(txtmname);
    frm.add(l5);
    frm.add(txtdob);
    frm.add(l6);
    frm.add(txtcontect);
    frm.add(l7);
    frm.add(txtemail);
    frm.add(l8);
    frm.add(txtcourse);
    frm.add(l9);
    frm.add(txtaddress);
	frm.add(l10);
    frm.add(txtgender);
    
    frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
    frm.setBounds(300,200,400,450);
    frm.show();
	ok.addActionListener(this);
	exit.addActionListener(this);
		
   }
	 public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int rno,name;
				rno=Integer.parseInt(txtrno.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="select *from studenttable where rollno="+rno;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtrno.setText(res.getString("rollno"));
					txtname.setText(res.getString("name"));
					txtfname.setText(res.getString("Fname"));
					txtmname.setText(res.getString("Mname"));
					txtgender.setText(res.getString("gender"));
					txtdob.setText(res.getString("dob"));
					txtcontect.setText(res.getString("contactno"));
					txtemail.setText(res.getString("emailid"));
					txtcourse.setText(res.getString("course"));
					txtaddress.setText(res.getString("address"));
					
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
					
	}
}
// Add Course

class AddCourse implements ActionListener
{
  JFrame frm;
  JLabel l1,l2,l3;
  JButton save,exit;
  JTextField txtcoursecode,txtcoursename,txtduration;
  AddCourse()
 {
	frm=new JFrame("Add new course");
	l1=new JLabel("Enter course code");
	l2=new JLabel("course name");
	l3=new JLabel("duration");
	txtcoursecode=new JTextField(20);
	txtcoursename=new JTextField(20);
	txtduration=new JTextField(20);
	save=new JButton("SAVE");
	exit=new JButton("EXIT");
	
	frm.setLayout(new GridLayout(4,2));
	frm.add(l1);
	frm.add(txtcoursecode);
	
	frm.add(l2);
	frm.add(txtcoursename);
	frm.add(l3);
	frm.add(txtduration);
	frm.add(save);
	frm.add(exit);
	frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	frm.setBounds(400,300,400,300);
	frm.show();
	save.addActionListener(this);
	exit.addActionListener(this);
  }
	public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==save)
     {
     int code,duration;
	 String cname;
	 try
	 {
	   code=Integer.parseInt(txtcoursecode.getText());
	   duration=Integer.parseInt(txtduration.getText());
	   cname=txtcoursename.getText();
	   //connectivity
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
       Statement stmt=cn.createStatement();
       String query="insert into coursetable values("+code+",'"+cname+"',"+duration+")";
       stmt.executeUpdate(query);
       JOptionPane.showMessageDialog(null,"data stored");
      }
      catch(Exception e2)
  {JOptionPane.showMessageDialog(null,e2.getMessage());}
  }
  else if(e.getSource()==exit) 
		frm.dispose();
    
  }
}
// Edit Course
class Editcourse implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3;
	JButton exit,ok,update,delete;
	JTextField txtcoursecode,txtcoursename,txtduration;
	Editcourse()
	{
		frm=new JFrame("Edit course");
		l1=new JLabel("Enter course code");
		l2=new JLabel("course name");
		l3=new JLabel("Duration");
		txtcoursecode=new JTextField(20);
		txtcoursename=new JTextField(20);
		txtduration=new JTextField(20);
		ok=new JButton("ok");
		exit=new JButton("exit");
		delete=new JButton("delete");
		update=new JButton("update");
		frm.setLayout(new GridLayout(5,2));
		frm.add(l1);
		frm.add(txtcoursecode);
		frm.add(ok);
		frm.add(exit);
		frm.add(l2);
		frm.add(txtcoursename);
		frm.add(l3);
		frm.add(txtduration);
		frm.add(delete);
		frm.add(update);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(400,300,400,300);
		frm.show();
		ok.addActionListener(this);
		exit.addActionListener(this);
		delete.addActionListener(this);
		update.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int code;
				code=Integer.parseInt(txtcoursecode.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="select *from coursetable where coursecode="+code;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtcoursename.setText(res.getString("coursename"));
					txtduration.setText(res.getString("duration"));
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{}
		}
		else if(e.getSource()==delete)
		{
			try
			{
				int code;
				code=Integer.parseInt(txtcoursecode.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="delete from coursetable where coursecode="+code;
				stmt.executeUpdate(query);
				txtcoursecode.setText("");
				txtcoursename.setText("");
				txtduration.setText("");
				JOptionPane.showMessageDialog(null,"Data deleted");
			}
			catch(Exception e3)
			{}
		}
		else if(e.getSource()==update)
		{
			try
			{
				int code,duration;
				String name;
				code=Integer.parseInt(txtcoursecode.getText());
				duration=Integer.parseInt(txtduration.getText());
				name=(txtcoursename.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				
				String query="update coursetable set coursename='"+name+"',duration="+duration+" where coursecode="+code;
				stmt.executeUpdate(query);
				txtcoursecode.setText("");
				txtcoursename.setText("");
				txtduration.setText("");
				JOptionPane.showMessageDialog(null,"Data updated");
			}
			catch(Exception e3)
			{}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
		
			
	}
}	
//search course
class Searchcourse implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3;
	JButton exit,ok;
	JTextField txtcoursecode,txtcoursename,txtduration;
	Searchcourse()
	{
		frm=new JFrame("Search course");
		l1=new JLabel("Enter course code");
		l2=new JLabel("course name");
		l3=new JLabel("Duration");
		txtcoursecode=new JTextField(20);
		txtcoursename=new JTextField(20);
		txtduration=new JTextField(20);
		ok=new JButton("ok");
		exit=new JButton("exit");
		frm.setLayout(new GridLayout(4,2));
		frm.add(l1);
		frm.add(txtcoursecode);
		frm.add(ok);
		frm.add(exit);
		frm.add(l2);
		frm.add(txtcoursename);
		frm.add(l3);
		frm.add(txtduration);
		
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(400,300,400,300);
		frm.show();
		ok.addActionListener(this);
		exit.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int code;
				code=Integer.parseInt(txtcoursecode.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="select *from coursetable where coursecode="+code;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtcoursename.setText(res.getString("coursename"));
					txtduration.setText(res.getString("duration"));
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
	
		
}
}	
//Add Faculty
class Addfaculty implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton exit,save;
	JTextField txtid,txtname,txtgen,txtcon,txtqual,txtadd;	
	Addfaculty()
	{
		frm=new JFrame("Add new faculty");
		l1=new JLabel("Faculty id");
		l2=new JLabel("name");
		l3=new JLabel("Gender");
		l4=new JLabel("contact no");
		l5=new JLabel("Qualification");
		l6=new JLabel("address");
		txtid=new JTextField(20);
		txtname=new JTextField(20);
		txtgen=new JTextField(20);
		txtcon=new JTextField(20);
		txtqual=new JTextField(20);
		txtadd=new JTextField(20);
		save=new JButton("save");
		exit=new JButton("exit");
		frm.setLayout(new GridLayout(7,2));
		frm.add(l1);
		frm.add(txtid);
		frm.add(l2);
		frm.add(txtname);
		frm.add(l3);
		frm.add(txtgen);
		frm.add(l4);
		frm.add(txtcon);
		frm.add(l5);
		frm.add(txtqual);
		frm.add(l6);
		frm.add(txtadd);
		frm.add(save);
		frm.add(exit);
		save.addActionListener(this);
		exit.addActionListener(this);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(400,300,400,300);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
  	if(e.getSource()==save)
  		{
     		int id;
	 		String name,gen,con,qual,add;
	 		try
	 		{
	 		id=Integer.parseInt(txtid.getText());
	 		name=txtname.getText();
	 		gen=txtgen.getText();
	 		con=txtcon.getText();
	 		qual=txtqual.getText();
	 		add=txtadd.getText();
  			//connectivity
  			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  			Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
  			Statement stmt=cn.createStatement();
  			String query="insert into facultytable values("+id+",'"+name+"','"+gen+"','"+con+"','"+qual+"','"+add+"')";
  			stmt.executeUpdate(query);
  			JOptionPane.showMessageDialog(null,"data stored");
  			}
 			 catch(Exception e2)
  			{JOptionPane.showMessageDialog(null,e2.getMessage());}
  		}
  		else if(e.getSource()==exit) 
		frm.dispose();
  		
  	}
  
  }
//Edit Faculty
class Editfaculty implements ActionListener
{
  JFrame frm;
  JLabel l1,l2,l3,l4,l5,l6;
  JButton exit,ok,update,delete;
  JTextField txtid,txtname,txtgen,txtcon,txtqual,txtadd;
  Editfaculty()
  {
    frm=new JFrame("Edit faculty");
    l1=new JLabel("Enter Faculty id");
    l2=new JLabel("name");
    l3=new JLabel("Gender");
    l4=new JLabel("contact no");
    l5=new JLabel("Qualification");
    l6=new JLabel("address");
    txtid=new JTextField(20);
    txtname=new JTextField(20);
    txtgen=new JTextField(20);
    txtcon=new JTextField(20);
    txtqual=new JTextField(20);
    txtadd=new JTextField(20);
    ok=new JButton("ok");
    exit=new JButton("exit");
    delete=new JButton("delete");
    update=new JButton("update");
    frm.setLayout(new GridLayout(8,2));
    frm.add(l1);
    frm.add(txtid);
    frm.add(ok);
    frm.add(exit);
    frm.add(l2);
    frm.add(txtname);
    frm.add(l3);
	frm.add(txtgen);
    frm.add(l4);
    frm.add(txtcon);
    frm.add(l5);
    frm.add(txtqual);
    frm.add(l6);
    frm.add(txtadd);
    frm.add(delete);
    frm.add(update);
    
    frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
    frm.setBounds(400,300,400,300);
    frm.show();
		ok.addActionListener(this);
		exit.addActionListener(this);
		delete.addActionListener(this);
		update.addActionListener(this);
    }
	 public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int Facultyid;
				Facultyid=Integer.parseInt(txtid.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="select *from Facultytable where Facultyid="+Facultyid;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtname.setText(res.getString("name"));
					txtgen.setText(res.getString("gender"));
					txtcon.setText(res.getString("contectno"));
					txtqual.setText(res.getString("Qualification"));
					txtadd.setText(res.getString("Address"));
					
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{JOptionPane.showMessageDialog(null,e2.getMessage());}
		}
		else if(e.getSource()==delete)
		{
			try
			{
				int Facultyid;
				Facultyid=Integer.parseInt(txtid.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="delete from Facultytable where Facultyid="+Facultyid;
				stmt.executeUpdate(query);
				txtid.setText("");
				txtname.setText("");
				txtgen.setText("");
				txtcon.setText("");
				txtqual.setText("");
				txtadd.setText("");
				JOptionPane.showMessageDialog(null,"Data deleted");
			}
			catch(Exception e3)
			{}
		}
		else if(e.getSource()==update)
		{
			try
			{
				int Facultyid;
				String name,gender,contactno,qualification,address;
				Facultyid=Integer.parseInt(txtid.getText());
				name=(txtname.getText());
				gender=(txtgen.getText());
				contactno=(txtcon.getText());
				qualification=(txtqual.getText());
				address=(txtadd.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				
				String query="update Facultytable set name='"+name+"',gender='"+gender+"',contectno='"+contactno+"',Qualification='"+qualification+"',Address='"+address+"' where Facultyid="+Facultyid;
				stmt.executeUpdate(query);
				txtid.setText("");
				txtname.setText("");
				txtgen.setText("");
				txtcon.setText("");
				txtqual.setText("");
				txtadd.setText("");
				JOptionPane.showMessageDialog(null,"Data updated");
			}
			catch(Exception e3)
			{JOptionPane.showMessageDialog(null,e3.getMessage());}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
			
			
		}	
  }	
//Search Faculty
class Searchfaculty implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton exit,ok;
	JTextField txtid,txtname,txtgen,txtcon,txtqual,txtadd;
	Searchfaculty()
	{
		frm=new JFrame("Search faculty");
		l1=new JLabel("Enter Faculty id");
		l2=new JLabel("name");
		l3=new JLabel("Gender");
		l4=new JLabel("contact no");
		l5=new JLabel("Qualification");
		l6=new JLabel("address");
		txtid=new JTextField(20);
		txtname=new JTextField(20);
		txtgen=new JTextField(20);
		txtcon=new JTextField(20);
		txtqual=new JTextField(20);
		txtadd=new JTextField(20);
		ok=new JButton("ok");
		exit=new JButton("exit");
		frm.setLayout(new GridLayout(7,2));
		frm.add(l1);
		frm.add(txtid);
		frm.add(ok);
		frm.add(exit);
		frm.add(l2);
		frm.add(txtname);
		frm.add(l3);
		frm.add(txtgen);
		frm.add(l4);
		frm.add(txtcon);
		frm.add(l5);
		frm.add(txtqual);
		frm.add(l6);
		frm.add(txtadd);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(400,300,400,300);
		frm.show();
		ok.addActionListener(this);
		exit.addActionListener(this);
		
   }
	 public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int faculty;
				faculty=Integer.parseInt(txtid.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="select *from facultytable where facultyid="+faculty;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtid.setText(res.getString("facultyid"));
					txtname.setText(res.getString("Name"));
					txtgen.setText(res.getString("Gender"));
					txtcon.setText(res.getString("Contectno"));
					txtqual.setText(res.getString("Qualification"));
					txtadd.setText(res.getString("Address"));
					
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
   }	
}
//Salary slip
class Salaryslip implements ActionListener
{
JFrame frm;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JButton exit,ok,save,back;
JTextField txtsno,txtdos,txtid,txtname,txtgen,txtcon,txtadd,txtsalary;
Salaryslip()
{
	frm=new JFrame("Salary slip");
	l1=new JLabel("slip no");
	l2=new JLabel("date of salary");
	l3=new JLabel("Enter Faculty id");
	l4=new JLabel(" Faculty name");
	l5=new JLabel("Gender");
	l6=new JLabel("contact no");
	l7=new JLabel("Address");
	l8=new JLabel("Salary");
	txtsno=new JTextField(20);
	txtdos=new JTextField(20);
	txtid=new JTextField(20);
	ok=new JButton("ok");
	exit=new JButton("exit");
	save=new JButton("save");
	back=new JButton("Back");
	txtname=new JTextField(20);
	txtgen=new JTextField(20);
	txtcon=new JTextField(20);
	txtadd=new JTextField(20);
	txtsalary=new JTextField(20);
	frm.setLayout(new GridLayout(10,2));
	frm.add(l1);
	frm.add(txtsno);
	frm.add(l2);
	frm.add(txtdos);
	frm.add(l3);
	frm.add(txtid);
	frm.add(ok);
	frm.add(exit);
	frm.add(l4);
	frm.add(txtname);
	frm.add(l5);
	frm.add(txtgen);
	frm.add(l6);
	frm.add(txtcon);
	frm.add(l7);
	frm.add(txtadd);
	frm.add(l8);
	frm.add(txtsalary);
	frm.add(save);
	frm.add(back);
	frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	frm.setBounds(300,300,450,350);
	frm.show();
	ok.addActionListener(this);
	exit.addActionListener(this);
	save.addActionListener(this);
	back.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int slip,faculty,salary;
				
				
				faculty=Integer.parseInt(txtid.getText());
		
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="select *from facultytable where facultyid="+faculty;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtname.setText(res.getString("name"));
					txtgen.setText(res.getString("gender"));
					txtcon.setText(res.getString("contectno"));
					txtadd.setText(res.getString("address"));
				//	txtsalary.setText(res.getString("salary"));
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{JOptionPane.showMessageDialog(null,e2.getMessage());}
		}
		
  
     else if(e.getSource()==save)
     {
     int slip,faculty,salary;
	 String name,gender,qualification,contact,address,dos;
	 try
	 	{
	  	 	slip=Integer.parseInt(txtsno.getText());
	   		faculty=Integer.parseInt(txtid.getText());
	   		salary=Integer.parseInt(txtsalary.getText());
	   		name=txtname.getText();
	   		gender=txtgen.getText();
	  		// qualification=txtqual.getText();
	   		contact=txtcon.getText();
	   		address=txtadd.getText();
	  		dos=txtdos.getText();
	   		//connectivity
       		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       		Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
       		Statement stmt=cn.createStatement();
       		String query="insert into salarytable values("+slip+",'"+dos+"',"+faculty+",'"+name+"','"+contact+"','"+gender+"','"+address+"',"+salary+")";
       		stmt.executeUpdate(query);
       		JOptionPane.showMessageDialog(null,"data stored");
      	}
      	catch(Exception e2)
  		{JOptionPane.showMessageDialog(null,e2.getMessage());}
  	 }
  	 else if(e.getSource()==exit) 
		frm.dispose();
   }
}
//Search salary
class Salarysearch implements ActionListener
{
JFrame frm;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JButton exit,search;
JTextField txtsno,txtdos,txtfid,txtname,txtcon,txtgen,txtadd,txtsalary;
Salarysearch()
{
  frm=new JFrame("Search Salary ");
  l1=new JLabel("slip no");
  l2=new JLabel("date of Salary");
  l3=new JLabel("Faculty ID");
  l4=new JLabel(" Name");
  l5=new JLabel("Contect no");
  l6=new JLabel("Gender");
  l7=new JLabel("Address");
  l8=new JLabel("Salary");
  txtsno=new JTextField(20);
  search=new JButton("search");
  exit=new JButton("Exit");
  txtdos=new JTextField(20);
  txtfid=new JTextField(20);
  txtname=new JTextField(20);
  txtcon=new JTextField(20);
  txtgen=new JTextField(20);
  txtadd=new JTextField(20);
  txtsalary=new JTextField(20);
  frm.setLayout(new GridLayout(9,2));
  frm.add(l1);
  frm.add(txtsno);
  frm.add(search);
  frm.add(exit);
  frm.add(l2);
  frm.add(txtdos);
  frm.add(l3);
  frm.add(txtfid);
  frm.add(l4);
  frm.add(txtname);
  frm.add(l5);
  frm.add(txtcon);
  frm.add(l6);
  frm.add(txtgen);
  frm.add(l7);
  frm.add(txtadd);
  frm.add(l8);
  frm.add(txtsalary);
  frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
  frm.setBounds(400,300,500,300);
  frm.show();
  search.addActionListener(this);
  exit.addActionListener(this);
		
   }
	 public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==search)
		{
			try
			{
				int sno;
				sno=Integer.parseInt(txtsno.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="select *from salarytable where sno="+sno;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtfid.setText(res.getString("fid"));
					//txtsno.setText(res.getString("sno"));
					txtdos.setText(res.getString("dos"));
					txtname.setText(res.getString("Name"));
					txtgen.setText(res.getString("Gender"));
					txtcon.setText(res.getString("Contactno"));
					txtsalary.setText(res.getString("salary"));
					txtadd.setText(res.getString("Address"));
					
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{JOptionPane.showMessageDialog(null,e2.getMessage());}
		}
		else if(e.getSource()==exit) 
		frm.dispose();
		

 }
}
//Fee Slip
class Feeslip implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton exit,ok,calculate, save;
	JTextField txtsno,txtdop,txtrno,txtsname,txtcon,txtcourse,txtamount,txtdeposit,txtbalance;
	Feeslip()
	{
		frm=new JFrame("Pay Student Fee ");
		l1=new JLabel("slip no");
		l2=new JLabel("date of Pay");
		l3=new JLabel("Enter Rollno");
		l4=new JLabel("Student Name");
		l5=new JLabel("Contect no");
		l6=new JLabel("Course");
		l7=new JLabel("Fee Ammount");
		l8=new JLabel("Deposit");
		l9=new JLabel("Balance");
		txtsno=new JTextField(20);
		txtdop=new JTextField(20);
		txtrno=new JTextField(20);
		ok=new JButton("OK");
		exit=new JButton("exit");
		txtsname=new JTextField(20);
		txtcon=new JTextField(20);
		txtcourse=new JTextField(20);
		txtamount=new JTextField(20);
		txtdeposit=new JTextField(20);
		calculate=new JButton("Calculate");
		save=new JButton("Save");
		txtbalance=new JTextField(20);

		txtsname.setEnabled(false);
		txtcon.setEnabled(false);
		txtcourse.setEnabled(false);
		txtbalance.setEnabled(false);

		frm.setLayout(new GridLayout(11,2));
		frm.add(l1);
		frm.add(txtsno);
		frm.add(l2);
		frm.add(txtdop);
		frm.add(l3);
		frm.add(txtrno);
		frm.add(ok);
		frm.add(exit);

		frm.add(l4);
		frm.add(txtsname);
		frm.add(l5);
		frm.add(txtcon);	
		frm.add(l6);
		frm.add(txtcourse);
		frm.add(l7);
		frm.add(txtamount);
		frm.add(l8);
		frm.add(txtdeposit);
		frm.add(l9);
		frm.add(txtbalance);
		frm.add(calculate);
		frm.add(save);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setBounds(400,300,400,300);
		frm.show();
		ok.addActionListener(this);
		calculate.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ok)
		{
			try
			{
				int rno;
				rno=Integer.parseInt(txtrno.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=cn.createStatement();
				String query="select *from studenttable where rollno="+rno;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtrno.setText(res.getString("rollno"));
					txtsname.setText(res.getString("name"));
					
					txtcon.setText(res.getString("contactno"));
					
					txtcourse.setText(res.getString("Course"));
					
					
				}
				else
				JOptionPane.showMessageDialog(null,"Roll No.not found");
		}
		catch(Exception e2)
		{JOptionPane.showMessageDialog(null,e2.getMessage());}
	}
	else if(e.getSource()==calculate)
	{
		int amount,deposit,bal;
		amount=Integer.parseInt(txtamount.getText());
		deposit=Integer.parseInt(txtdeposit.getText());
		bal=amount-deposit;
		
		txtbalance.setText(""+bal);
		
	}
	else if(e.getSource()==save)
	{
		int rno,sno,amount,deposit,bal;
		String name,dop,course,address,contact;
		try
		{
			rno=Integer.parseInt(txtrno.getText());
			sno=Integer.parseInt(txtsno.getText());
			
			amount=Integer.parseInt(txtamount.getText());
			deposit=Integer.parseInt(txtdeposit.getText());
			bal=Integer.parseInt(txtbalance.getText());
			name=txtsname.getText();
			dop=txtdop.getText();
			contact=txtcon.getText();
			course=txtcourse.getText();
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection cn=DriverManager.getConnection("jdbc:odbc:cms");
			Statement stmt=cn.createStatement();
			
			String query="insert into feetable values("+sno+",'"+dop+"',"+rno+",'"+name+"','"+contact+"','"+course+"',"+amount+","+deposit+","+bal+")";
			stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null,"Data stored");
			
			
			
			
		}
		catch(Exception e3)
		{JOptionPane.showMessageDialog(null,e3.getMessage());}
	}
	else if(e.getSource()==exit) 
		frm.dispose();
}
}


// Search fee
class Fee implements ActionListener
{
  JFrame frm;
  JLabel l1,l2,l3,l4,l5,l6,l7;
  JButton Exit,Search;
  JTextField txtsno,txtdop,txtrno,txtsname,txtamount,txtdeposit,txtbalance;
  Fee()
 {
   frm=new JFrame("Pay Student Fee ");
	l1=new JLabel("slip no");
	l2=new JLabel("date of Pay");
	l3=new JLabel("Enter Rollno");
	l4=new JLabel("Student Name");
	l5=new JLabel("Fee amount");
	l6=new JLabel("Deposit");
	l7=new JLabel("Balance");
	txtsno=new JTextField(20);
	Search=new JButton("Search");
	Exit=new JButton("Exit");
	txtdop=new JTextField(20);
	txtrno=new JTextField(20);
	txtsname=new JTextField(20);
	txtamount=new JTextField(20);
	txtdeposit=new JTextField(20);
	txtbalance=new JTextField(20);

	frm.setLayout(new GridLayout(8,2));
	frm.add(l1);
	frm.add(txtsno);
	frm.add(Search);
	frm.add(Exit);
	frm.add(l2);
	frm.add(txtdop);
	frm.add(l3);
	frm.add(txtrno);
	frm.add(l4);
	frm.add(txtsname);
	frm.add(l5);
	frm.add(txtamount);
	frm.add(l6);
	frm.add(txtdeposit);
	frm.add(l7);
	frm.add(txtbalance);

	frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	frm.setBounds(400,300,400,300);
	frm.show();
	Search.addActionListener(this);
	Exit.addActionListener(this);
		
   }
	 public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Search)
		{
			try
			{
				int Slipno;
				Slipno=Integer.parseInt(txtsno.getText());
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="select *from feetable where Slipno="+Slipno;
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					txtsno.setText(res.getString("Slipno"));
					txtdop.setText(res.getString("dop"));
					txtrno.setText(res.getString("Rollno"));
					txtsname.setText(res.getString("Name"));
					txtamount.setText(res.getString("Ammount"));
					txtdeposit.setText(res.getString("Deposit"));
					txtbalance.setText(res.getString("Balance"));
					
				}
				else
				JOptionPane.showMessageDialog(null,"Not found");
			}
			catch(Exception e2)
			{JOptionPane.showMessageDialog(null,e2.getMessage());}
		}
		else if(e.getSource()==Exit) 
		frm.dispose();

 }
}
	


//List Student
class Liststudent
{
	JFrame frm;
	Liststudent()
	{
		frm=new JFrame("List of Student");
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
		frm.setBounds(300,100,800,500);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		JLabel l=new JLabel("LIST OF Student");
		l.setFont(new Font("Arial",Font.BOLD,15));
		frm.add(l);
		JTable jt=new JTable(0,10);
		DefaultTableModel m=(DefaultTableModel)jt.getModel();
		Object head []={"rollno","name","fname","mname","gender","dob","contectno","emailid","course","address"};
		m.addRow (head);
		frm.add(jt);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:cms");
			Statement stmt=con.createStatement();
			String query="select * from studenttable";
			ResultSet res=stmt.executeQuery(query);
			while(res.next())
			{
				Object newRow[]={res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)};
				m.addRow(newRow);
			}
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null,e.getMessage());}
		
		frm.show();
	
	}
	}
// List Course
class Listcourse
{
	JFrame frm;
	Listcourse()
	{
		frm=new JFrame("List of Student");
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
		frm.setBounds(300,100,300,400);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		JLabel l=new JLabel("LIST OF Course");
		l.setFont(new Font("Arial",Font.BOLD,15));
		frm.add(l);
		JTable jt=new JTable(0,3);
		DefaultTableModel m=(DefaultTableModel)jt.getModel();
		Object head []={"coursecode","coursename","Duration"};
		m.addRow (head);
		frm.add(jt);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:cms");
			Statement stmt=con.createStatement();
			String query="select * from Coursetable";
			ResultSet res=stmt.executeQuery(query);
			while(res.next())
			{
				Object newRow[]={res.getString("coursecode"),res.getString("coursename"),res.getString("duration")};
				m.addRow(newRow);
			}
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null,e.getMessage());}
		
		frm.show();
	
	}
	}
// List Faculty
class Listfaculty
{
	JFrame frm;
	Listfaculty()
	{
		frm=new JFrame("List of Faculty");
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
		frm.setBounds(400,500,600,700);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		JLabel l=new JLabel("LIST OF FACULTY");
		l.setFont(new Font("Arial",Font.BOLD,15));
		frm.add(l);
		JTable jt=new JTable(0,6);
		DefaultTableModel m=(DefaultTableModel)jt.getModel();
		Object head []={"fid","name","gender","contectno","qualification","address"};
		m.addRow (head);
		frm.add(jt);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:cms");
			Statement stmt=con.createStatement();
			String query="select * from facultytable";
			ResultSet res=stmt.executeQuery(query);
			while(res.next())
			{
				Object newRow[]={res.getString("facultyid"),res.getString("name"),res.getString("gender"),res.getString("contectno"),res.getString("qualification"),res.getString("address")};
				m.addRow(newRow);
			}
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null,e.getMessage());}
		frm.show();
	}
	

}
// Change password
class Changepsword implements ActionListener
{
	JFrame frm;
	JPasswordField  txtcurrent,txtnew,txtconfirm;
	JLabel l1,l2,l3;
	JButton verify,change,exit;
	 
	Changepsword()
	{
	 frm=new JFrame("Change Password");
	 frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	 frm.getContentPane().setBackground(Color.pink);
	 l1=new JLabel("Current Password");
	 l2=new JLabel("New Password");
	 l3=new JLabel("Confirm Password");
	 verify=new JButton("Verify");
	 exit=new JButton("Exit");
	 change=new JButton("Change");
	 
	 txtcurrent=new JPasswordField(20);
	 txtnew=new JPasswordField(20);
	 txtconfirm=new JPasswordField(20);
	 
	 frm.setLayout(null);
	 l1.setBounds(50,50,150,30);
	 txtcurrent.setBounds(180,50,150,30);
	 verify.setBounds(120,100,100,30);
	 l2.setBounds(50,150,150,30);
	 txtnew.setBounds(180,150,150,30);
	 l3.setBounds(50,200,150,30);
	 txtconfirm.setBounds(180,200,150,30);
	 change.setBounds(50,250,100,30);
	 exit.setBounds(230,250,100,30);
	 
	 exit.setBackground(Color.LIGHT_GRAY);
	 verify.setBackground(Color.LIGHT_GRAY);
	 change.setBackground(Color.LIGHT_GRAY);
	 frm.add(l1);
	 frm.add(txtcurrent);
	 frm.add(verify);
	 frm.add(l2);
	 frm.add(txtnew);
	 frm.add(l3);
	 frm.add(txtconfirm);
	 frm.add(change);
	 frm.add(exit);
	 
	 verify.addActionListener(this);
	 exit.addActionListener(this);
	 change.addActionListener(this);
	 frm.setBounds(300,200,400,350);
	 frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==verify)
		{
			String password;
			try
			{
				password=txtcurrent.getText();
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="select password from logintable where password='"+password+"'";
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					
					JOptionPane.showMessageDialog(null,"successfully verified");
				}
				else
				{
						JOptionPane.showMessageDialog(null,"Incorrect");
				}
			}
			catch(Exception e1)
			{JOptionPane.showMessageDialog(null,e1.getMessage());}
		}
	
		else if(e.getSource()==change)
		{
			try
			{
				String changepswrd=txtnew.getText();
				String confirmpswrd=txtconfirm.getText();
	  			if(changepswrd.equals(confirmpswrd))
		        {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="update  logintable set password='"+changepswrd+"'";
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Password Changed");
				}
				else
					JOptionPane.showMessageDialog(null,"Password mismatch");
				
			}
			catch(Exception e1)
			{JOptionPane.showMessageDialog(null,e1.getMessage());}
		}
		else
			frm.dispose();
	}
}
//welcome form

class WelcomeForm implements ActionListener
{
JFrame frm ;
JLabel l1,l2,l3,l4,l5,l6,l7;

JButton next;
WelcomeForm()
{
  frm= new JFrame("Welcome Form");
  frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
  frm.setLayout(null);
  next=new JButton("N E X T");
  next.setBounds(400,400,300,30);
  frm.add(next);
  l1=new JLabel("COLLEGE");
  l2=new JLabel("MANAGEMENT");
  l3=new JLabel("SYSTEM");
  l4=new JLabel("Developed by");
  l5=new JLabel ("Shreya Tyagi");
  l6=new JLabel("Submitted To");
  l7=new JLabel("Dr Pramod kumar");
  
  Font f1=new Font("Algerian",Font.BOLD,40);
  l1.setFont(f1);
  l2.setFont(f1);
  l3.setFont(f1);
  l1.setForeground(Color.red);
  l2.setForeground(Color.red);
  l3.setForeground(Color.red);
  l4.setForeground(Color.blue);
  l7.setForeground(Color.blue);
  l5.setForeground(Color.green);
  l6.setForeground(Color.blue);
  l7.setForeground(Color.green);
  l1.setBounds(500,10,400,100);
  frm.add(l1);
  l2.setBounds(450,110,400,100);
  frm.add(l2);
  l3.setBounds(500,210,400,100);
  frm.add(l3);
  Font f2=new Font("Times New Roman",Font.BOLD,30);
  l4.setFont(f2);
  l5.setFont(f2);
  l6.setFont(f2);
  l7.setFont(f2);
  l4.setBounds(20,310,300,300);
  frm.add(l4);
  l5.setBounds(20,360,300,300);
  frm.add(l5);
  l6.setBounds(1000,300,300,300);
  frm.add(l6);
  l7.setBounds(1000,350,300,300);
  frm.add(l7);
  frm.setBounds(1,1,1700,1000);
 
  frm.show();
 
 next.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==next)
		{
			frm.hide();
			Main obj=new Main();
		}
	}
	
}

// Login form

class LoginForm implements ActionListener
{
	JFrame frm;
	JLabel l1,l2;
	JTextField txtlogin;
	JPasswordField txtpass;
	JButton login,quit;
	LoginForm()
	{
		frm=new JFrame("Login Form");
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		l1=new JLabel("Login Id");
		l2=new JLabel("Password");
		txtlogin=new JTextField(20);
		txtpass=new JPasswordField(20);
		login=new JButton("Login");
		quit=new JButton("Quit");
		frm.setLayout(new GridLayout(3,2));
		frm.add(l1);
		frm.add(txtlogin);
		frm.add(l2);
		frm.add(txtpass);
		frm.add(login);
		frm.add(quit);
		
		login.addActionListener(this);
		quit.addActionListener(this);
		
		frm.setBounds(400,300,400,150);
		frm.show();
		
	} 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login)
		{
			String login,pass;
			login=txtlogin.getText();
			pass=txtpass.getText();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:cms");
				Statement stmt=con.createStatement();
				String query="select * from logintable where loginid='"+login+"' and password='"+pass+"'";	
				ResultSet res=stmt.executeQuery(query);
				if(res.next())
				{
					frm.hide();
					WelcomeForm obj=new WelcomeForm();
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"InCorrect");	
				}
			}
			catch(Exception e2)
			{
				JOptionPane.showMessageDialog(null,e2.getMessage());
			}
			
		}
		else
		System.exit(0);
	}
}


class Mainform
{
	public static void main(String args[])
	{
		new LoginForm();
	}
}
