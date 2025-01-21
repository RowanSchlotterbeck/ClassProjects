import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PropertyTax extends JFrame implements ActionListener {

   // Intialize components into fields
   private JTextField actualValueField;
   private JLabel assessmentValueLabel;
   private JLabel propertyTaxLabel;
   private JButton calculateButton;

   public PropertyTax() {
      // Set up frame
      setTitle("Property Tax Calculator");
      setSize(350, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(4, 2, 5, 5));

      // Initialize funadmental components
      JLabel actualValueLabel = new JLabel("Actual Property Value:");
      actualValueField = new JTextField();

      JLabel assessmentLabel = new JLabel("Assessment Value:");
      assessmentValueLabel = new JLabel("$0.00");

      JLabel taxLabel = new JLabel("Property Tax:");
      propertyTaxLabel = new JLabel("$0.00");

      calculateButton = new JButton("Calculate");
      calculateButton.addActionListener(this);

      // Add components to the frame
      add(actualValueLabel);
      add(actualValueField);
      add(assessmentLabel);
      add(assessmentValueLabel);
      add(taxLabel);
      add(propertyTaxLabel);
      add(calculateButton);

      // Set the frame to be visible
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {

      // Get the input as a string
      String input = actualValueField.getText();

      // Conver input to a double
      double actualValue = Double.parseDouble(input);

      // Perform calculations
      double assessmentValue = actualValue * 0.6;
      double taxRatePerHundred = 0.64;
      double propertyTax = (assessmentValue / 100) * taxRatePerHundred;

      // Set assessment value to 2 decimal places
      int assessmentValueInCents = (int) (assessmentValue * 100);
      double formattedAssessmentValue = assessmentValueInCents / 100.0;

      // Set property tax to 2 decimal places
      int propertyTaxInCents = (int) (propertyTax * 100);
      double formattedPropertyTax = propertyTaxInCents / 100.0;

      // Concatenate strings to update labels
      assessmentValueLabel.setText("$" + formattedAssessmentValue);
      propertyTaxLabel.setText("$" + formattedPropertyTax);
   }

   public static void main(String[] args) {
      new PropertyTax();
   }
}