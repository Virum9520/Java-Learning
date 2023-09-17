import java.util.Random;
import java.util.Scanner;

public class Guessing_game {
    public static void main(String[] args) {
        Game g1 = new Game();
        while (true){
            g1.take_input();
            g1.set_guesses();
            if(g1.guess>g1.num)
                System.out.println("Guess Lower");
            else if(g1.guess<g1.num)
                System.out.println("Guess Higher");
            else
                break;
        }
        System.out.print("You took ");
        g1.get_guesses();

    }
    public static class Game{
        int guess,num,no_of_guesses=0;
        public Game() {
            Random rand = new Random();
            num = rand.nextInt(0,1);
            System.out.println("Guess a number");
        }
        void take_input(){
            Scanner sc = new Scanner(System.in);
            ;
            guess = sc.nextInt();
        }
        boolean is_correct(){
            return guess==num;
        }
        void set_guesses(){
            no_of_guesses+=1;
        }
        void get_guesses(){
            System.out.println(no_of_guesses+" guesses");
        }
    }
}
