public class StringReverses {
    public static void main(String[]args){
        String x = "kamal";
        int len = x.length();
        String reverse = "";
        char ch;

        for(int c=0; c<len; c++){
            ch = x.charAt(c);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }
}
