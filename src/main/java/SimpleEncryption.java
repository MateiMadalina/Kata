public class SimpleEncryption {
    public static void main(String[] args) {
        System.out.println(encrypt("This is a test!", 4));
        System.out.println(decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    public static String encrypt(final String text, final int n) {
        if(n % 4 == 0) return text;
        int count = n;
        String buffer = text;
        while (count>0){
            StringBuilder result = new StringBuilder();
            for(int i = 0 ; i < buffer.length() ; i++){
                if(i%2 != 0){
                    result.append(buffer.charAt(i));
                }
            }
            for(int i = 0 ; i < buffer.length() ; i++){
                if(i%2 == 0){
                    result.append(buffer.charAt(i));
                }
            }
            count--;
            buffer = result.toString();
        }
        return buffer.toString();
    }

    public static String decrypt(final String encryptedText, final int n) {
        if( n < 0  || n % 4 == 0) return encryptedText;
        int evenNumbersStartIndex = encryptedText.length() / 2 ;
        String result = "";
        String buffer = encryptedText;
        int count = n;

        while(count > 0){
            String[] arr = buffer.split("");
            int par = 0;
            int impar = 1;
            for(int i = 0 ; i < buffer.length(); i++){
                if( i < evenNumbersStartIndex){
                    arr[impar] = String.valueOf(buffer.charAt(i));
                    impar += 2;
                } else{
                    arr[par] = String.valueOf(buffer.charAt(i));
                    par += 2;
                }
            }
            result = "";
            for(var letter : arr){
                result += letter;
            }
            buffer = result;
            count--;
        }

        return result;
    }
}
