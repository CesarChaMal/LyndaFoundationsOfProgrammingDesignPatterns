public abstract class Calendar {
    protected Zone zone;

    public void print() {
        System.out.println(zone);
    }

    public abstract void createCalendar();
}
