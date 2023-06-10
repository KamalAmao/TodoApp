public class TypeCasting{
    public static void main(String[]args){
        double amount = 300.55;
        int convertedAmount = (int) amount;
        int lengthOfARectangle = 7;
        float convertedLenghtOfARectangle = (float) lengthOfARectangle;
        String massOfEnergy = "35";
        int convertedMassOfEnergy = Integer.parseInt(massOfEnergy);
        double convertMassOfEnergy = Double.parseDouble(massOfEnergy);
        float converteMassOfEnergy = Float.parseFloat(massOfEnergy);
        int totalSize = 30;
        String convertTotalSize = String.valueOf(totalSize);  
        /*System.out.println(convertedLenghtOfARectangle);
        System.out.println(convertedAmount);
        System.out.println(convertedMassOfEnergy);
        System.out.println(convertMassOfEnergy);
        System.out.println(converteMassOfEnergy);*/
        System.out.println(convertTotalSize);   
    }
}