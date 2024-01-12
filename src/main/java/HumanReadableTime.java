public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(60));
    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%d%d:%d%d:%d%d", hours / 10, hours % 10, minutes / 10, minutes % 10, remainingSeconds / 10, remainingSeconds % 10);
    }
}