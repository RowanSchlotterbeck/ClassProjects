import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookDemo {
   public static void main(String args[]) {

      ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

      phoneBook.add(new PhoneBookEntry("Rango", "123-456-7890"));
      phoneBook.add(new PhoneBookEntry("Cheetah", "098-765-4321"));
      phoneBook.add(new PhoneBookEntry("Delta", "555-555-5555"));
      phoneBook.add(new PhoneBookEntry("Christmas", "444-444-4444"));
      phoneBook.add(new PhoneBookEntry("Floyd", "333-333-3333"));

      for (PhoneBookEntry entry : phoneBook) {
         System.out.println("Name: " + entry.getName() + ", Phone Number: " + entry.getPhoneNumber());
      }

   }
}