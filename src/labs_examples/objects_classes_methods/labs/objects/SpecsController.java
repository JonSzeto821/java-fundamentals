package labs_examples.objects_classes_methods.labs.objects;

public class SpecsController {
    public static void main(String[] args) {
        Specs planeOne = new Specs("C400", 90, "international");
        Specs planeTwo = new Specs("C600", 77);
        Specs planeThree = new Specs("C700", "domestic");

        System.out.println(planeOne.model + " flies " + planeOne.type + " with a seating capacity of " + planeOne.cabinCapacity);
        System.out.println(planeTwo.model + " has a seating capacity of " + planeTwo.cabinCapacity);
        System.out.println(planeThree.model + " flies " + planeThree.type + " routes.");
    }
}
