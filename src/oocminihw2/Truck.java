/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author hasan
 */
public class Truck implements Drivable {
private String make;
private float speed;
private float direction;

    public Truck(String make) {
        this.make = make;
        speed = 0;
        direction =0;
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed;
        
    }

    @Override
    public void brake() {
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
        
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
   return speed;
    }

    @Override
    public String getMake() {
    return make;
    }

    @Override
    public String getType() {
    return "truck";
    }
    
    
}
