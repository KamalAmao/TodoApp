public class ConditionalOp{
    public static void main(String[]args){
        int x = 50;
        int y = 60;
        int z = 30;
        boolean remark = x > y;
        boolean compare = x > y && z > x || y > x;
        if(x>y){
            System.out.println(remark);
        }else{
            System.out.println("not valid");
        }
        System.out.println(compare);
    }
}