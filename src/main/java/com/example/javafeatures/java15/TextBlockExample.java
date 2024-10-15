package com.example.javafeatures.java15;

public class TextBlockExample {
    public static void main(String[] args) {
        // Using a traditional string with concatenation
        String messageOld = "A-143, 9th Floor, Sovereign Corporate Tower,\n" +
                "Sector-136, Noida,\n" +
                "Uttar Pradesh - 201305";

        // Using a text block
        String messageNew = """
                A-143, 9th Floor, Sovereign Corporate Tower,
                Sector-136, Noida,
                Uttar Pradesh - 201305
                """;

        // Print both messages
        System.out.println("Old Message:");
        System.out.println(messageOld);

        System.out.println("\nNew Message using Text Block:");
        System.out.println(messageNew);

        // Comparing both strings
        System.out.println("\nAre both messages equal? " + messageOld.equals(messageNew));
    }
}
