import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame2
extends JFrame
implements ActionListener
{

Container c;
JLabel title;
JLabel name;
JTextField tname;
JLabel mno;
JTextField tmno;
JLabel gender;
JRadioButton male;
JRadioButton female;
ButtonGroup gengp;
JLabel dob;
JComboBox date;
JComboBox month;
JComboBox year;
JLabel add;
JTextArea tadd;
JButton sub;
JButton ret;
JButton reset;
JTextArea tout;
JLabel res;
JTextArea resadd;
JLabel image;
JFrame frame=new JFrame("Registration Form");


public MyFrame2()
{
String dates[]
= { "1", "2", "3", "4", "5",
"6", "7", "8", "9", "10",
"11", "12", "13", "14", "15",
"16", "17", "18", "19", "20",
"21", "22", "23", "24", "25",
"26", "27", "28", "29", "30",
"31" };
String months[]
= { "Jan", "feb", "Mar", "Apr",
"May", "Jun", "July", "Aug",
"Sep", "Oct", "Nov", "Dec" };
String years[]
= { "1995", "1996", "1997", "1998",
"1999", "2000", "2001", "2002",
"2003", "2004", "2005", "2006",
"2007", "2008", "2009", "2010",
"2011", "2012", "2013", "2014",
"2015", "2016", "2017", "2018",
"2019" };


setTitle("Student Registration Form");
setBounds(300, 90, 900, 600);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);
Color mycolor=new Color(255,124,200);
        Container c =getContentPane(); // Container c having the getcontentpane
        c.setBackground(mycolor);

c = getContentPane();
c.setLayout(null);

//to create heading for the project

title = new JLabel("Student Registration Form");
title.setFont(new Font("Arial", Font.PLAIN, 30));
title.setSize(300, 30);
title.setLocation(300, 30);
c.add(title);

// to create label and text field for name

name = new JLabel("NAME");
name.setFont(new Font("Arial", Font.PLAIN, 20));
name.setSize(100, 20);
name.setLocation(100, 100);
c.add(name);
tname = new JTextField();
tname.setFont(new Font("Arial", Font.PLAIN, 15));
tname.setSize(190, 20);
tname.setLocation(200, 100);
c.add(tname);

//to create label and textfield for mobileno

mno = new JLabel("Mobile");
mno.setFont(new Font("Arial", Font.PLAIN, 20));
mno.setSize(100, 20);
mno.setLocation(100, 150);
c.add(mno);
tmno = new JTextField();
tmno.setFont(new Font("Arial", Font.PLAIN, 15));
tmno.setSize(150, 20);
tmno.setLocation(200, 150);
c.add(tmno);

//to create label and radiobutton for gender

gender = new JLabel("Gender");
gender.setFont(new Font("Arial", Font.PLAIN, 20));
gender.setSize(100, 20);
gender.setLocation(100, 200);
c.add(gender);
male = new JRadioButton("Male");
male.setFont(new Font("Arial", Font.PLAIN, 15));
male.setSelected(true);
male.setSize(75, 20);
male.setLocation(200, 200);
c.add(male);
female = new JRadioButton("Female");
female.setFont(new Font("Arial", Font.PLAIN, 15));
female.setSelected(false);
female.setSize(80, 20);
female.setLocation(275, 200);
c.add(female);

//to group the buttons

gengp = new ButtonGroup();
gengp.add(male);
gengp.add(female);

//to create label and jcombobox for date month year

dob = new JLabel("DOB");
dob.setFont(new Font("Arial", Font.PLAIN, 20));
dob.setSize(100, 20);
dob.setLocation(100, 250);
c.add(dob);
date = new JComboBox(dates);
date.setFont(new Font("Arial", Font.PLAIN, 15));
date.setSize(50, 20);
date.setLocation(200, 250);
c.add(date);
month = new JComboBox(months);
month.setFont(new Font("Arial", Font.PLAIN, 15));
month.setSize(60, 20);
month.setLocation(250, 250);
c.add(month);
year = new JComboBox(years);
year.setFont(new Font("Arial", Font.PLAIN, 15));
year.setSize(60, 20);
year.setLocation(320, 250);
c.add(year);

//to create label and textarea for address

add = new JLabel("Address");
add.setFont(new Font("Arial", Font.PLAIN, 20));
add.setSize(100, 20);
add.setLocation(100, 300);
c.add(add);
tadd = new JTextArea();
tadd.setFont(new Font("Arial", Font.PLAIN, 15));
tadd.setSize(200, 75);
tadd.setLocation(200, 300);
tadd.setLineWrap(true);
c.add(tadd);

//to create submit button

sub = new JButton("Submit");
sub.setFont(new Font("Arial", Font.PLAIN, 15));
sub.setSize(100, 20);
sub.setLocation(150, 450);
sub.addActionListener(this);
c.add(sub);

//to create reset button

reset = new JButton("Reset");
reset.setFont(new Font("Arial", Font.PLAIN, 15));
reset.setSize(100, 20);
reset.setLocation(270, 450);
reset.addActionListener(this);
c.add(reset);

//to create retrive button

ret = new JButton("retrive");
ret.setFont(new Font("Arial", Font.PLAIN, 15));
ret.setSize(100, 20);
ret.setLocation(195, 480);
ret.addActionListener(this);
c.add(ret);

//to print the output we used this textarea

tout = new JTextArea();
tout.setFont(new Font("Arial", Font.PLAIN, 15));
tout.setSize(300, 400);
tout.setLocation(500, 100);
tout.setLineWrap(true);
tout.setEditable(false);
c.add(tout);


res = new JLabel("");
res.setFont(new Font("Arial", Font.PLAIN, 20));
res.setSize(500, 25);
res.setLocation(100, 500);
c.add(res);

resadd = new JTextArea();
resadd.setFont(new Font("Arial", Font.PLAIN, 15));
resadd.setSize(200, 75);
resadd.setLocation(580, 175);
resadd.setLineWrap(true);
c.add(resadd);

setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if (e.getSource() == sub)
{
PreparedStatement sta = null;
            String s_name = tname.getText();
     String s_phno = tmno.getText();
String s_add = tadd.getText();
// String s_gender = gengp.getSelectedItem().toString();
String date1 = date.getSelectedItem().toString();
String month1 = month.getSelectedItem().toString();
String year1 = year.getSelectedItem().toString();
String s_dob = date1 + "/" + month1 + "/" + year1;


try

{    
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcs","root","Manoj@13");    
sta = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?)");
sta.setString(1,s_name);
// sta.setString(2,s_gender);
sta.setString(3,s_dob);
sta.setString(4,s_phno);
sta.setString(5,s_add);
sta.executeUpdate();

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");  

while(rs.next())
{
System.out.println(rs.getString("stu_name"));
// System.out.println(rs.getString("stu_gender"));  
System.out.println(rs.getString("stu_dob"));
System.out.println(rs.getString("stu_phno"));
System.out.println(rs.getString("stu_add"));
}


name.setText("");
tmno.setText("");
add.setText("");


sta.close();
con.close();

}
catch(Exception me)
{
System.out.println(me);
}

}

