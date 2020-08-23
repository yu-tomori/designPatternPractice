package game;
import java.util.*;
import java.io.Serializable;

public class Memento implements Serializable {
    int money;
    ArrayList fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {
        this.fruits.add(fruit);
    }
    List getFruits() {
        return (List)fruits.clone();
    }
}