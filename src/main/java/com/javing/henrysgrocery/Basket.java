package com.javing.henrysgrocery;

import static com.javing.henrysgrocery.Item.getByName;
import static java.lang.Double.parseDouble;
import static java.lang.String.format;

public class Basket {

    public double price(String ... items) throws IllegalArgumentException {

        double total = 0D;
        int soupCount = 0;
        int breadCount = 0;
        double totalBreadDiscount = 0D;

        for (String item : items) {

            if(item.equals("soup")) {
                soupCount++;
            }

            if(item.equals("bread")) {
                breadCount++;
            }

            total += getByName(item).getPrice();

        }

        if(soupCount > 0) {
            totalBreadDiscount = (soupCount / 2) * 0.4;
        }

        return parseDouble(format("%.2f", total - (totalBreadDiscount * breadCount)));
    }


}
