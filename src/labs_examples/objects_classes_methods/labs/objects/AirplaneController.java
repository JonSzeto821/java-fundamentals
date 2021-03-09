package labs_examples.objects_classes_methods.labs.objects;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class AirplaneController {
    public static void main(String[] args) {
        Cabin cabin = new Cabin(true, 75);

        Model model = new Model("Boeing", "C300", 7);

        FlightRoute flightRoute = new FlightRoute("domestic");

        Type type = new Type("commercial");

        System.out.println(model.manufacturer + " has " + cabin.seatCapacity + " seats.");
        System.out.println("The " + model.name + " is a " + type.type + " flight for " + flightRoute.routes + " routes.");


//        exercise 4
        Cabin cabinString = new Cabin(true, 99);
        System.out.println(cabinString.toString());

        Model modelString = new Model("Qantas", "Q99", 3);
        System.out.println(modelString.toString());

        FlightRoute flightString = new FlightRoute("international");
        System.out.println(flightString.toString());

        Type typeString = new Type("military");
        System.out.println(typeString.toString());

        Airplane airplaneString = new Airplane(200.1, 150.5, cabinString, modelString, flightString, typeString);
        System.out.println(airplaneString.toString());
    }
}
