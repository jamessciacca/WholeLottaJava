package LabAssignment5;

public class Car implements Vehicle{

    @Override
    public void start(){
        System.out.println("Push to Start!");
    }

    @Override
    public void stop(){
        System.out.println("Hit the Brakes!");
    }

    @Override
    public void accelerate(){
        System.out.println("Hit the Gas!");
    }

    public static void main(String[] args){
        Car car = new Car();
        car.start();
        car.accelerate();
        car.stop();
    }
}