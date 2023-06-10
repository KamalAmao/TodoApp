public class SpaceWord {
    public static void main(String[]args){
        String word = "ilovejava";
        int [] spaces = {1, 5};
        StringBuilder result = new StringBuilder();
        /*
         * when c = 0; spaceIndex = 0; spaces [0] = 1;
         */
        int spaceIndex = 0;  
        for(int c = 0; c < word.length(); c++){
            if(spaceIndex < spaces.length && spaces[spaceIndex] == c){
                result.append(" "); //if it doesnt satisfy any of this condition space index will not increase 
                spaceIndex++;
            }
            result.append(word.charAt(c));
        }
        System.out.println(result.toString());
    }
}
