public class DeadAnts {
    public static void main(String[] args) {
        System.out.println(deadAntCount("ant ant .... a nt"));
    }
    public static int deadAntCount(final String ants) {
        if (ants==null) return 0;
        String buffer = ants.replaceAll("ant", "*");

        char[] chars = buffer.toCharArray();
        int countCharA = 0;
        int countCharN = 0;
        int countCharT = 0;
        for(char c : chars)
        {
            if (c=='a') countCharA++;
            if (c=='n') countCharN++;
            if (c=='t') countCharT++;
        }
      int deadAnts = countCharA;
        if (countCharN > deadAnts) {
            deadAnts = countCharN;
        }

        if (countCharT > deadAnts) {
           deadAnts = countCharT;
        }

        return deadAnts;
    }
}
