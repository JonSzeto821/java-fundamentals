package labs_examples.objects_classes_methods.labs.objects;

public class Specs {
    String model;

    int cabinCapacity;

    String type;

    public Specs(String model, int cabinCapacity, String type) {
        this.model = model;
        this.cabinCapacity = cabinCapacity;
        this.type = type;
    }

    public Specs(String model, int cabinCapacity) {
        this.model = model;
        this.cabinCapacity = cabinCapacity;
    }

    public Specs(String model, String type) {
        this.model = model;
        this.type = type;
    }
}
