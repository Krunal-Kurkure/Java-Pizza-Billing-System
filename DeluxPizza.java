package bill;
public class DeluxPizza extends pizza{
    public DeluxPizza(Boolean veg) 
    {
    super(veg);
    //super.addExtracheese();
    //super.addExtraToppings();
    }
    @Override
    public void addExtracheese(){
        this.price += extracheesePrice;
    }

    public void addExtraTopping(){
        this.price += extraToppingPrice;
    }
}

