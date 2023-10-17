public class NumberInExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(3507));
    }

    public static String expandedForm(int num) {
        Integer number = Integer.valueOf(num);
        String result = "";
        for (int i = 0; i < number.toString().length(); i++) {
            if (number.toString().charAt(i) != '0') {
                result += (int) (Integer.parseInt(String.valueOf(number.toString().charAt(i))) * Math.pow(10, number.toString().length() - i - 1)) + " + ";
            }
        }
        return result.substring(0, result.length() - 3);
    }
}
