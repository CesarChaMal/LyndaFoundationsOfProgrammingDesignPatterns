public class DinerCodeMenuIterator implements Iterator<Object> {
    private Character[] menuItems;
    private int currentIndex = -1;

    public DinerCodeMenuIterator(Character[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.length - 1;
    }

    @Override
    public Character next() {
        return menuItems[++currentIndex];
    }
}
