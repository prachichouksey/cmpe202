

public class Main {

    public static void main(String[] args) {
        /*GumballMachine gumballMachine = new GumballMachine(5,"quarter25");

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);*/
        GumballMachine gumballMachine=new GumballMachine(10,"quarter50");
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter(10);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
