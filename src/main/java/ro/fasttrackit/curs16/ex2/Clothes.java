package ro.fasttrackit.curs16.ex2;

public record Clothes(String name, int price, Category category) implements ShopItem {
    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }
}
