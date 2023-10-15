/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author hasan
 */
public class AirBNb  implements Flyable{
private float altitude;

@Override
public void changeAltitude(float change){
    altitude+=change;
    
}
    @Override
    public float getAltitude(){
        return altitude;
    }

    @Override
    public void accelerate(float speed) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void brake() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void turn(float angle) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public float getDirection() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public float getSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getMake() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
