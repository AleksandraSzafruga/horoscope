package pl.ol.horoscope;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connector {

    private static final String urlTemplate = "https://horoskopy.gazeta.pl/horoskop/placeholder/dzienny";
    public static final String NOT_FOUND = "NOT FOUND";

    public static String getPage(String zodiacSign)  {


        String newUrl = urlTemplate.replace("placeholder", zodiacSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(newUrl).get().html();
        } catch (IOException e) {
            requestResult = NOT_FOUND;
            e.printStackTrace();
        }
        return newUrl;
    }

   static public void getHoroscopeText(String pageAsText) {

       Pattern pattern = Pattern.compile("Your horoscope.+");
       Matcher matcher = pattern.matcher(pageAsText);
       if (matcher.find()) {
           String result = matcher.group();
       }return;
   }
}
