public class SmallestLen {
    public static void main (String[] args) {
        String[] s = {"ant","rose","cat","dog"};
        String smallest = s[0];
        
        for(int i=0;i<s.length;i++){
            if(s[i].length()<smallest.length()){
            //if(s[i].length()>smallest.length()){
                smallest=s[i];
            }
        }
        System.out.println(smallest);
    }
}
