package unbreakk1;

public class BananaWorld
{
    public static void main(String[] args)
    {
        // Create banana 1
        BananaCounter banana1 = new BananaCounter();
        banana1.thisBananaAteAnother(); // eats 1
        BananaCounter.oneMoreBananaEaten(); // total +1

        // Create banana 2
        BananaCounter banana2 = new BananaCounter();
        banana2.thisBananaAteAnother(); // eats 1
        BananaCounter.oneMoreBananaEaten(); // total +1

        // Create banana 3
        BananaCounter banana3 = new BananaCounter();
        banana3.thisBananaAteAnother(); // eats 1
        BananaCounter.oneMoreBananaEaten(); // total +1

        // Print details
        System.out.println("Banana 1: " + banana1);
        System.out.println("Banana 2: " + banana2);
        System.out.println("Banana 3: " + banana3);
    }
}
