public class Kata {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {

        int sumFriday = 0;

        for(int i = 0; i < fridayNightCounting.length; i++) {
            sumFriday += fridayNightCounting[i];
        }

        int sumSaturday = 0;

        for(int i = 0; i < saturdayNightCounting.length; i++) {
            sumSaturday += saturdayNightCounting[i];
        }

        return sheepTotal - sumFriday - sumSaturday;
    }
}
