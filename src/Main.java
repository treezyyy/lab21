public class Main {
    public static void main(String[] args) {
        Communitie fortnitetime = new Communitie("Киберсопрт информация");
        Communitie flipside = new Communitie("Тренды репа");
        Communitie poizonnews = new Communitie("Новости брендов");
        Communitie nrmusic = new Communitie("Новости музыки");

        Customer customer1 = new Customer("Никитос");
        customer1.sudscribe(fortnitetime);
        customer1.sudscribe(flipside);
        customer1.sudscribe(poizonnews);

        Customer customer2 = new Customer("Кирюша");
        customer2.sudscribe(fortnitetime);
        customer2.sudscribe(flipside);
        customer2.sudscribe(poizonnews);
        customer2.sudscribe(nrmusic);
        
        fortnitetime.news("Впервые команда '123' победила международный турнир");
        flipside.news("Реперы столкнулись в батле на побережье черного моря");
        poizonnews.news("Nike предстваил новые кроссовки с крыльями");
        nrmusic.news("Исполнитель flipside победил на премии 2023");
    }
}