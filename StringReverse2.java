public class StringReverse2 {
    public static void main(String[]args){
        String k = "kamal";
        int len = k.length();
        String reverse = "";
        char ch;

        for(int i=0; i < len; i++){
            ch = k.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }
}
