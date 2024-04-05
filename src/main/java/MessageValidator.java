import java.util.Arrays;

public class MessageValidator {
    public static void main(String[] args) {
        System.out.println(isAValidMessage("235cSodSIDGzGSfFTrtIBpBJSPLzZHbCGLlfGJIYFSwgMcTUVYDqVNDkOmhkgXJUYcmhlPRLgyCJIcsCZBVUqyPwvWshEgZdidJCQgMKbikNgVNxDkIrzETlDCixeYzpHZJeJLktsuYSjGNOljeYBEmJLEaWPPdjSySLqPtgjTtkZOHuXeOYzcXSqmylcHPOeknHZzMRyGWcrFYDvxFKMmhVcKtGcgAbcsotbkMqeiWODV148rESELFyTOvpCZqlPcCxYqcWqTiWmArQfFSPFWAGSiwkhPiBbdvJaemeXOcvkXdfCrbpnFTWjyOXBkcLmejzcrtvZtpaATyAxrnLxscxFabBJYjsLkXviJSTZXndstaOMShvEwdmPOSfmbpGyxQbE"));
    }
    public static boolean isAValidMessage(String message) {
        if(message == "" || message.length() == 1){
            return true;
        }
        String[] m = message.split("\\d+");
        String[] numbersAsString = message.split("[a-zA-Z]+");
        String[] messageArray = Arrays.copyOfRange(m, 1, m.length);
        if(messageArray.length != numbersAsString.length){
            return false;
        }
        for(int i = 0 ; i < messageArray.length; i++){
            int numLength = Integer.parseInt(numbersAsString[i]);
            if(messageArray[i].length() != numLength){
                return false;
            }
        }
        return true;
    }
}

