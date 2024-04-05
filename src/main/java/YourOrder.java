public class YourOrder{
    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
    public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= arr.length; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }

}
