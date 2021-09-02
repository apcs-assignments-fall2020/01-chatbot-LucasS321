import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String input1 = scan.nextLine();
        System.out.println("Hello, "+input1+"! It's nice to meet you!");

        System.out.println("What is your favorite movie "+input1+"?");
        String input2 = scan.nextLine();
        System.out.println("I wish I could watch "+input2+" but im a chatbot so alas, I can't.");

        System.out.println("What is your favorite sport "+input1+"?");
        String input3 = scan.nextLine();
        System.out.println("I've heard of "+input3+" from other users too, it sounds like so much fun :(... Wish I could play");

        System.out.println("What is your favorite school period?");
        String input4 = scan.nextLine();
        System.out.println("Mine too! I love "+input4+"!");

        System.out.println("Do you like windows or mac more, "+input1+"?");
        String input5 = scan.nextLine();
        System.out.println(input5+"... Interesting choice :)");

        scan.close();
    }
}
