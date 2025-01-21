import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MPGCalculator extends JFrame implements ActionListener {
   // Initalize components as fields
   private JTextField gallonsField;
   private JTextField milesField;
   private JLabel mpgLabel;
   private JButton calculateButton;

   public MPGCalculator() {
      // Set up frame
      setTitle("MPG Calculator");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(4, 2, 5, 5));

      // Initialize components
      JLabel gallonsLabel = new JLabel("Gallons of Gas:");
      gallonsField = new JTextField();

      JLabel milesLabel = new JLabel("Miles on Full Tank:");
      milesField = new JTextField();

      mpgLabel = new JLabel("MPG: 0.0");

      calculateButton = new JButton("Calculate MPG");
      calculateButton.addActionListener(this);

      // Add components to the frame
      add(gallonsLabel);
      add(gallonsField);
      add(milesLabel);
      add(milesField);
      add(calculateButton);
      add(mpgLabel);

      // Set the frame to be visible
      setVisible(true);

   }

   public void actionPerformed(ActionEvent e) {
      // Get and parse input values to doubles
      String gallonsInput = gallonsField.getText();
      double gallons = Double.parseDouble(gallonsInput);

      String milesInput = milesField.getText();
      double miles = Double.parseDouble(milesInput);

      // Calculations
      double mpg = miles / gallons;

      // Display MPG
      int mpgInCents = (int) (mpg * 100); // Convert to cents (2 decimal places)
      double formattedMpg = mpgInCents / 100.0; // Convert back to decimal value

      mpgLabel.setText("MPG: " + formattedMpg);

   }

   public static void main(String[] args) {
      new MPGCalculator();
   }
}