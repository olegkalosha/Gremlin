package org.example;

import org.junit.Test;
import org.mockito.Mock;

import java.net.http.HttpClient;

public class QuoteExtractorTest {
    @Mock
    private HttpClient mockClientSuccess;

    @Mock
    private HttpClient mockClientFailure;

    @org.junit.Before
    public void setUp() throws Exception {
        // mock mockClient.send here
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSuccess() {
        // instantiate QuoteExtractor with mockClientSuccess and call extract method
    }

    @Test
    public void testFailure() {
        // instantiate QuoteExtractor with mockClientFailure and call extract method
    }
}