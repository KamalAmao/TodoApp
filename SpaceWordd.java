public class SpaceWordd {
    public static void main(String[]args){
        String word = "ilovejava";
        int [] space = {1,5};
        StringBuilder result = new StringBuilder();
        
        int spaceIndex = 0; 
        for(int c = 0; c < word.length(); c++){
            if(spaceIndex < space.length && space[spaceIndex] == c){
                result.append(" ");
                spaceIndex++;
        }
       result.append(word.charAt(c));
        }
        System.out.println(result.toString());
    }
}
