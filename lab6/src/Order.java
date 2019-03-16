import java.util.ArrayList;

public class Order implements IComposite{
    ArrayList<IBurgerIngredient> compositeBurger=new ArrayList<>();
    String name;
    double price;
    int orderNumber;
    public Order(String name, double price, int orderNumber) {
        this.name=name;
        this.price=price;
        this.orderNumber=orderNumber;
    }


    public void addChild(IBurgerIngredient ingredient) {
        compositeBurger.add(ingredient);
    }

    @Override
    public void removeChild(IBurgerIngredient ingredient) {
        compositeBurger.remove(ingredient);
    }


    public void printOrder(String ingredient) {

        for(IBurgerIngredient obj:compositeBurger) {
            if(obj.getClass().getName()==ingredient)
                obj.printDescription();
        }

    }


    public void printAll() {
        for(IBurgerIngredient obj:compositeBurger) {
                obj.printDescription();
        }
    }
}
