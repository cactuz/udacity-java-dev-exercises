import java.util.Arrays;

public class BinarySearcher {

    public static int search(int[] inputArray, int target) {

        int output = -1;
        int inputLastIndex = inputArray.length - 1;
        System.out.println(".....Searching for " + target + " in " + Arrays.toString(inputArray));

        Arrays.sort(inputArray);

        boolean endOfSearch = false;
        int searchStart = 0;
        int searchEnd = inputLastIndex;

        do {
            int searchIndex = (searchStart + searchEnd)/2;
            System.out.println("searchIndex: " + searchIndex);
            int compareNum = inputArray[searchIndex];
            System.out.println("target: " + target + ", compare: " + compareNum);

            if (target == compareNum) {
                endOfSearch = true;
                output = searchIndex;
                System.out.println("!TARGET : " + target + " FOUND AT INDEX: " + output);
            }
            else if (target > compareNum)
                searchStart++;
            else if (target < compareNum)
                searchEnd = searchIndex -1;

            if (searchStart >= searchEnd) {
                endOfSearch = true;
                System.out.println("!TARGET : " + target + " NOT FOUND " + output);
            }


        } while (!endOfSearch);

        return output;
    }
}
