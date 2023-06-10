public class OrangeService{
    public static void main(String[]args){
        //int totalOranges = 20, kamalTookOutTotalOranges = 5;
        //int orangesLeft = totalOranges - kamalTookOutTotalOranges;

        int score = 200;
        String remark = (score >= 70) && (score <= 100)?"fail" :"pass";
        System.out.println(remark);
        //System.out.println("The total oranges left when kamal took out 5 oranges is:"+orangesLeft+ " from basket");
    }
}