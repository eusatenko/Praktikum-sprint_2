package model;

public abstract class Food implements Discountable {

    private int amount;
    private double price;
    private boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //общая сумма товаров без скидки
    public double getTotalPrice() {
        return amount * price;
    }

    //общая сумма товаров со скидкой
    public double getTotalPriceWithDiscount() {
        return getTotalPrice() * (1 - getDiscount() / 100);
    }

    //общуя сумму всех вегетарианских фруктов в корзине без скидки
    public double getTotalPriceVegetarianFruitWithoutDiscount() {
        return isVegetarian ? getTotalPrice() : 0;
        //для себя - тоже самое, что if, называется Тенарный оператор,
        // ещё называют Элвис оператором (if (isVegetarian) {return isVegetarian ) else (return 0);)
    }

}
