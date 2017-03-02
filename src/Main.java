/**
 * Created by JamesHartanto on 3/2/17.
 */
public class Main {
    public static void main(String[] args) {
        //1) Adding 4 to 5 and then subtracting 3
        System.out.println(5 + 4 - 3);

        //2) Order or operations of prime numbers without and with parenthesis, and no difference in final value
        System.out.println(2 + 3 * 5 - 7 / 11 + 13 * 17 / 19);
        System.out.println(2 + 3 * 5 - 7 / 11 + (13 * 17) / 19);

        //3) Order of operations with variables
        String hahaha = "What";
        int int1 = 5;
        int int2 = 10;
        System.out.println(hahaha + (int1 + int2 * int2) + int1);

        //4) Creating int and double variables to test out dividing
        int x1 = 100;
        int x2 = 3;
        double y1 = 33.0;
        double y2 = 7.0;
        System.out.println(x1 / x2);
        System.out.println(x1 / y1);
        System.out.println(x1 / y2);
        System.out.println(y1 / x1);
        System.out.println(y1 / x2);
        System.out.println(y1 / y2);

        //5) Changing int variable values
        int a = 50;
        a = a + 5;
        System.out.println(a);

        //6) Changing variable data type... didn't work
        int b = 5;
        System.out.println(b);
        //double b = 5.5;
        //System.out.println(b);
        //String b = "I do not want to be an integer anymore";
        //System.out.println(b);

        //7) Concatenate strings
        String ha = "hahaha";
        String he = "hehe";
        System.out.println(ha + he + ha);

        //8) Combining string and int/double
        int x = 5;
        double y = 99.9;
        String lol = "hahehuheha";
        System.out.println(lol + "*" + y + x);

        //9) Changing variable values and making a sentence
        int youngGuy = 5;
        double oldGuy = 10.5;
        String firstPart = "The young guy is ";
        String secondPart = " years old. The old guy is ";
        String thirdPart = " years old.";
        System.out.println(firstPart + youngGuy + secondPart + oldGuy + thirdPart);
        String after5Years = "After a multiple of 5 years...";
        youngGuy = youngGuy * 5;
        oldGuy = oldGuy * 5;
        System.out.println(after5Years + firstPart + youngGuy + secondPart + oldGuy + thirdPart);

        //10) Math makes no sense in Java
        double m = 5;
        System.out.println(m / 0 - m / 0);
        System.out.println(2 * m / 0 - m / 0);
    }
}
