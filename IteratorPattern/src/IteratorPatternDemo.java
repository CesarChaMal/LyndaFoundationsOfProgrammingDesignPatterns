public class IteratorPatternDemo {
    private static void display(Menu menu) {
        System.out.println("Contents: ");
        Iterator iterator = menu.createIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        display(dinerMenu);

        Menu dinerCodeMenu=new DinerCodeMenu();
        display(dinerCodeMenu);
    }
}
