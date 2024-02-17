package com.rahul.javaJotter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {

    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the program by the red X on top left.
        this.setTitle("Java Jotter v0.1");
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO: add action listener
    }
}
