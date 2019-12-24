public class WeatherStation extends Subject {
    private float temperature;
    private float windSpeed;
    private float pressure;

    public WeatherStation() {
    }

    public WeatherStation(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure +
                '}';
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
