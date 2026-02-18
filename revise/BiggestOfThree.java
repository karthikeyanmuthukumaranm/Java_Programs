package revise;

public class BiggestOfThree {
    public static void main(String[] args){
        int num1=5,num2=6,num3=7;
        if(num1>num2 && num1>num3){
            System.out.println(num1+"greater");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+"greater");
        }else{
            System.out.println(num3 +"greater");
        }
    }
}
