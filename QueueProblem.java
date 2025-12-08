import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter how many Number to add : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + "numbers : ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            System.out.println("ADDED : "+queue.add(num));
        }
        System.out.println("Number Removed : "+queue.remove());

        if(!queue.isEmpty()){
            System.out.println("peek Value : " + queue.peek());
        }else{
            System.out.println("queue Empty");
        }
        sc.close();
    }
}