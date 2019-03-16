public class Patty implements IBurgerIngredient{
    String name;
    public Patty(String patty) {
        this.name=patty;
    }

    @Override
    public void printDescription() {
        System.out.println("{{{"+name+"}}}");
    }
}
