package LabAssignment5;

public class Truck implements Vehicle{
    
    @Override
    public void start(){
        System.out.println("Turn Key to Start!");
    }

    @Override
    public void stop(){
        System.out.println("Stop this Truck!");
    }

    @Override
    public void accelerate(){
        System.out.println("Speed this Truck Up!");
    }


    public static void main(String[] args){

        //creating a truck object
        Truck truck = new Truck();
        truck.start();
        truck.accelerate();
        truck.stop();
    }
}
