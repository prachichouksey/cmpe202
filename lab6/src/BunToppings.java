public class BunToppings implements IToppings,IBurgerIngredient{
    String topping;


    public BunToppings(String topping) {
        this.topping=topping;
    }

    @Override
    public String getTopping() {
        return topping;
    }

    @Override
    public void printDescription() {
        System.out.println(topping);
    }
}
