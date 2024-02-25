package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QuoteExtractor {
    private final static String baseURL = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=";

    private final HttpClient client;
    private final HttpRequest request;

    public QuoteExtractor(LanguageEnum lang) {
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder(URI.create(baseURL + lang.getShortName()))
                .GET()
                .header("accept", "application/json")
                .build();
    }

    QuoteExtractor(HttpClient client, HttpRequest request) {
        this.client = client;
        this.request = request;
    }

    public String extract() {
        String ret;
        try {
            // use the client to send the request
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ret = response.body();
        }
        catch (IOException | InterruptedException e) {
            // log error
            throw new RuntimeException(e);
        }
        return ret;
    }
}
