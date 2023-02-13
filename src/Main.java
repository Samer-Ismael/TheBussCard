import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int amount1 = 500;
        int amount2 = 200;
        int amount3 = 100;

        int refill = 0;

        while (input > 0 && input >= amount1){
            input = input - amount1;
            refill++;
        }
        while (input > 0 && input >= amount2){
            input = input - amount2;
            refill++;
        }
        while (input > 0 && input >= amount3){
            input = input - amount3;
            refill++;
        }
        System.out.println(refill);
    }
}