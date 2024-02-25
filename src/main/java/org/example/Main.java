package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            printHelp();
            return;
        }

        // var extractor = new QuoteExtractor(LanguageEnum.RUSSIAN);
        LanguageEnum lang;
        if (LanguageEnum.ENGLISH.getShortName().equalsIgnoreCase(args[0])) {
            lang = LanguageEnum.ENGLISH;
        } else if (LanguageEnum.RUSSIAN.getShortName().equalsIgnoreCase(args[0])) {
            lang = LanguageEnum.RUSSIAN;
        } else {
            printHelp();
            return;
        }

        var extractor = new QuoteExtractor(lang);
        var quoteString = extractor.extract();
        var quote = new QuoteDeserializer().deserialize(quoteString);

        System.out.println(quote.getQuoteAuthor());
        System.out.println(quote.getQuoteText());
    }

    private static void printHelp() {
        System.out.println("Usage parameter: en | ru");
    }
}