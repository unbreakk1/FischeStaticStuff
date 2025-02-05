package unbreakk1;

public class BananaWorld
{
    public static void main(String[] args)
    {
        BananaCounter banana1 = new BananaCounter();
        banana1.thisBananaAteAnother(); // banana 1 eats banana
        BananaCounter.oneMoreBananaEaten(); // total +1

        BananaCounter banana2 = new BananaCounter();
        banana2.thisBananaAteAnother(); // banana 2 eats banana
        BananaCounter.oneMoreBananaEaten(); // total +1

        BananaCounter banana3 = new BananaCounter();
        banana3.thisBananaAteAnother(); // banana 3 eats banana
        BananaCounter.oneMoreBananaEaten(); // total +1

        // Print details
        System.out.println("Banana 1: " + banana1);
        System.out.println("Banana 2: " + banana2);
        System.out.println("Banana 3: " + banana3);
    }
}