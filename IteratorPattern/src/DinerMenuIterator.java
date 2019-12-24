public class DinerMenuIterator implements Iterator<Object> {
    private String[] menuItems;
    private int currentIndex = -1;

    public DinerMenuIterator(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.length - 1;
    }

    @Override
    public String next() {
        return menuItems[++currentIndex];
    }
}
