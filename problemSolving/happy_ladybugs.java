import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class happy_ladybugs{
    public static void main(String[] args) {
        String b = "RBY_YBR";
        int count =0;
        String ans =null;
        char[] counts = new char[100];

        for(char c : b.toCharArray()){
            counts[c]++;

        }

        if(counts['_']==0){
             ans="YES";
            for(int i =0; i<b.length(); i++){
                if ((i==0||b.charAt(i)!=b.charAt(i-1))&&(i==b.length()-1||b.charAt(i)!=b.charAt(i+1)))
                ans = "NO";
        }
            }

        else{
            ans ="YES";
            for (int i = 0; i < 100; i++) {
                if (i != (int)'_' && counts[i]==1)
                    ans = "NO";
            }

        }
        }

        

        }


    
    }



// public class happy_ladybugs {
//     public static void main(String[] args) {
//         String b = "AABCBC";
//         String result = null;

//         ArrayList<Character> list = new ArrayList<>();

//         HashMap<Character, Integer> hm = new HashMap<>();
//         for(char ch: b.toCharArray()){
//             if(hm.containsKey(ch))
//                 hm.put(ch, hm.get(ch)+1 );
//             else    
//                 hm.put(ch, 1) ;  
//         }

//         if(!hm.containsKey('_')){
//             int i ;
//             for(i =1; i<b.length(); i++){
//                 if(b.charAt(i) != b.charAt(i-1)){
//                     result = "NO";
//                 }
//                 else{
//                     result ="YES";
//                 }
//             }
//         }
//         else{
//             for(Entry<Character, Integer> entry : hm.entrySet()){
//                 if(entry.getValue().equals(1) && !entry.getKey().equals('_')){
//                     result = "NO";
//                     break;
//                 }
//                 else{
//                     result = "YES";
//                 }
//                 }
//         } 
//         System.out.println(result);
            

        
// }
// }


// https://www.hackerrank.com/challenges/happy-ladybugs/problem?isFullScreen=true