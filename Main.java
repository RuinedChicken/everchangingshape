import java.util.Arrays;

/* Assignment: The everchanging shape
Scientists were given a mass of unknown origin that kept warping every exact hour to study and find different measurements for it.
 After a long time of studying the weird mass, the scientist managed to find it's basic measurements. They are the following:
- Mass: a² x b - coefficient
- Perimeter: a² - b
- Volume: (a x b)² / ((a² - b) x coefficient)
- Area: a x b
The coefficient is a constant variable that shouldn't be modified and has a value of 5.62.
Create methods (functions) for the above mentioned measurements. Bonus points for:
- Code reusability (or even just idenfitying spots that could be re-used) */

public class Main{

    static final double COEFFICIENT = 5.6;

    public static void main(String[] args){

        /* Since we're going to be needing a and b over again, let's get them
        from a function in the Helpers class */
        int[] unstableParameters = Helpers.randomArr();
        System.out.println("The random properties of the object were: " + Arrays.toString(unstableParameters));

        /* I would like to dinamically determine the name of the property I'm introducing
        in the printProperty method, but I can't figure out how :( */

        double mass = Properties.getMass(unstableParameters[0], unstableParameters[1], COEFFICIENT);
        Properties.printProperty("mass", mass);
        double perimeter = Properties.getPerimeter(unstableParameters[0], unstableParameters[1]);
        Properties.printProperty("perimeter", perimeter);
        double volume = Properties.getVolume(unstableParameters[0], unstableParameters[1], COEFFICIENT);
        Properties.printProperty("volume", volume);
        double area = Properties.getArea(unstableParameters[0], unstableParameters[1]);
        Properties.printProperty("area", area);  
        }

}
