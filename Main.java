package bill;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("-------------------------Welcome to Pizza Shop--------------------------");
        System.out.println("Which pizza: (1.veg pizza   2.Non-Veg pizza  3.Delux Veg Pizza   4.Delux Non-veg pizza)");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();


        switch (ch) {
            case 1:
                pizza VegPizza = new pizza(true);
                VegPizza.addExtraTopping();
                VegPizza.addExtracheese();
                VegPizza.takeAway();
                VegPizza.getbill();               
                break;

                case 2:
                pizza nonVegPizza = new pizza(false);
                nonVegPizza.addExtraTopping();
                nonVegPizza.addExtracheese();
                nonVegPizza.takeAway();
                nonVegPizza.getbill();                
                break;

                case 3:
                DeluxPizza Veg = new DeluxPizza(true);
                Veg.addExtraTopping();
                Veg.addExtracheese();
                Veg.takeAway();
                Veg.getbill();               
                break;

                case 4:
                DeluxPizza NonVeg = new DeluxPizza(true);
                NonVeg.addExtraTopping();
                NonVeg.addExtracheese();
                NonVeg.takeAway();
                NonVeg.getbill();               
                break;

        }














    }
}
