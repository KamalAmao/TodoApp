public class StringDEmo2{
    public static void main(String[]args){
        /*String countryName = "Nigeria";
        /*System.out.println(countryName);
        System.out.println(countryName.toUpperCase());
        System.out.println(countryName.toLowerCase());
        System.out.println(countryName.charAt(1));
        System.out.println(countryName.substring(3,6));*/
        String word = "Madam";
        String reverse = "";
        char currentValue;
        for(int i = 0; i < word.length(); i++){
            currentValue = word.charAt(i);
            reverse = currentValue + reverse;
        }
        System.out.println(reverse);
    }
}
