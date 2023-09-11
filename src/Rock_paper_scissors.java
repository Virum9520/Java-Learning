import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int choice = 0;
        while(choice!=4) {
            String you_win;
            System.out.println("What is your choice\n1.Rock\n2.Paper\n3.Scissors\n4.Exit");
            choice = sc.nextInt();
            System.out.println("Computer's choice is");
            int computer = random.nextInt(1, 4);
//rock = 1, paper=2, scissors=3;
            if(computer==1)
                System.out.println("Rock");
            else if (computer==2)
                System.out.println("Paper");
            else
                System.out.println("Scissors");
            if (choice > computer && choice != 3)
                you_win = "true";
            else if(choice < computer)
                you_win = "false";
            else
                you_win = "draw";
            System.out.println("You win = " + you_win);
        }

    }
}