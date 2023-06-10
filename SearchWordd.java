public class SearchWordd {
    public static void main(String[]args){
        String word = "Father francis fried fish for his friends in france";
        /*int counter = 0;
        int len = word.length();
        for(int c = 0; c < len; c++){
            if(word.charAt(c) == 'f'){
                counter++;
            }
        }
        System.out.println("The total number of f's found is " + counter);*/
        int counter = 0;
        int len = word.length();
        for(int c=0; c<len; c++){
            if(word.charAt(c)== 'f'){
                counter++;
            } 
        }
        System.out.println("The total number of f's found is " + counter);
    }
}
