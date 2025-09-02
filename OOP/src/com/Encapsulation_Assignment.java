
package com;

class thermostat{
    private double temperatureCelsius;

    public thermostat(double temperatureCelsius){
        this.temperatureCelsius = 1;
        this.setTemperatureCelsius(temperatureCelsius);
    }

    //getter for celcius
    public double getTemperatureCelsius(){
        return this.temperatureCelsius;
    }

    //getter for farenheit
    public double getTemperatureFahrenheit(){
        double F = (temperatureCelsius *  9/5) + 32;
        return F;
    }

    //setter
    public void setTemperatureCelsius(double temperature){
        if(temperature > 40 || temperature < 0){
            System.out.println("enter valid temperature");
        }
        else{
            this.temperatureCelsius = temperature;
        }
    }

    public void display(){
        System.out.println("Temperature in celcius is: " + getTemperatureCelsius());
        System.out.println("Temperature in Farenhite is: " + getTemperatureFahrenheit() );
    }

}

public class Encapsulation_Assignment {
    public static void main(String[] args) {
        thermostat temperature1 = new thermostat(55);
        temperature1.display();
        System.out.println();

        temperature1.setTemperatureCelsius(50);
        temperature1.display();
        System.out.println();

        temperature1.setTemperatureCelsius(10);
        temperature1.display();

    }
}
