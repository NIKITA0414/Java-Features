package com.example.javafeatures.java15;

public class StripIndentExample {
    public static void main(String[] args) {
        String textBlock = """
                \t\tThis is a text block
                \t\twith some indentation.
                \t\tEach line is indented.
                """;

        // Strip incidental whitespace from each line
        String strippedText = textBlock.stripIndent();

        System.out.println("Original Text Block:\n" + textBlock);
        System.out.println("Stripped Text Block:\n" + strippedText);
    }
}