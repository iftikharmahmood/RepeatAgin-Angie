package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Jagiellonian University Medical College");
        reverseString("Jagiellonian University Medical College");
        addSpaces("JagiellonianUniversityMedicalCollege");

    }

    /**
     * Splits a String in to an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be spli
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d word", numberOfWords);
        System.out.println(message);

        for(int i = 0; i < numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Print a string i reverse
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i = text.length()-1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Add spaces befor every capital letter exept the first letter
     * @param text jumbeled text
     */
    public static void addSpaces(String text){
        System.out.println("Tekst som skal endres:    " +text);
        var modifiedText = new StringBuilder(text);
        for(int i = 0; i < modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
