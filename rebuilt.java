public class SplitSentence {
    public static void main(String[] args) {

        String sentence = "Java is a programming language";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Print each word
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        // Rebuild sentence in new format
        String newSentence = String.join("-", words);

        System.out.println("\nNew format:");
        System.out.println(newSentence);
    }
}
