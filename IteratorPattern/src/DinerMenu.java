public class DinerMenu implements Menu {
    String[] menuItems = {
            "Noodles",
            "Chopsuey",
            "Fried rice",
            "Egg Curry",
            "Dessert"
    };

    @Override
    public Iterator<Object> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
