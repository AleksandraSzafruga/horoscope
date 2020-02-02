package pl.ol.horoscope;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String name = sc.nextLine();
        System.out.println("What day of the month were you born?");
        Integer dayOfMonth = sc.nextInt();
        sc.nextLine();
        System.out.println("What month of the year were you born?");
        Integer monthOfYear = sc.nextInt();
        sc.nextLine();

        String requestResult = ZodiacSignRecogniser.getSign(dayOfMonth, monthOfYear);
        String massage = Connector.getPage(requestResult);
        String horoscopeMessage = "";

        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeText.getHoroscopeText(massage);
        }
        System.out.println(horoscopeMessage);


    }

    private static void testHoroscopeExtractor() {
        String horoscopeText = HoroscopeText.getHoroscopeText("TRALALALA LALA!");
        System.out.println(horoscopeText);
    }
}
