package edu.bergen.simplegui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {
	public static void main(String[] args) {
		JFrame frame  = new JFrame("HelloWorld");
		frame.setSize(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel helloWorldLabel =  new JLabel("Hello World");
		Font hwFont = new Font("Arial", Font.BOLD, 36);
		helloWorldLabel.setFont(hwFont);
		frame.add(helloWorldLabel);
		
		JLabel wieGehtsLabel =  new JLabel("How are you?");
		wieGehtsLabel.setFont(hwFont);
		frame.add(wieGehtsLabel);
		
		frame.setLayout(new FlowLayout()
				
				
				
				
				
				
				
				);
		frame.setVisible(true);
	}
}
