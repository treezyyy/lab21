import java.util.ArrayList;
import java.util.List;

public class Communitie implements Communities{
    String title;
    List<Customers> subscribers;
    List<String> news;
    Communitie(String title){
        this.title = title;
        this.news = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    void news(String news){
        this.news.add(news);
        decision();
    }

    @Override
    public void newSubsriber(Customers username) {
        subscribers.add(username);
    }

    @Override
    public void deleteSubsctiber(Customers username) {
        subscribers.remove(username);
    }

    @Override
    public void decision() {
        for(Customers username:subscribers){
            username.info(news.get(news.size()-1), this.title );
    }
}}
