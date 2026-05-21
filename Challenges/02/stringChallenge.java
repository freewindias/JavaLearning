public class stringChallenge {
    public static void main(String[] args) {
        String text = "Adventure";
        // TODO: Check the length using length() and print the length
        System.out.println("Length of string: " + text.length());
        // TODO: Get the character at position 3 and print the character 
        System.out.println("character at position 3: " + text.charAt(3));      
        // TODO: Get a part of the String from position 1 to 4 and print the string
        System.out.println("String from position 1 to 4: " + text.substring(1,4));

        String anotherText= "Adventure";
        // TODO: Compare text with anotherText using equals() and print the output
        boolean comparedText = text.equals(anotherText);
        System.out.println("Compare text with anotherText is: " + comparedText);
        // TODO: Change to uppercase using toUpperCase() and print the converted string
        System.out.println("Uppercase: " + text.toUpperCase());
        // TODO: Change to lowercase using toLowerCase() and print the converted string
        System.out.println("Lowercase: " + text.toLowerCase());
        // TODO: Check if it contains "vent" using contains() and print the output
        boolean isContains = text.contains("vent");
        System.out.println("It contains (vent): " + isContains);
        // TODO: Replace 'e' with 'a' and print the output
        System.out.println("New String after replacing a character: " + text.replace('e','a'));
    }
}