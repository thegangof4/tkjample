package edu.bergen.simplegui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GreetingFrame extends JFrame implements ActionListener {
	private Font bigAndBold = new Font("Arial", Font.BOLD, 16);
	private JLabel question = new JLabel("What is your name?");
	private JTextField answer = new JTextField(10);
	private JButton pressMe = new JButton("Press me");
	private JLabel greeting = new JLabel("");
	
	public GreetingFrame() {
		super();
		setSize(375, 525);
		setLayout(new FlowLayout()); 
		question.setFont(bigAndBold);
		greeting.setFont(bigAndBold);
		add(question);
		add(answer);
		add(pressMe);
		add(greeting);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pressMe.addActionListener(this );
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String response = answer.getText();
		response = "Hello, " + response;
		greeting.setText(response);
	}
}
