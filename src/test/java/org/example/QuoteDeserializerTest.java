package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteDeserializerTest {
    static String payloadActual = "{\"quoteText\":\"We are either progressing or retrograding all the while. There is no such thing as remaining stationary in this life. \", \"quoteAuthor\":\"James Freeman Clarke\", \"senderName\":\"\", \"senderLink\":\"\", \"quoteLink\":\"http://forismatic.com/en/a01e0ec9fe/\"}";
    static String payloadEmpty = "{\"unknownText\":\"unknown\"}";

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testActual() {
        Quote q = new QuoteDeserializer().deserialize(payloadActual);
        assertEquals("We are either progressing or retrograding all the while. There is no such thing as remaining stationary in this life. ",
                q.getQuoteText());
        assertEquals("James Freeman Clarke", q.getQuoteAuthor());
    }

    @Test
    public void testEmpty() {
        Quote q = new QuoteDeserializer().deserialize(payloadEmpty);
        assertNull(q.getQuoteText());
        assertNull(q.getQuoteAuthor());
    }

}