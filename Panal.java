import javax.swing.*;
import java.awt.*;

public class Panal extends JPanel  {
    public Panal () {
        Font newFont = new Font("Arial", Font.BOLD, 20);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        JTextField t = new JTextField();
        t.setBackground(Color.white);
        t.setBounds(25,20,230,35);

        this.add(t);

        JButton b=new JButton(new ImageIcon("ooooo.jpg"));
        b.setBounds(20,80,100,30);
        this.add(b);
        JButton bb=new JButton(new ImageIcon("fffff.jpg"));
        bb.setBounds(140,80,100,30);
        this.add(bb);
        //first row
        JButton b1=new JButton("del");
        b1.setBounds(20,125,58,35);
        this.add(b1);
        JButton b2=new JButton("log(");
        b2.setBounds(80,125,58,35);
        this.add(b2);
        JButton b3=new JButton("ln()");
        b3.setBounds(140,125,58,35);
        this.add(b3);
       JButton b4=new JButton("sin()");
        b4.setBounds(200,125,70,35);
        this.add(b4);
        //second row
        JButton b5=new JButton("%");
        b5.setBounds(20,170,58,35);
        this.add(b5);
        JButton b6=new JButton("(");
        b6.setBounds(80,170,58,35);
        this.add(b6);
        JButton b7=new JButton(")");
        b7.setBounds(140,170,58,35);
        this.add(b7);
        JButton b8=new JButton("cos()");
        b8.setBounds(200,170,70,35);
        this.add(b8);
        //third row
        JButton b9=new JButton("1/x");//
        b9.setBounds(20,215,58,35);
        this.add(b9);
        JButton b10=new JButton("√()");
        b10.setBounds(80,215,58,35);
        this.add(b10);
        JButton b11=new JButton("x²");
        b11.setBounds(140,215,58,35);
        this.add(b11);
        JButton b12=new JButton("tan()");
        b12.setBounds(200,215,70,35);
        this.add(b12);
        //4 rows
        JButton b13=new JButton("1");
        b13.setBounds(20,260,58,35);
        b13.setBackground(Color.white);
        this.add(b13);
        JButton b14=new JButton("2");
        b14.setBounds(80,260,58,35);
        b14.setBackground(Color.white);
        this.add(b14);
        JButton b15=new JButton("3");
        b15.setBounds(140,260,58,35);
        b15.setBackground(Color.white);
        this.add(b15);
        JButton b16=new JButton("*");
        b16.setBounds(200,260,70,35);
        b16.setFont(newFont);
        this.add(b16);
        //5 rows
        JButton b17=new JButton("4");
        b17.setBounds(20,305,58,35);
        b17.setBackground(Color.white);
        this.add(b17);
        JButton b18=new JButton("5");
        b18.setBounds(80,305,58,35);
        b18.setBackground(Color.white);
        this.add(b18);
        JButton b19=new JButton("6");
        b19.setBounds(140,305,58,35);
       b19.setBackground(Color.white);
        this.add(b19);
        JButton b20=new JButton("÷");
        b20.setBounds(200,305,70,35);
        b20.setFont(newFont);
        this.add(b20);
        //6 rows
        JButton b21=new JButton("7");
        b21.setBounds(20,350,58,35);
        b21.setBackground(Color.white);
        this.add(b21);
        JButton b22=new JButton("8");
        b22.setBounds(80,350,58,35);
        b22.setBackground(Color.white);
        this.add(b22);
        JButton b23=new JButton("9");
        b23.setBounds(140,350,58,35);
        b23.setBackground(Color.white);
        this.add(b23);
        JButton b24=new JButton("-");
        b24.setBounds(200,350,70,35);
        b24.setFont(newFont);
        this.add(b24);
        //7 rows
        JButton b25=new JButton(".");
        b25.setBounds(20,395,58,35);
        b25.setFont(newFont);
        this.add(b25);
        JButton b26=new JButton("0");
        b26.setBounds(80,395,58,35);
        b26.setBackground(Color.white);
        this.add(b26);
        JButton b27=new JButton("=");
        b27.setBounds(140,395,58,35);
        b27.setFont(newFont);
        this.add(b27);
        JButton b28=new JButton("+");
        b28.setBounds(200,395,70,35);
        b28.setFont(newFont);
        this.add(b28);

    }

}
