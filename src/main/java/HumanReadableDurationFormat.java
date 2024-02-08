public class HumanReadableDurationFormat {
    public static void main(String[] args) {
        System.out.println(formatDuration(3600));
    }
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int years = seconds / 31536000;
        seconds %= 31536000;
        int days = seconds / 86400;
        seconds %= 86400;
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        StringBuilder result = new StringBuilder();

        if (years > 0) {
            result.append(years).append(years == 1 ? " year" : " years");
            if (days > 0 || hours > 0 || minutes > 0 || remainingSeconds > 0) {
                if (days == 0) {
                    result.append(" and ");
                } else {
                    result.append(", ");
                }
            }
        }

        if (days > 0) {
            result.append(days).append(days == 1 ? " day" : " days");
            if (hours > 0 || minutes > 0 || remainingSeconds > 0) {
                if (hours > 0 && minutes == 0 && remainingSeconds == 0) {
                    result.append(" and ");
                } else {
                    result.append(", ");
                }
            }
        }

        if (hours > 0) {
            result.append(hours).append(hours == 1 ? " hour" : " hours");
            if (minutes > 0 || remainingSeconds > 0) {
                if (minutes > 0 && remainingSeconds == 0 || minutes == 0) {
                    result.append(" and ");
                } else {
                    result.append(", ");
                }
            }
        }

        if (minutes > 0) {
            result.append(minutes).append(minutes == 1 ? " minute" : " minutes");
            if (remainingSeconds > 0) {
                result.append(" and ");
            }
        }

        if (remainingSeconds > 0) {
            result.append(remainingSeconds).append(remainingSeconds == 1 ? " second" : " seconds");
        }

        return result.toString();

    }
}
