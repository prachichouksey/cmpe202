public class Context {
    private IPrintStrategy strategy;

    public Context(IPrintStrategy strategy){
        this.strategy = strategy;
    }

    public void printDescription(Order order){
        strategy.printDescription(order);
    }
}