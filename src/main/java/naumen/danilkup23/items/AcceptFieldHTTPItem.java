package naumen.danilkup23.items;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AcceptFieldHTTPItem extends Item {
    private final String URILink = "https://httpbin.org/anything";

    public AcceptFieldHTTPItem() {
        title = "Задание №4. Допустимые типы ответа по GET-запросу";
    }

    @Override
    public void execute() {
        // TODO: разобраться, как вывести только допустимые типы ответа
        // Значения поля accept не устанавливаются по умолчанию - как исправить?
        try(HttpClient httpClient = HttpClient.newHttpClient()) {
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(URILink))
                    .header("Accept", "application/json")
                    .GET()
                    .build();
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse.body());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Поток выполнения прерван: " + e.getMessage());
        }
    }
}