else if (e.getSource() == reset)
{
String def = "";
tname.setText(def);
tadd.setText(def);
tmno.setText(def);
res.setText(def);
tout.setText(def);
date.setSelectedIndex(0);
month.setSelectedIndex(0);
year.setSelectedIndex(0);
resadd.setText(def);
}
if (e.getSource() == ret)
{
JFrame frame1 = new JFrame("RETRIEVED DETAILS");
JLabel nabl[] = new JLabel[10];
JLabel dobl[] = new JLabel[10];
// JLabel gebl[] = new JLabel[10];
JLabel phbl[] = new JLabel[10];
JLabel adbl[] = new JLabel[10];
JLabel nameh,genh,dobh,phh,addh;
try
{    
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rcs","root","Rishikesh@13");    

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");  
int y = 200;
int in = 1;
nameh=new JLabel("NAME");
dobh=new JLabel("DOB");
// genh=new JLabel("GENDER");
phh=new JLabel("PHONE");
addh=new JLabel("ADDRESS");
while(rs.next())
{

nabl[in] = new JLabel(rs.getString("stu_name"));
      dobl[in] = new JLabel(rs.getString("stu_dob"));
//   gebl[in] = new JLabel(rs.getString("stu_gender"));
  phbl[in] = new JLabel(rs.getString("stu_phno"));
  adbl[in] = new JLabel(rs.getString("stu_add"));


nabl[in].setBounds(450,y,100,30);
dobl[in].setBounds(600,y,100,30);
// gebl[in].setBounds(750,y,100,30);
phbl[in].setBounds(900,y,100,30);
adbl[in].setBounds(1050,y,100,30);

frame1.add(nabl[in]);
frame1.add(dobl[in]);
// frame1.add(gebl[in]);
frame1.add(phbl[in]);
frame1.add(adbl[in]);

y = y + 50;
in = in + 1;

}

nameh.setBounds(450,150,100,30);
dobh.setBounds(600,150,100,30);
// genh.setBounds(750,150,100,30);
phh.setBounds(900,150,100,30);
addh.setBounds(1050,150,100,30);

frame1.add(nameh);
frame1.add(dobh);
// frame1.add(genh);
frame1.add(phh);
frame1.add(addh);

stmt.close();
con.close();

}
catch(Exception me)
{
System.out.println(me);
}
JLabel title1 = new JLabel("Retrieved Details");
        title1.setFont(new Font("Arial", Font.PLAIN, 30));
        title1.setSize(300, 30);
        title1.setLocation(650, 100);

frame1.add(title1);
frame1.setLayout(null);
frame1.setSize(1535, 863);
frame1.setVisible(true);


}



}

public static void main(String[] args) throws Exception
{
MyFrame2 f = new MyFrame2();
JPanel panel=new JPanel();
panel.setBounds(0,0, 100, 100);
panel.setLayout(new FlowLayout());      
BufferedImage myPicture = ImageIO.read(new File("project.png"));
JLabel picLabel = new JLabel(new ImageIcon(myPicture));
panel.add(picLabel);
f.add(panel);
f.setLayout(null);
f.setVisible(true);


}


}