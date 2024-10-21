package src.Task2;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }
}