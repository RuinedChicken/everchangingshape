public class Properties {

    /* Prints us the property's value. Because I'm a filthy spaniard, string.format() gives me numbers
    such as "2,05", so I give it the US locale.*/
    
    public static void printProperty(String name, double property){
        System.out.println("The unknown object's " + name + " is: " + String.format(java.util.Locale.US,"%4f", property));
    }

    //                 ----- MASS -----
    // Mass: a² x b - coefficient
    public static double getMass(int a, int b, double coefficient){
        return Helpers.powerOfTwo(a) * b - coefficient;
    }
    //                 ----- PERIMETER -----
    // Perimeter: a² - b
    public static double getPerimeter(int a, int b){
        return Helpers.powerOfTwo(a) - b;
    }   
    //Volume: (a x b)² / ((a² - b) x coefficient)
    // if I don't make it doubles, the IDE complains when multiplying a*b
    public static double getVolume(double a, double b, double coefficient){
        return (Helpers.powerOfTwo(a * b)) / (Helpers.powerOfTwo(a) - b) * coefficient;
    }
    //                 ----- AREA -----
    // Area: a x b
    public static int getArea(int a, int b){
        return a * b;
    }
}
