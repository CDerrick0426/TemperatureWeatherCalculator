/*
Denah Thach 
Group Project - C211 Problem Solving and Programming II
4/29/2023
*/
package temperatureWeatherCalculator;

import java.util.Random;

public class RandomTempAndWeather {
    private Random random;
    private String[] weatherConditions;
    
    public RandomTempAndWeather() {
        random = new Random();
        weatherConditions = new String[] {"sunny", "cloudy", "rainy", "windy"};
    }

    // method to generate a random temperature
    public int GenerateTemperature() {
        int minTemp = 0;
        int maxTemp = 100;
        int temperature = random.nextInt((maxTemp - minTemp) + 1) + minTemp;
        return temperature;
    }
    
    // method to get random weather. If temperature is below 32, it will be snowy
    public String GenerateWeather(int temperature) { 
        if (temperature < 32) {
            return "snowy";
        }
        else {
            return weatherConditions[random.nextInt(weatherConditions.length)];
        }
    }

    public static void main(String[] args) {
        RandomTempAndWeather randomTempAndWeather = new RandomTempAndWeather();
        int temperature = randomTempAndWeather.GenerateTemperature();
        String weather = randomTempAndWeather.GenerateWeather(temperature);
        System.out.println("The temperature outside is " + temperature + " degrees and it is " + weather + ".");
    }
}
