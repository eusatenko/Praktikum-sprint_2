import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        double discount = 0;

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.colour_red);
        Apple appleGreen = new Apple(8, 60, Colour.colour_green);

        ShoppingCart shoppingCart = new ShoppingCart(new Food[] {meat, appleRed,appleGreen});

        System.out.println("общая сумма товаров без скидки = " + shoppingCart.ShoppingCartPrice());
        System.out.println("общая сумма товаров со скидкой = " + shoppingCart.TotalPriceWithDiscount());
        System.out.println("общуя сумму всех вегетарианских фруктов в корзине без скидки = " + shoppingCart.TotalPriceVegetarianFruitWithoutDiscount());
    }
}
