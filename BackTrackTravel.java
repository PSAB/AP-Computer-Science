/**
 * Created by johnyorangeseed on 3/15/17.
 */
import java.util.*;
public class BackTrackTravel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        backTrackTravel(x, y);
    }

    public static void backTrackTravel(int targetx, int targety) {
        explore(targetx, targety, 0, 0, "moves: ");
    }

    public static void explore(int targetx, int targety, int currx, int curry, String path) {
        if (currx == targetx && curry == targety) {
            System.out.println(path);
        }
        else if (currx <= targetx && curry <= targety) {
            explore(targetx, targety, currx, curry + 1, path + " N");
            explore(targetx, targety, currx + 1, curry + 1, path + " NE");
            explore(targetx, targety, currx + 1, curry, path + " E");
        }
    }
}
