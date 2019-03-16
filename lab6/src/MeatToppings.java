public class MeatToppings implements IToppings,IBurgerIngredient{
    String topping;

    public MeatToppings(String topping) {
        this.topping=topping;
    }

    @Override
    public String getTopping() {
        return topping;
    }

    @Override
    public void printDescription() {
        System.out.println("-> |"+topping);
    }
}
