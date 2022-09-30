package model.constants;

import model.Discountable;

public class Discount implements Discountable {
    public static final double DISCOUNT = 60;

    @Override
    public double getDiscount() {
        return 0;
    }
}
