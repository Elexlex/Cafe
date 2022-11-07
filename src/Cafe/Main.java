package Cafe;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int menu;
        System.out.println("\n\nGood morning!");
        System.out.println("Would you like to buy a coffee?\n1. Yes\n2. No");
        do{
            menu = num.nextInt();
        } while (menu>2||menu<1);
        if (menu == 2)
            System.out.println("Then what the hell are you doing here? Go away!");
        else
            buyingCoffee();
    }
    private static void buyingCoffee(){
        Scanner num = new Scanner(System.in);
        int menu;
        System.out.print("Okay, here is the list: ");
        CreateCoffee[] create = {new AmericanCoffee(), new ItalianCoffee(), new FrenchCoffee()};
        for (int r = 0; r<3; r++) {
            for (int i = 0; i < 4; i++) {
                create[r].createCoffee(i);
            }
        }
        for (int r = 0; r<3; r++) {
            List<String> list = create[r].getList();
            if (r == 0)
                System.out.print("\nAmerican Coffee: ");
            else if (r == 1)
                System.out.print("\nItalian Coffee: ");
            else
                System.out.print("\nFrench Coffee: ");
            for (int i = 0; i < 4; i++) {
                if (r == 0){
                    System.out.print("\n\t" + list.get(4*i));
                    double number = Double.parseDouble(list.get(1+(4*i)));
                    System.out.printf(" | price: %.2f$", number);
                    number = Double.parseDouble(list.get(2+(4*i)));
                    System.out.printf(" | discount: %.2f$", number);
                    number = Double.parseDouble(list.get(3+(4*i)));
                    System.out.printf(" | total price: %.2f$", number);
                }
                else {
                    System.out.print("\n\t" + list.get(6 * i));
                    double number = Double.parseDouble(list.get(1+(6*i)));
                    System.out.printf(" | price: %.2f$", number);
                }
            }
        }
        System.out.println("\n\nWhich coffee would you like?\n1. American\n2. Italian\n3. French");
        do{
            menu = num.nextInt();
        } while (menu>3||menu<1);
        int type;
        System.out.println("\nWhich type of coffee would you like?\n1. Americano\n2. Espresso\n3. Latte\n4. Cappuccino");
        do{
            type = num.nextInt();
        } while (type>4||type<1);
        type--;
        extraStuff(menu, type, create);
    }
    private static void extraStuff(int menu, int type, CreateCoffee[] create){
        Scanner num = new Scanner(System.in);
        List<String> list = create[menu-1].getList();
        double price;
        if (menu == 1){
            price = Double.parseDouble(list.get(3+(4*type)));
            System.out.print("\nSo you bought an american " + list.get(4 * type));
        }
        else if (menu == 2){
            price = Double.parseDouble(list.get(1+(6*type)));
            System.out.println("Would you like to buy a flavor to your coffee? (It will cost you 1$ extra)\n1. Yes\n2. No");
            do{
                menu = num.nextInt();
            } while (menu>2||menu<1);
            if (menu == 1){
                String line = choosingExtra(type, list);
                price += 1;
                System.out.print("\nSo you bought an italian " + list.get(6 * type) + " with a " + line + " flavor");
            }
            else
                System.out.print("\nSo you bought an italian " + list.get(6 * type));
        }
        else{
            price = Double.parseDouble(list.get(1+(6*type)));
            System.out.println("Would you like to buy a bagel to your coffee? (It will cost you 2$ extra)\n1. Yes\n2. No");
            do{
                menu = num.nextInt();
            } while (menu>2||menu<1);
            if (menu == 1){
                String line = choosingExtra(type, list);
                price += 2;
                System.out.print("\nSo you bought a french " + list.get(6 * type) + " with a " + line + " bagel");
            }
            else
                System.out.print("\nSo you bought a french " + list.get(6 * type));
        }
        System.out.printf("\nIt will cost you %.2f$\nGoodbye", price);
    }
    private static String choosingExtra(int type, List<String> list){
        Scanner num = new Scanner(System.in);
        int menu;
            System.out.println("\nWhich one?");
            System.out.println("1. " + list.get(2 + (6 * type)));
            System.out.println("2. " + list.get(3 + (6 * type)));
            System.out.println("3. " + list.get(4 + (6 * type)));
            System.out.println("4. " + list.get(5 + (6 * type)));
            do{
                menu = num.nextInt();
            } while (menu>4||menu<1);
            return list.get(menu+1 + (6 * type));
    }
}
