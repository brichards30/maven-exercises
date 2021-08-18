package maven;

import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example {


    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.printf("You entered: \"%s\"" + "\n", userInput) ;

        //3a
        if (!StringUtils.isNumeric(userInput)){
            System.out.printf("\"%s\"" + " is not a number.",userInput);
        }else{
            System.out.println("\nThis is a number.");
        }

        //3b.

        System.out.println("\nFlipped Case: " + StringUtils.swapCase(userInput));

        //3c

        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

}
