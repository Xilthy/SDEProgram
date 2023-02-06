package structural;

public class Client {
    public static void main(String[] args) {
        MySpeakDaoProxy mySpeakDaoProxy = new MySpeakDaoProxy(new MySpeakDao());
        mySpeakDaoProxy.speak();

    }
}
