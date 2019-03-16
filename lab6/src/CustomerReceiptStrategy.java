public class CustomerReceiptStrategy implements IPrintStrategy {
    @Override
    public void printDescription(Order order) {
        double tax=0d,total=0d;
        System.out.println("================");
        System.out.println("Customer Receipt");
        System.out.println("================\n\n");
        System.out.println("FIVE GUYS");
        System.out.println("Order Number :" + order.orderNumber);
        System.out.println(order.name);
        order.printAll();
        System.out.println("Sub.Total  "+order.price);
        tax=order.price*(0.09);
        total=order.price+tax;
        System.out.println("Tax:       "+tax);
        System.out.println("Total:     "+total);

    }
}
