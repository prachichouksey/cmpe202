public class InstructionReceiptStrategy implements IPrintStrategy {
    @Override
    public void printDescription(Order burger) {
        System.out.println("\n\n================");
        System.out.println("Packing Receipt");
        System.out.println("================\n\n");
        System.out.println("Order Number:"+burger.orderNumber);
        System.out.println("FIVE GUYS");
        System.out.println(burger.name);
        burger.printOrder("BunToppings");
        burger.printOrder("MeatToppings");
        burger.printOrder("Patty");

    }
}
