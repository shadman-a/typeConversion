package typeConversion;

import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) {
        System.out.println("Give me a number Please");
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        double bigNumber = Double.valueOf(input).doubleValue();
        System.out.println("The Double value is: " + bigNumber);
        System.out.println("The Float value is: " + (float)bigNumber);
        System.out.println("The Long value is: " + (long)bigNumber);
        System.out.println("The int value is: " + (int)bigNumber);
        System.out.println("The short value is: " + (short)bigNumber);
        System.out.println("The byte value is: " + (byte)bigNumber);


    }
}
