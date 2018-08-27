class Car {

    // Cwiczenie z poliformizmu

    public static void main(String[] args) {

        Car car=new Car("Based car", 4);

        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.acceleration());
        System.out.println(car.brake());
        System.out.println();

        Ford ford=new Ford("ST220", 6);

        System.out.println(ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.acceleration());
        System.out.println(ford.brake());
        System.out.println();

        Audi audi=new Audi("A6", 8);

        System.out.println(audi.getName());
        System.out.println(audi.startEngine());
        System.out.println(audi.acceleration());
        System.out.println(audi.brake());
        System.out.println();

        BMW bmw=new BMW("M5", 10);
        System.out.println(bmw.getName());
        System.out.println(bmw.startEngine());
        System.out.println(bmw.acceleration());
        System.out.println(bmw.brake());

    }

    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;

    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car - startEngine()";
}

    public String acceleration(){
        return "Car - acceleration()";
    }

    public String brake(){
        return "Car - brake()" ;
    }
}

class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" ST220 - startEngine()";
    }

    @Override
    public String acceleration() {
        return getClass().getName()+" ST220 - acceleration()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" ST220 - brake()";
    }
}

class Audi extends Car{

    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "RS6 - startEngine()";
    }

    @Override
    public String acceleration() {
        return "RS6 - acceleration()";

    }

    @Override
    public String brake() {
        return "RS6 - brake()";

    }
}

class BMW extends Car{

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String acceleration() {
        return super.acceleration();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}


