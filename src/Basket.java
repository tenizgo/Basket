public class Basket {
    private int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private int totalWeight = 0;

    public Basket() {
        items = "Список товаров:";
        this.limit = 100000;
        this.totalWeight = 3000;
    }

    public Basket(int Limit) {
        this();
        this.limit = Limit;
    }

    public Basket(String items, int TotalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public int getCount() {
        return count;
    }


    public void add(String name, int price, double weight) {
        add(name, price, 0);
    }

    public void add(String name, int price, int count, double weight) {
       weight = weight + totalWeight;
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Ошибка :(");
        }
        items = items + "\n" + name + " - " + count + " шт. - " + price + weight;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
