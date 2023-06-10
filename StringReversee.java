public class StringReversee {
    public static void main(String[]args){
        String k ="kamal";
        String reverse = "";
        char ch;
        int len = k.length();

        for(int c=0; c<len; c++){
            ch = k.charAt(c);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }
}
