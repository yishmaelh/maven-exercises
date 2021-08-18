package maven;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import java.util.Scanner;

public class Example {

    public static String userInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type something!");
        return userInput.nextLine();
    }

    public static void main(String[] args) {

        String input = userInput();

        StringUtils.isNumeric(input);
        {
            if (StringUtils.isNumeric(input)) {
                System.out.println("That is a number");
            } else {
                System.out.println("That is not a number");
            }
        }

        System.out.println(StringUtils.reverse(input));
        System.out.println(StringUtils.swapCase(input));
    }
}
