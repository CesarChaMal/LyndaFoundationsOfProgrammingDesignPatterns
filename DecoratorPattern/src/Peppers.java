public class Peppers extends Toppings {
    Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peppers";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.2;
    }
}
