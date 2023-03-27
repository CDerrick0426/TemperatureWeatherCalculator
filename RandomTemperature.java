/*
Denah Thach 
Group Project - C211 Problem Solving and Programming II
3/27/2023
*/
package temperatureWeatherCalculator;

import java.util.Random;

public class RandomTemperature {
    private Random random;
    
    public RandomTemperature() {
        random = new Random();
    }
    
    public int GenerateTemperature() {
        int minTemp = 0;
        int maxTemp = 100;
        int temperature = random.nextInt((maxTemp - minTemp) + 1) + minTemp;
        return temperature;
    }

    public static void main(String[] args) {
        RandomTemperature randomTemperature = new RandomTemperature();
        int temperature = randomTemperature.GenerateTemperature();
        System.out.println("The temperature outside is " + temperature + " degrees.");
    }
}