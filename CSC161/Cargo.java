public class Cargo {
    
    //setting up my variables 
    int contNum;
    String shipName;
    int tareWeight;
    int grossWeight;
    int cargoWeight;
    double cargoWeightPer;

    //creating a constructor to set values to my variables
    //and to find the value for the cargo and cargo per weight

    public Cargo(int contNum, String shipName, int tareWeight, int grossWeight){
        this.contNum = contNum;
        this.shipName = shipName;
        this.tareWeight = tareWeight;
        this.grossWeight = grossWeight;
        //calculating the cargo weight and cargo weight per
        this.cargoWeight = grossWeight - tareWeight;
        this.cargoWeightPer = cargoWeight * 100.0 / grossWeight;
    }

        //creating getters for my variables
        //so they can be used in my main class
        public int getContNum() { return contNum; }
        public String getShipName() { return shipName; }
        public int getTareWeight() { return tareWeight; }
        public int getGrossWeight() { return grossWeight; }
        public int getCargoWeight() { return cargoWeight; }
        public double getCargoWeightPer() { return cargoWeightPer; }
}

