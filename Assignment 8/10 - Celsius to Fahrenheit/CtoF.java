import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CtoF extends JFrame implements ActionListener {
   // Initalize components as fields
   private JTextField celsiusField;
   private JLabel fahrenheitLabel;
   private JButton convertButton;

   public CtoF() {
      // Set up frame
      setTitle("Celsius to Fahrenheit Converter");
      setSize(300, 150);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(3, 2, 5, 5));

      // Initialize components
      JLabel celsiusLabel = new JLabel("Celsius:");
      celsiusField = new JTextField();

      fahrenheitLabel = new JLabel("Fahrenheit: 0.0");

      convertButton = new JButton("Convert");
      convertButton.addActionListener(this);

      // Add components to the frame
      add(celsiusLabel);
      add(celsiusField);
      add(convertButton);
      add(fahrenheitLabel);

      // Set frame visiblity
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      // Get Celsius input
      String celsiusInput = celsiusField.getText();
      double celsius = Double.parseDouble(celsiusInput);

      // Convert to Fahrenheit
      double fahrenheit = (celsius * 9 / 5) + 32;

      // Update the Fahrenheit label
      fahrenheitLabel.setText("Fahrenheit: " + fahrenheit);
   }

   public static void main(String[] args) {
      new CtoF();
   }
}