public class SelectiveCSDemo4{
    public static void main(String[]args){
        int cutOffMark = 150;
        int [] markScored = {100, 200, 180, 150};
        if(markScored [0] [1] [2] [3] >= 150) {
            System.out.println(markScored);
        } else{
            System.out.println("You don't meet the cut off mark " +cutOffMark);
        }
    }
}