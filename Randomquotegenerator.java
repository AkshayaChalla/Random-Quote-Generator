import java.util.Random;

public class Randomquotegenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "dont let yesterday take up too much of today ",
            "it is better to fail in originality than to succed in imitation",
            "learn as if you will forever ,live like you will die tommorow",
            "success is not final;failure is not fatal;it is the courage to continue that counts",
        };
        Random rd = new Random();
        int index = rd.nextInt(quotes.length);
        System.out.println("ur quote is:");
        System.out.println("/" + quotes[index] + "/");
    }
    
}
