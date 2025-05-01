 class Car {
    private int speed;
    private int milage;
    Car(int speed,int milage){
        this.speed=speed;
        this.milage=milage;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getMilage(){
        return milage;
    }

    public void setMilage(int milage){
            this.milage=milage;
    }
    
}

public class BasicExample{
    public static void main(String[] args) {
        //Constructor revision , accessor and mutator
        Car honda=new Car(20,45);
        System.out.println(honda.getSpeed());
        System.out.println(honda.getMilage());
        honda.setMilage(40);
        System.out.println(honda.getMilage());

    }
}