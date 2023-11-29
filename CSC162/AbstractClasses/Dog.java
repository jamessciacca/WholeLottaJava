package AbstractClasses;

abstract class Dog{

        String breed;

        public void bark(){
            System.out.println("Bark!");
        }

        //this is an abstract method, its has no code but allows all dogs to have the ability to poop!
        public abstract void poop();
    }
