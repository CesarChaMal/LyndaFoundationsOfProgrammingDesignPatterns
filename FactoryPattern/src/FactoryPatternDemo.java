public class FactoryPatternDemo {
    public static void main(String[] args) {
        Calendar calendar=new PacificCalendar();
        calendar.createCalendar();
        calendar.print();
    }
}
