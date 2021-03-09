package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
    double fuelCapacity;

    double currentFuelLevel;

    Cabin cabin;

    Model model;

    FlightRoute routes;

    Type type;

    public Airplane(double fuelCapacity, double currentFuelLevel, Cabin cabin, Model model, FlightRoute routes, Type type) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.cabin = cabin;
        this.model = model;
        this.routes = routes;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", cabin=" + cabin +
                ", model=" + model +
                ", routes=" + routes +
                ", type=" + type +
                '}';
    }
}

class Cabin {
    boolean firstClass;

    int seatCapacity;

    public Cabin(boolean firstClass, int seatCapacity) {
        this.firstClass = firstClass;
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return "Cabin{" +
                "firstClass=" + firstClass +
                ", seatCapacity=" + seatCapacity +
                '}';
    }
}

class Model {
    String manufacturer;

    String name;

    int age;

    public Model(String manufacturer, String model, int age) {
        this.manufacturer = manufacturer;
        this.name = model;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Model{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class FlightRoute {
    String routes;

    public FlightRoute(String routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "FlightRoute{" +
                "routes='" + routes + '\'' +
                '}';
    }
}

class Type {
    String type;

    public Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}
