import java.util.Scanner;
//relational operators
/*



 */


public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10:");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        if (inputNumber < 5) {
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you very happy today.");
        }


    }
}
