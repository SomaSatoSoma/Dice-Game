import java.util.Random;
public class Dicegame{
public static void main(String[] args) {
    int Total = 0;
    Random random = new Random();
    System.out.println("Rolling dice...");
    for(int i = 0;i < 2;i++){
    int diceRoll = random.nextInt(6) + 1;
    Total += diceRoll;
    System.out.println("Die " + i+1 + ": " + diceRoll); 
    }
    System.out.println("Total value: " + Total);
}
}