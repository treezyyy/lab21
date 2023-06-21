public class Customer implements Customers{
    String username;
    Customer(String username){
        this.username = username;
    }
    @Override
    public void sudscribe(Communities title) {
        title.newSubsriber(this);
    }

    @Override
    public void resubscribe(Communities title) {
        title.deleteSubsctiber(this);
    }

    @Override
    public void info(String news, String title) {
        System.out.println(this.username + ", в сообществе " +"'" +  title + "'" + " новый пост: "+ news);
    }
}
