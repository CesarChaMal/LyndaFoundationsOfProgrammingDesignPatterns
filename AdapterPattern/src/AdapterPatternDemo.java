public class AdapterPatternDemo {
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        Duck mallardDuck=new MallardDuck();
        testDuck(mallardDuck);

        System.out.println();

        Drone drone=new SuperDrone();
        Duck droneAdapter=new DroneAdapter(drone);
        testDuck(droneAdapter);
    }
}
