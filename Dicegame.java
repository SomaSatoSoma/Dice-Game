import java.util.Random;
import java.util.Scanner;
public class Dicegame{
public static void main(String[] args) {
System.out.println("What is your name?");
System.out.print("> ");
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");

    int Total = 0;
    Random random = new Random();
    System.out.println("Rolling dice...");
    for(int i = 0;i < 2;i++){
    int diceRoll = random.nextInt(6) + 1;
    Total += diceRoll;
    System.out.println("Die " + (i+1) + ": " + diceRoll); 
    }
    System.out.println("Total value: " + Total);
    if (Total > 7) {
    System.out.println("You won!");
}
 else{
    System.out.println("You lost!");
}
}
}