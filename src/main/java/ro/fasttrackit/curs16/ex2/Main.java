package ro.fasttrackit.curs16.ex2;

import java.util.List;

import static ro.fasttrackit.curs16.ex2.Category.*;

public class Main {
    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>(List.of(
                new Clothes("tricou", 33, NEW),
                new Clothes("bluza", 55, NEW),
                new Clothes("sapca", 12, REFURBISHED),
                new Clothes("pantaloni", 12, ON_SALE)
        ));

        clothesShop.addItem(new Clothes("pijama", 22, ON_SALE));
        System.out.println(clothesShop.findByCategory(ON_SALE));
        System.out.println(clothesShop.findWithLowerPrice(40));
        System.out.println(clothesShop.findByName("bluza"));
        System.out.println(clothesShop.findByName("mamaliga"));
        clothesShop.removeItem("sapca");
        System.out.println(clothesShop.findByName("sapca"));
    }
}
