import java.util.*;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap <String,Integer> map=new HashMap<>();
        String arr[]=s.split(" ");
        for(String word : arr){
            Integer ref=map.get(word);
            if(ref==null)
            map.put(word,1);
            else{
                map.put(word,ref + 1);
            }
        }
        System.out.println(map);
    }
}