package Cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItalianCoffee extends CreateCoffee {
    List<String> itCoffee = new ArrayList<>();
    public void createCoffee(int coffeeType){
        new CreateItalianCoffee(coffeeType);
    }
    public List<String> getList() {
        return itCoffee;
    }
    class CreateItalianCoffee {
        public CreateItalianCoffee(int coffeeType){
            String[] flavor = {"Milk", "Vanilla", "Chocolate", "Marshmallow"};
            String name = "";
            double price = 0;
            if (coffeeType == 0){
                name = "Americano";
                price = ((Math.random()*3)+2);
            }
            else if (coffeeType == 1){
                name = "Espresso";
                price = ((Math.random()*1)+3);
            }
            else if (coffeeType == 2){
                name = "Latte";
                price = ((Math.random()*2)+2);
            }
            else if (coffeeType == 3){
                name = "Cappuccino";
                price = ((Math.random()*2)+5);
            }
            creating(name, price, flavor);
        }
        private void creating(String name, double price, String[] flavor){
            itCoffee.add(name);
            itCoffee.add (price + "");
            itCoffee.addAll(Arrays.asList(flavor));
        }
    }
}
