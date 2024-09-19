package occurence;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        char[]ch=str.toCharArray();
        for(char c:ch){
            if(map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            }

                else{
                    map.put(c,1);

            }
        }
        for(char res:map.keySet()){
            System.out.println(res+"-"+map.get(res));
        }
        //System.out.println(present);

    }
}
