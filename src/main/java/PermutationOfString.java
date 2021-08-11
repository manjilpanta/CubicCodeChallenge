public class PermutationOfString{
    static void printPermutn(String str, String a)
    {
        if (str.length() == 0) {
            System.out.print(a + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutn(ros, a + ch);
        }
    }
    public static void main(String[] args)
    {
        String s = "abc";
        printPermutn(s, "");
    }
}
