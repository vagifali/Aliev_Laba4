package ru.mirea.gib04.lab4;

import java.awt.*;
import javax.swing.*;
public class GUI1 extends JFrame
{
    JTextField jta = new JTextField(10);

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    GUI1()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new GUI1();
    }
}