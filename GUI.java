package ru.mirea.gib04.lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame
{
    JTextArea textArea = new JTextArea(20,20);
    JScrollPane Scroll = new JScrollPane(textArea);
    JButton button = new JButton("Add some Text");
    public GUI()
    { super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(textArea);
        add(Scroll);
        setVisible(true);
        add(button);
        Scroll.setViewportView(textArea);
        button.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent
                                                ae)

            {

                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                textArea.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new GUI().setVisible(true);

    }
}