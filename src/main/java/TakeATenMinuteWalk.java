public class TakeATenMinuteWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int x = 0, y = 0;
        for (char c: walk) {
            switch (c) {
                case 'n': y++; break;
                case 's': y--; break;
                case 'w': x++; break;
                case 'e': x--; break;
            }
        }

        return x == 0 && y == 0;
    }
}
