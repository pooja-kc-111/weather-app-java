import java.util.*;
import java.util.Scanner;
import java.net.http.*;

public class WeatherApp 
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the city name:");
        String city = sc.nextLine();
        
        String apiKey = System.getenv("OPENWEATHER_API_KEY"); 
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new java.net.URI(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        String data = response.body();

        String temp = data.split("\"temp\":")[1].split(",")[0];
        String humidity = data.split("\"humidity\":")[1].split(",")[0];
        String weather = data.split("\"description\":\"")[1].split("\"")[0];

        System.out.println("\n===== WEATHER REPORT =====");
        System.out.println("City: " + city);
        System.out.println("Temperature: " + temp + " °C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Condition: " + weather);
        System.out.println("==========================");       

        sc.close();
    }    
}
