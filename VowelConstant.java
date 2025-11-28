import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String: ");
        String str =sc.nextLine().toLowerCase();
        int vowels = 0,constants=0;
        String VowelsList = "aeiou";
        String VowelsString="",ConstantString="";
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                if(VowelsList.contains(ch + "")){
                    vowels++;
                    VowelsString+=ch;
                }else{
                    constants++;
                    ConstantString+=ch;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(constants);
        System.out.print(VowelsString);
        System.out.print(ConstantString);
        sc.close();

    }
}
