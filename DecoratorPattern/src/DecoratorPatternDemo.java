public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        pizza = new Peppers(pizza);
        System.out.println(pizza.getDescription() + " : " + pizza.cost());
    }
}
