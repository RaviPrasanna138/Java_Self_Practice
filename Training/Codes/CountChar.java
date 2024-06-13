package Training.Codes;

public class CountChar {
    public static void main(String[] args) {
        String input = "Java J2EE Java JSP J2EE";
        input=input.replaceAll("\\s","");
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Iterate over the characters of the string
        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++; // Increment the count for the current character
        }

        // Print the character counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                System.out.println("Character: " + (char) i + ", Count: " + charCount[i]);
            }
        }
    }
}

