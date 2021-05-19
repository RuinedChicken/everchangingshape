public class GenerateRandom {
    public static int generate() {
        // Define min and max value
        int min = 0;
        int max = 10;
        
        // The formula generates values with the min and max included
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        return randomInt;   
    }
}
