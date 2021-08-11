import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountLetters {
    public static void main(String[] args) {
        int wordCount = 0;
        String word = "aaaabbbcccd";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < word.length() ; i++) {
            if(map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }

        }
        Set<Character> set = map.keySet();
        Object [] objArray = set.toArray();
        Collection<Integer> collection1 = map.values();
        Object[] objArray1  = collection1.toArray();

        String s = "";
        for (int i = 0; i < objArray.length; i++) {
            s += objArray[i] + objArray1[i].toString();
        }
        System.out.println(s);

    }

}


