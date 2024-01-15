/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shortdatetofulldate;
import java.util.Scanner;
/**
 *
 * @author PC-Chomreoun
 */
public class ShortDateToFullDate {
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Extract year, month, and day using substrings
        String yearStr = shortDate.substring(0, 4);
        String monthStr = shortDate.substring(5, 7);
        String dayStr = shortDate.substring(8);

        // Convert month number to month name using a switch statement
        String monthName;
        switch (Integer.parseInt(monthStr)) {
            case 1:  
                monthName = "January";  break;
            case 2:
                monthName = "February"; break;
            case 3:
                monthName = "March";    break;
            case 4: 
                monthName = "April";    break;
            case 5: 
                monthName = "May";      break;
            case 6:
                monthName = "June";     break;
            case 7:
                monthName = "July";     break;
            case 8: 
                monthName = "August";   break;
            case 9:
                monthName = "September";break;
            case 10:
                monthName = "October";  break;
            case 11: 
                monthName = "November"; break;
            case 12: 
                monthName = "December"; break;

            default: monthName = "Invalid month";
        }

        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);
        int dayOfWeek = (day + ((13 * (month + 1)) / 5) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + 5 * (year / 100)) % 7;
        

      
        System.out.println( monthName + " " + day + ", " + year);
    } 
    
}
