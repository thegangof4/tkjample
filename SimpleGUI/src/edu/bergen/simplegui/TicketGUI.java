package edu.bergen.simplegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TicketGUI  extends JFrame {

   private JLabel banner = new JLabel("Ticket Price Calculator");
   private JLabel nameLabel = new JLabel("Name");
   private JTextField name = new JTextField("");
   private JLabel typeLabel = new JLabel("Ticket type");
   private String[] ticketTypes = {"Adult", "Senior", "Student"};
   private JComboBox<String> ticketType = new JComboBox<String>(ticketTypes);
   private JLabel destinationLabel = new JLabel("Destination");
   private String[] destinations = { "NY Penn Station", "Hoboken", "Secaucus", "Newark Penn Station" };
   private JComboBox<String> destination = new JComboBox<String>(destinations);
   private JButton calcButton = new JButton("Calc ticket price");
   private JTextArea ticketPrice = new JTextArea("The price of your will appear here");
   private JPanel calcPanel = new JPanel();
   private JPanel inputPanel = new JPanel();
   
   
   public TicketGUI() {
      banner.setHorizontalAlignment(SwingConstants.CENTER);
      banner.setFont(new Font("SanSerif", Font.BOLD + Font.ITALIC, 24));
      banner.setForeground(Color.BLUE);
      setLayout(new GridLayout(0,1));
      //setLayout(new BorderLayout());
      add(banner);
      //add(banner, BorderLayout.NORTH);

      add(inputPanel);
      //add(inputPanel, BorderLayout.CENTER);
      inputPanel.setLayout(new GridLayout(3,2));
      nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      inputPanel.add(nameLabel);
      inputPanel.add(name);
      typeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      inputPanel.add(typeLabel);
      inputPanel.add(ticketType);
      destinationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      inputPanel.add(destinationLabel);
      inputPanel.add(destination);

      add(calcPanel);
      //add(calcPanel, BorderLayout.SOUTH);
      calcPanel.setLayout(new GridLayout(2,1));
      calcPanel.add(calcButton);
      calcPanel.add(ticketPrice);
      calcButton.addActionListener(new CalcButtonListener());
   }
   
     public class CalcButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String type = (String)ticketType.getSelectedItem();
         String dest = (String)destination.getSelectedItem();
         int price = calcPrice(type, dest);
         String px = Integer.toString(price);
         ticketPrice.setText("The price of a " + type + " ticket to " + dest + " is $" + px);
      }
     }
      
      public static int calcPrice(String ticketType, String destination) {
         int price = 0;
         if (destination.equals("NY Penn Station")) {
            price = 10;
         } else if (destination.equals("Hoboken")) {
            price = 8;
         } else if (destination.equals("Secaucus")) {
            price = 7;
         } else {
            price = 9;
         }
         if (ticketType.equals("Student")) {
            price = price - 2;
         } else if (ticketType.equals("Senior")) {
            price = price - 3;
         }
         return price;
      }
      
     public static void main(String[] args) {
      TicketGUI gui = new TicketGUI();
      gui.setSize(400,400);
      gui.setBackground(Color.DARK_GRAY);
      gui.setTitle("TicketGUI");
      gui.pack();
      gui.setVisible(true);
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
     }
}