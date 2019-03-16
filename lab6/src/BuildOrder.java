public class BuildOrder {
    public static void main(String[] args)
    {
        Order burger=new Order("LBB",5.59,45);
        IBurgerIngredient patty=new Patty("BACON");
        IBurgerIngredient topBunToppings=new BunToppings("LETTUCE");
        IBurgerIngredient topBunToppings2=new BunToppings("TOMATO");
        IBurgerIngredient onMeatToppings= new MeatToppings("G ONION");
        IBurgerIngredient onMeatToppings2= new MeatToppings("JALA Grilled");
        burger.addChild(patty);
        burger.addChild(topBunToppings);
        burger.addChild(topBunToppings2);
        burger.addChild(onMeatToppings);
        burger.addChild(onMeatToppings2);
        IPrintStrategy customerReceiptStrategy=new CustomerReceiptStrategy();
        IPrintStrategy instructionReceiptStrategy=new InstructionReceiptStrategy();
        Context customerContext=new Context(customerReceiptStrategy);
        customerContext.printDescription(burger);
        Context instructionContext=new Context(instructionReceiptStrategy);
        instructionContext.printDescription(burger);


    }
}
