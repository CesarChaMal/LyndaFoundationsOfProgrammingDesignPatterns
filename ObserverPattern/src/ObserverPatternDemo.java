public class ObserverPatternDemo {
    public static void main(String[] args) {
        Observer userInterface = new UserInterface();
        Observer loggerInterface = new LoggerInterface();
        Subject weatherStation = new WeatherStation(80, 65, 30.4f);
        weatherStation.addObserver(userInterface);
        weatherStation.addObserver(loggerInterface);
        weatherStation.notifyObservers(weatherStation);
    }
}
