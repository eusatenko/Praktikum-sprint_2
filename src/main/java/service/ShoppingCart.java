package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {

        this.foods = foods;
    }

    //корзина без скидки
    public double ShoppingCartPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice = totalPrice + foods[i].getTotalPrice();
        }
        return totalPrice;

        /* для себя - ещё один способ пробежаться по массиву
        for (Food food : foods) {
            totalPrice = totalPrice + food.getTotalPrice();
        }
        */
    }

    //корзина со скидкой
    public double TotalPriceWithDiscount() {
        double totalPrice = 0.0;

        for (int i = 0; i < foods.length; i++) {
            totalPrice = totalPrice + foods[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }

    //всех вегетарианских продуктов в корзине без скидки
    public double TotalPriceVegetarianFruitWithoutDiscount() {
        double totalPrice = 0.0;

        for (int i = 0; i < foods.length; i++) {
            totalPrice = totalPrice + foods[i].getTotalPriceVegetarianFruitWithoutDiscount();
        }
        return totalPrice;
    }


}
