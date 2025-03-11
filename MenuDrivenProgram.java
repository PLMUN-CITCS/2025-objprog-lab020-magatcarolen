import java.util.Scanner;

public class MenuDrivenProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            
            displayMenu();
            System.out.print("\nEnter your choice: ");
            int choose = sc.nextInt();

            handleMenuChoice(choose);
        }

    }
    public static void displayMenu(){
        System.out.println("\n---Menu---");
        System.out.println("1. Greet User" +
        "\n2. Check Even/Odd" +
        "\n3. Exit");
    }
    public static void handleMenuChoice(int choice){
        Scanner sc = new Scanner(System.in);

        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd();
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!..");
            System.exit(0);
        } else {
            System.out.println("Invalid Input, try again.");
        }

    }
    public static void greetUser(){
        System.out.print("Hello! Welcome! ");
    }
    public static void checkEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }

    }

}