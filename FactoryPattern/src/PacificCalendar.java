public class PacificCalendar extends Calendar {
    public PacificCalendar() {
        zone = ZoneFactory.getZone(ZoneType.PACIFIC);
    }

    @Override
    public void createCalendar() {
        System.out.println("PacificCalendar is created");
    }
}
