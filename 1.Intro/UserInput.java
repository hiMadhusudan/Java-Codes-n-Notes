// importing Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //creating object (sc)
        Scanner sc = new Scanner(System.in);

        //getting inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); //string input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); //integer input
        System.out.print("Enter your weight: ");
        float weight = sc.nextFloat(); //float input

        //printing on screen
        System.out.println(name + " is " + age + " year old and weigh " + weight + " kgs.");

        //closing sc object to prevent resource leak
        sc.close();
    }
}
