public abstract class ZoneFactory {
    public static Zone getZone(ZoneType zoneType) {
        Zone zone = null;
        switch (zoneType) {
            case CENTRAL:
                zone = new ZoneUSCentral();
                break;
            case EASTERN:
                zone = new ZoneUSEastern();
                break;
            case MOUNTAIN:
                zone = new ZoneUSMountain();
                break;
            case PACIFIC:
                zone = new ZoneUSPacific();
                break;
        }
        return zone;
    }
}
