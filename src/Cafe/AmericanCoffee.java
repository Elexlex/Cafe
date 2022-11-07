package Cafe;

import java.util.ArrayList;
import java.util.List;

public class AmericanCoffee extends CreateCoffee {
    List<String> amCoffee = new ArrayList<>();
    public void createCoffee(int coffeeType){
        new CreateAmericanCoffee(coffeeType);
    }
    public List<String> getList() {
        return amCoffee;
    }
    class CreateAmericanCoffee {
        public CreateAmericanCoffee(int coffeeType){
            String name = "";
            double price = 0, discount = 0, totalPrice = 0;
            if (coffeeType == 0){
                name = "Americano";
                price = ((Math.random()*3)+2)*0.5;
                discount = price*(Math.random()*0.5);
                totalPrice = price-discount;
            }
            else if (coffeeType == 1){
                name = "Espresso";
                price = ((Math.random()*1)+3)*0.5;
                discount = price*(Math.random()*0.3);
                totalPrice = price-discount;
            }
            else if (coffeeType == 2) {
                name = "Latte";
                price = ((Math.random() * 2) + 2) * 0.5;
                discount = price * (Math.random() * 0.4);
                totalPrice = price - discount;
            }
            else if (coffeeType == 3) {
                name = "Cappuccino";
                price = ((Math.random() * 2) + 5) * 0.5;
                discount = price * (Math.random() * 0.6);
                totalPrice = price - discount;
            }
            creating(name, price, discount, totalPrice);
        }
        private void creating(String name, double price, double discount, double totalPrice){
            amCoffee.add(name);
            amCoffee.add ("" + price);
            amCoffee.add ("" + discount);
            amCoffee.add ("" + totalPrice);
        }
    }
}
