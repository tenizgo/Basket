public class Main {
    public static void main(String[] args) {
   //корзина 1
    Basket pashaBasket = new Basket(1000, 2500);
    pashaBasket.add("Молоко", 80, 1000);
    pashaBasket.add("Хлеб", 40, 400);
    pashaBasket.add("Пиво", 70, 500);
    pashaBasket.add("Чипсы", 50, 250);

    //Корзина 2
    Basket denisBasket = new Basket(400, 1000);
    denisBasket.add("Водка", 300, 1000);
    denisBasket.add("Веревка", 200, 100);
    denisBasket.add("Мыло", 20, 50);

    Basket vladaBasket = new Basket("Стол", 5000);


    pashaBasket.print("Корзина Паши: ");
    denisBasket.print("Корзина Дениса: ");
    vladaBasket.print("Корзина Влады: ");
    }
}
