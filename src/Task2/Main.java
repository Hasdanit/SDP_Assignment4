package src.Task2;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        station.registerDisplay(currentDisplay);
        station.registerDisplay(statisticsDisplay);
        station.registerDisplay(forecastDisplay);

        station.setWeatherData(25.0, 65.0, 1013.0);
        station.setWeatherData(30.0, 70.0, 1012.0);
    }
}
