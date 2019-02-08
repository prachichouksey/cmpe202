

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,"quarter25");

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        GumballMachine gumballMachineType2= new GumballMachine(8,"quarter50");
        gumballMachineType2.insertQuarter(25);
        gumballMachineType2.turnCrank();
        gumballMachineType2.insertQuarter(25);
        gumballMachineType2.turnCrank();
        System.out.println(gumballMachine);
        
        GumballMachine gumballMachineType3= new GumballMachine(10,"any50");
        gumballMachineType3.insertQuarter(25);
        gumballMachineType3.turnCrank();
        gumballMachineType3.insertQuarter(10);
        gumballMachineType3.turnCrank();
        gumballMachineType3.insertQuarter(25);
        gumballMachineType3.turnCrank();
        System.out.println(gumballMachine);
    }
}
