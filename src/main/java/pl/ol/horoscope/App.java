package pl.ol.horoscope;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the zodiac sign in lowercase.");
        Scanner scanner = new Scanner (System.in);
        String enterZodiacSign = scanner.next();
        String requestResult = Connector.getPage(enterZodiacSign);

       if(requestResult.equals(Connector.NOT_FOUND)){
           System.out.println(requestResult);
       }

    }
}
