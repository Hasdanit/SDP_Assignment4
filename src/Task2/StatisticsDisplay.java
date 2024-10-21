package src.Task2;

public class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Statistics: " + temperature + "°C and " + humidity + "% humidity");
    }
}
