public class CountIpAddresses {
    public static void main(String[] args) {
        System.out.println(ipsBetween( "10.0.0.0", "10.2.0.0" ));

    }
    public static long ipsBetween(String start, String end) {
        String[] startParts = start.split("\\.");
        String[] endParts = end.split("\\.");

        long addressesBetween = 0;

        for (int i = 0; i < 4; i++) {
            int startPart = Integer.parseInt(startParts[i]);
            int endPart = Integer.parseInt(endParts[i]);
            addressesBetween = (addressesBetween * 256) + (endPart - startPart);
            System.out.println(addressesBetween);
        }
        return addressesBetween;
    }

}
