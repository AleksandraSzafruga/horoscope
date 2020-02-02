package pl.ol.horoscope;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the zodiac sign in lowercase.");
        Scanner scanner = new Scanner(System.in);
        String enterZodiacSign = scanner.next();
        String requestResult = Connector.getPage(enterZodiacSign);
        String horoscopeMessage = "";

        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeText.getHoroscopeText(requestResult);
        }
        System.out.println(horoscopeMessage);

    }
    private static void testHoroscopeExtractor(){
        String horoscopeText = HoroscopeText.getHoroscopeText("TRALALALA LALA!");
        System.out.println(horoscopeText);
}}
