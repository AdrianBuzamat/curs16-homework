package ro.fasttrackit.curs16.ex2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ro.fasttrackit.curs16.ex2.Category.NEW;

class ShopTest {
    @Test
    @DisplayName("When an item is given THEN add it to te list of shop")
    void testAddItem(){
        Shop<Clothes> clothesShop = new Shop<>(List.of());

        clothesShop.addItem(new Clothes("Tricou", 55, NEW ));

    }

}