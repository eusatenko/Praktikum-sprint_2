package model;

import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {

    private String colour;


    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if ("red".equals(colour)) {
            return DISCOUNT;
        }
        return 0;
    }
}