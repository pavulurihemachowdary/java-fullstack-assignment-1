public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7;
        char replacement = 'X';

        String replacedStr = replaceCharAtIndex(str, index, replacement);
        System.out.println("Original String: " + str);
        System.out.println("String after replacement: " + replacedStr);
    }

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (index < 0 || index >= str.length()) {
            return str; // If index is out of bounds, return original string
        }

        char[] chars = str.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}
