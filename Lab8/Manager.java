package Lab8;

public class Manager {
    Goods[] goods;
    private int count;

    public Manager(){
        goods = new ConsumerGoods[20];
        count = 0;
    }

    public void addConsumerGoods(ConsumerGoods g){
        try {
            if (count >= 20) throw new Exception("Arrays of goods full!!!");
            if (g.getId() <= 0) throw new IllegalArgumentException("Id is not correct");
            if (g.getPrice() <= 0) throw new IllegalArgumentException("Price is not correct");
            if (g.getWeight() <= 0) throw new IllegalArgumentException("Weight is not correct");
            goods[count++] = g;
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(goods[i]);
        }
    }

}
