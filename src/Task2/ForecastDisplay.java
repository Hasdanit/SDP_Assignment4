package src.Task2;

public class ForecastDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Forecast: " + (temperature + 1) + "°C");
    }
}