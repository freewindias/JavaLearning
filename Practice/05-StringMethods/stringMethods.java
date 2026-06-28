 // TODO: Check the length using length() and print the length
 // TODO: Get the character at position 3 and print the character 
 // TODO: Get a part of the String from position 1 to 4 and print the string
 // TODO: Compare text with anotherText using equals() and print the output
 // TODO: Change to uppercase using toUpperCase() and print the converted string
 // TODO: Change to lowercase using toLowerCase() and print the converted string
 // TODO: Check if it contains "vent" using contains() and print the output
 // TODO: Replace 'e' with 'a' and print the output
 
public class stringMethods {

    public static void main(String[] args) {
        String text = "Adventure";
       
        System.out.println("Length of string: " + text.length());
        System.out.println("character at position 3: " + text.charAt(3));      
        System.out.println("String from position 1 to 4: " + text.substring(1,4));

        String anotherText= "Adventure";
        boolean comparedText = text.equals(anotherText);
        System.out.println("Compare text with anotherText is: " + comparedText);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        boolean isContains = text.contains("vent");
        System.out.println("It contains (vent): " + isContains);
        System.out.println("New String after replacing a character: " + text.replace('e','a'));
    }
}