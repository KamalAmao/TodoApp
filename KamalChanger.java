public class KamalChanger{
    public static void main(String[]args){
        int kamalMoney = 500;
        int amountSpent = 220;
        int change = kamalMoney - amountSpent;
        int [] changeDrawer = {50, 20, 10,};

        for(int c = 0; c<changeDrawer.length; c++){
            int num = change/changeDrawer[c];
            change = change % changeDrawer[c];
            if(num!=0){
                System.out.println(num+ " of " + changeDrawer[c]);
            } 
        }
    }
}