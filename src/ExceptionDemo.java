import java.lang.reflect.Array;
import java.util.*;

public class ExceptionDemo {

    public static int remAnagrams(String s, String s1)
    {
        //add code here.
        int res = 0;

        Map <Character, Integer> m1 = new HashMap<>();
        Map <Character, Integer> m2 = new HashMap<>();

        char [] c1 = s.toCharArray();
        char [] c2 = s1.toCharArray();

        for(char c : c1){
            if(m1.containsKey(c)){
                m1.put(c, m1.get(c) + 1);
            }
            m1.put(c, 1);
        }

        for(char c : c2){
            if(m2.containsKey(c)){
                m2.put(c, m2.get(c) + 1);
            }
            m2.put(c, 1);
        }

        System.out.println(m1 + "\n" + m2);
//
        System.out.println(m1.size() + " > " + m2.size());

        if(m1.size() > m2.size()){
            for(Map.Entry e : m1.entrySet()){
                if(m2.containsKey(e.getKey())){
                    res += Math.abs((int)(e.getValue()) - (m2.get(e.getKey())));
                }
                else res += m1.get(e.getKey());
            }
        }
        for(Map.Entry e : m2.entrySet()){
            if(m1.containsKey(e.getKey())){
                res += Math.abs((int)(e.getValue()) - (m1.get(e.getKey())));
            }
            else res += m2.get(e.getKey());
        }


        return res;
    }



    public static void main(String[] args) {
//        int i = 15;
//        int j = 5;
//        double ans;
//        try{
//            ans = i/j;
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//            throw e;
//        }
//        System.out.println("After catch");
//        String s = "Shridhar";
//        char [] ch1 = s.toCharArray();
//        Arrays.sort(ch1);
//        s = new String(ch1);
//        System.out.println(s);

        int result = remAnagrams("basgadhbfgvhads", "sjdhgvbjdsbhvbvd");
        System.out.println(result);
    }
}
