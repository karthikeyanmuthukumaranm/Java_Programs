public class SmallStringFind{
    public static void main(String[] args){
        String[] arr = {"the good morning"};
        String[] words = arr[0].split(" ");
        String small = words[0];

        for(int i=1;i<words.length;i++){
            if(words[i].length() < small.length()){
                small = words[i];
            }
        }
        System.out.println(small);
    }
}
