public class MoreZerosThanOnes {
    public static void main(String[] args) {
        System.out.println(moreZeros("abcde"));
    }

    private static char[] moreZeros(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                String binaryString = Integer.toBinaryString(ch);
                if (binaryString.length() - binaryString.replaceAll("0", "").length() > binaryString.length() / 2)
                    sb.append(ch);
            }
        }

        return sb.toString().toCharArray();
    }
}
