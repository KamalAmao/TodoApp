public class StringChecker {
    public static void main(String[]args){
        String content = "{{}} "; 
        int counter = 0;
        /*
         * when c = 0 then counter = 1
         * when c = 1 then counter = 2
         * when c = 2 then counter = 1
         * when c = 3 then the system breaks out of the loop
         */
        for(int c = 0; c < content.length(); c++){
           if(content.charAt(c) == '{'){
            counter++;
           }else if(content.charAt(c) == '}'){
            if(counter>0){
                counter--;
            }
           }
        }
        if(counter==0){
            System.out.println("It is a balance character");
        }else{
            System.out.println("It is not a balance character");
        }
    }
}
