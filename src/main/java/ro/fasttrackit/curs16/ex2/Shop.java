package ro.fasttrackit.curs16.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private List<T> items = new ArrayList<>(List.of());

    public Shop(List<T> items) {
        if (items == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.items.addAll(items);
    }

    public void addItem(T item) {
        if (item == null || items.isEmpty()) {
            throw new IllegalArgumentException("Insert a valid item");
        }
        this.items.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.category().equals(cat)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        if (maxPrice < 0) {
            throw new IllegalArgumentException("Insert price above 0");
        }
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.price() < maxPrice) {
                result.add(item);
            }
        }
        return result;
    }

    //
    public Optional<T> findByName(String name) {
        Optional<String> check = Optional.ofNullable(name);
        if (check.isPresent()) {
            for (T item : items) {
                if (item.name().equals(name)) {
                    return Optional.of(item);
                }
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
        Optional<String> checkName = Optional.ofNullable(name);
        if (checkName.isPresent()) {
            for (T item : items) {
                if (item.name().equals(name)) {
                    items.remove(item);
                    return Optional.of(item);
                }
            }
        }
        return Optional.empty();
    }
}
