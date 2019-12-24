public class Zone {
    String displayName;
    int offset;

    public Zone(String displayName, int offset) {
        this.displayName = displayName;
        this.offset = offset;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "displayName='" + displayName + '\'' +
                ", offset=" + offset +
                '}';
    }
}
