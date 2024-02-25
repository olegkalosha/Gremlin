package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QuoteDeserializer {
    public Quote deserialize(String quoteString) {
        try {
            return new ObjectMapper().readValue(quoteString, Quote.class);
        } catch (JsonProcessingException e) {
            // log error
            throw new RuntimeException(e);
        }
    }
}
