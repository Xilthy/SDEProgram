package Behavioral;

public class Cook_Cauliflower extends CookTemplate{
    @Override
    public void pourFood() {
        System.out.println("pour Cauliflower");
    }

    @Override
    public void pourSauce() {
        System.out.println("Add Pepper");
    }
}
