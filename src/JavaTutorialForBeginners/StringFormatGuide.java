package JavaTutorialForBeginners;

import java.util.Calendar;

public class StringFormatGuide {
    public static void main(String[] args) {
        String str = String.format("My age is %d", 17); //returns formatted String using specifiers with symbol '%'
        System.out.printf("My age is %d", 17); //prints formatted String using the same tools as String.format()

        String s = String.format("First letter is %c", 'A'); //%c = character

        s = String.format("My salary is %d", 4000); //%d = decimal (integer with base 10)

        System.out.printf("\nScientific shit %e", 123712d); //scientific notation of double argument
                                                            //"\n" is new line character

        System.out.printf("\n\tThis will be written with %s", "tab and new line!"); //&s = String, '\t' = Tab

        Calendar time = Calendar.getInstance();
        System.out.printf("\nTime is %tr", time); //don't know what is %tr, it's supposed to be time, and it works

        System.out.println("\nBackspace\b"); //funny example, %b = backspace

        System.out.printf("Total value: %.5f\n",5.6); //%f = float, number after dot = digits number after dot
        System.out.printf("Total value: %-6.1f\n",343.23423); //number before dot = number of characters given (including the dot itself)
                                                             //for the formatted number, if float less than that number zeros will be added,
                                                            //if bigger - it will be rounded
    }
}
