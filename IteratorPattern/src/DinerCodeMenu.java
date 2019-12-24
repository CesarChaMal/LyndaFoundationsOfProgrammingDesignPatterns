public class DinerCodeMenu implements Menu {
    Character[] menuItems = {
            'N',
            'C',
            'F',
            'E',
            'D'
    };

    @Override
    public Iterator<Object> createIterator() {
        return new DinerCodeMenuIterator(menuItems);
    }
}
