package radiobuttondemo;
import javax.swing.*;import java.awt.*;import java.awt.event.*;
public class RadioButtonDemo extends JFrame implements ActionListener{
JRadioButton bird=new JRadioButton("Bird"),cat=new JRadioButton("Cat"),dog=new JRadioButton("Dog"),rabbit=new JRadioButton("Rabbit"),pig=new JRadioButton("Pig"); JLabel img=new JLabel();
public RadioButtonDemo(){setTitle("RadioButtonDemo");setSize(600,400);setLayout(new FlowLayout());setDefaultCloseOperation(EXIT_ON_CLOSE);ButtonGroup g=new ButtonGroup();for(JRadioButton b:new JRadioButton[]{bird,cat,dog,rabbit,pig}){g.add(b);b.addActionListener(this);add(b);}add(img);setVisible(true);}
public void actionPerformed(ActionEvent e){String s=bird.isSelected()?"bird":cat.isSelected()?"cat":dog.isSelected()?"dog":rabbit.isSelected()?"rabbit":"pig";img.setIcon(new ImageIcon("images/"+s+".png"));JOptionPane.showMessageDialog(this,"You selected "+s);}
public static void main(String[]a){new RadioButtonDemo();}}