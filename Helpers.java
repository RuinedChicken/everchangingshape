public class Helpers {


    /**
     * Gives us n^2
     * @param a Num to exponentiate
     * @return a^2
     */
    public static double powerOfTwo(double a){
        return a * a;
    }

    /**
     * Gives us an array containing two random numbers that will be used for arguments
     * when passing a and b, which will be grabbed from the GenerateRandom class
     * @return random array consisting of two elements
     */

     // why did I do this? honestly, I don't know. I got caught in a
     // let's make everything dynamic! craze I suppose
    public static int[] randomArr(){
        int randomA = GenerateRandom.generate();
        int randomB = GenerateRandom.generate();
        int[] randomArr = {randomA, randomB};
        return randomArr;
    }
}


