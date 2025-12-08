import java.util.*;

public class StackProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack =  new Stack<>();

        System.out.println("How many Numbers to Push : ");
        int n = sc.nextInt();

        System.out.print("Enter" + n + "number to Push : ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            stack.push(num);
        }

        System.out.println("Pop value" +stack.pop());

        if(!stack.isEmpty()){
            System.out.println("Peek Value : "+ stack.peek());
        }
        sc.close();
    }
}
