package structural;

public class MySpeakDaoProxy implements SpeckDao{
    private MySpeakDao speakDao;

    public MySpeakDaoProxy(MySpeakDao speakDao) {
        this.speakDao = speakDao;
    }

    @Override
    public void speak() {
        System.out.println("Proxy finished");
        speakDao.speak();
    }
}
