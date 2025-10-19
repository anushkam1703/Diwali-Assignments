public class CodeChallange {
    public static void main(String[] args) {
        String[] a = {"Hi", "Banana", "Cat", "Watermelon"};
        int maxlen = 0;

        for (int i = 0; i < a.length; i++) {
            int length = a[i].length();

            if (length > maxlen) {
                maxlen = length;
            }
        }

        System.out.println("Length : " + maxlen);
    }
}
