package Lab8;

public class Lab8 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addConsumerGoods(new ConsumerGoods(100d, "Sausage", 1, 100));
        manager.addConsumerGoods(new ConsumerGoods(200d, "Cheese", 2, 200));
        manager.addConsumerGoods(new ConsumerGoods(300d, "Meat", 3, 300));
        manager.addConsumerGoods(new ConsumerGoods(400d, "Chicken", 4, 400));
        manager.addConsumerGoods(new ConsumerGoods(500d, "Goose", 5, 500));
        manager.display();

        ConsumerGoods g1 = new ConsumerGoods(100d, "Sausage", 1, 100);
        ConsumerGoods g2 = new ConsumerGoods(100d, "Sausage", 1, 100);
        System.out.println(g1.equals("Hello"));
    }
}
