package interviewquestions;

import java.util.Scanner;

public class RegExpExample {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        System.out.println(input);
        // removing only NUMERICAL VALUES

        //input =input.replaceAll("\\d",""); // method1
        //input =input.replaceAll("[0-9]",""); // method2
        //input =input.replaceAll("[^A-Za-z]","");// method3

        // remove special characters \\w -->word character, \\W -->non-word character
//        input=input.replaceAll("\\W",""); // non-word char replace with space
//        System.out.println(input);

        // Get only alphabets
        input =input.replaceAll("[^A-Za-z]","");
        System.out.println(input);




    }
}
