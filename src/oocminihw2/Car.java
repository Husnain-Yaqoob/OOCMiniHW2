/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author hasan
 */
public class Car extends Vehicle {

    public Car(String make, int numPassengers) {
        this.make = make;
        this.numPassengers = numPassengers;
        numWheels= 4;
        type = "Car";
    }
    
    public void start(){
        System.out.println("Starting the car");
       speed =10;
        
    }
    public void stop(){
        System.out.println("stopping the car");
        speed=0;
        
    }
    
}
