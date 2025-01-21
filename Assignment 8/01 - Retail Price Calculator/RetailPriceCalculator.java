import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RetailPriceCalculator extends JFrame implements ActionListener {
   private JTextField wholesaleCost;
   private JTextField markupRate;
   private JLabel retailPriceLabel;
   private JButton calculateButton;

   public RetailPriceCalculator() {
      // Set up frame
      setTitle("Retail Price Calculator");
      setSize(300, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(4, 2, 5, 5));

      // Initialize nessecary components
      JLabel wholesaleCostLabel = new JLabel("Wholesale Cost:");
      wholesaleCost = new JTextField();

      JLabel markupPercentageLabel = new JLabel("Markup Percentage:");
      markupRate = new JTextField();

      retailPriceLabel = new JLabel("Retail Price: $0.00");

      calculateButton = new JButton("Calculate");
      calculateButton.addActionListener(this);

      // Add fundamental components to frame
      add(wholesaleCostLabel);
      add(wholesaleCost);
      add(markupPercentageLabel);
      add(markupRate);
      add(calculateButton);
      add(retailPriceLabel);

      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {

      // Convert input to double
      String costText = wholesaleCost.getText();
      double cost = Double.parseDouble(costText);

      String markupText = markupRate.getText();
      double markupPercentage = Double.parseDouble(markupText);

      // Perform calculations
      double markupAmount = cost * (markupPercentage / 100);
      double retailPrice = cost + markupAmount;

      // Display retail price
      String retailPriceString = "Retail Price: $" + ((int) (retailPrice * 100) / 100.0);
      retailPriceLabel.setText(retailPriceString);

   }

   public static void main(String[] args) {
      new RetailPriceCalculator();
   }
}