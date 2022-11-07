package Cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrenchCoffee extends CreateCoffee{
    List<String> frCoffee = new ArrayList<>();
    public void createCoffee(int coffeeType){
        new CreateFrenchCoffee(coffeeType);
    }
    public List<String> getList() {
        return frCoffee;
    }
    class CreateFrenchCoffee {
        public CreateFrenchCoffee(int coffeeType){
            String[] bakery = {"Strawberry", "Chocolate", "Regular", "Blueberry"};
            String name = "";
            double price = 0;
            if (coffeeType == 0){
                name = "Americano";
                price = ((Math.random()*3)+2)*1.5;
            }
            else if (coffeeType == 1){
                name = "Espresso";
                price = ((Math.random()*1)+3)*1.5;
            }
            else if (coffeeType == 2){
                name = "Latte";
                price = ((Math.random()*2)+2)*1.5;
            }
            else if (coffeeType == 3){
                name = "Cappuccino";
                price = ((Math.random()*2)+5)*1.5;
            }
            creating(name, price, bakery);
        }
        private void creating(String name, double price, String[] bakery){
            frCoffee.add(name);
            frCoffee.add (price + "");
            frCoffee.addAll(Arrays.asList(bakery));
        }
    }
}
