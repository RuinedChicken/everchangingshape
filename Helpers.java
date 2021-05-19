public class Helpers {

    // Helper function to get n^2
    public static double powerOfTwo(double a){
        return Math.pow(a, 2);
    }

    /* Gives us an array containing two random numbers that we'll use for arguments
    when passing a and b, which we get from the GenerateRandom class */
    public static int[] randomArr(){
        int randomA = GenerateRandom.generate();
        int randomB = GenerateRandom.generate();
        int[] randomArr = {randomA, randomB};
        return randomArr;
    }
}


