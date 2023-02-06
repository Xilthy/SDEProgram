package Behavioral;

public abstract class CookTemplate {
    public void cook(){
        pourOil();
        pourFood();
        pourSauce();
        fry();
    }
    public void pourOil() {
        System.out.println("Pour oil");
    }
    public abstract void pourFood();
    public abstract void pourSauce();
    public void fry(){
        System.out.println("fry...");
    }
}
