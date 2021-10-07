package controller;

public class CalculateBMI {
	public static Double Calculate(double height, double weight){
        double ans=weight/height;
        return ans;
    }
    String description(double bmi){
        String str="";
        if(bmi<18.5)
            str="Under Weight";
        else if(bmi>=18.5&&bmi<24.9)
            str="Normal";
        else if(bmi>=25&&bmi<29.9)
            str="Over Weight";
        else if(bmi>=30&&bmi<34.9)
            str="Over Weight";
        else if(bmi>=35)
            str="Over Weight";
        return str;
    }
}
