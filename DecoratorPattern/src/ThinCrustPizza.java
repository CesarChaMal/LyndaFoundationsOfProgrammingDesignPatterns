public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza() {
        description = "Thin crust pizza";
    }

    @Override
    public double cost() {
        return 5;
    }
}
