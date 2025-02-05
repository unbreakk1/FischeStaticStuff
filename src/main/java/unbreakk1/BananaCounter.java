package unbreakk1;

public class BananaCounter
{
    static int totalBananasEaten = 0; // Total bananas eaten by ALL bananas
    int bananasEatenByThisBanana = 0; // Bananas eaten by this individual banana

    public static void oneMoreBananaEaten()
    {
        totalBananasEaten++;
    }

    public void thisBananaAteAnother()
    {
        bananasEatenByThisBanana++;
    }

    @Override
    public String toString()
    {
        return "Total Bananas Eaten by All: " + totalBananasEaten +
                ", Bananas Eaten by This One: " + bananasEatenByThisBanana;
    }

}
