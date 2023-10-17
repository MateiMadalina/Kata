import java.util.List;
import java.util.ArrayList;

public class BuildTower {
    public static void main(String[] args) {
        int floors = 6;
        String[] tower = towerBuild(floors);
        for (String floor : tower) {
            System.out.println(floor);
        }
    }

    public static String[] towerBuild(int floors) {
        String[] tower = new String[floors];
        for (int i = 0; i < floors; i++) {
            String floor = " ".repeat(floors - i - 1)
                    + "*".repeat(i * 2 + 1)
                    + " ".repeat(floors - i - 1);
            tower[i] = floor;
        }
        return tower;
    }
}
