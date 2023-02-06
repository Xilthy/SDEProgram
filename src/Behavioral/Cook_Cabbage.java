package Behavioral;

public class Cook_Cabbage extends CookTemplate{
    @Override
    public void pourFood() {
        System.out.println("pour Cabbage");
    }

    @Override
    public void pourSauce() {
        System.out.println("Add pepper");
    }
}
