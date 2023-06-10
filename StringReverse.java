public class StringReverse {
    public static void main(String[]args){
        String word ="Madam";
        String reversedWord = "";  
        char currentWordValue;
        
        for(int i = 0; i < word.length(); i++){ 
            currentWordValue = word.charAt(i);
            reversedWord = currentWordValue + reversedWord;
        }
        if(reversedWord.equalsIgnoreCase(word)){
            System.out.println("The word " +word+ " is palindrome");
        }else{
            System.out.println("The word " +word+ " is not palindrome");
        }
        System.out.println("Reverse string is "+reversedWord);
    }
}
