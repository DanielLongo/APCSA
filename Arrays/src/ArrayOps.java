import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOps {
    private int[] numsArray;

    public ArrayOps() {
        numsArray = new int[100];
        loadArray();
    }

    public void loadArray() {
        for (int i = 0; i < 100; i++) {
            numsArray[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void printArray() {
        for (int i = 0; i < 100; i++) {
            System.out.print(numsArray[i] + " ");
            if (((i % 9) == 0) && (i != 0)) {
                System.out.println();
            }
        }
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += numsArray[i];
        }
        return sum;
    }

    public double getMean() {
        int sum = getSum();
        int length = numsArray.length;
        double mean = sum / length;
        return mean;
    }

    public double getMedian() {
//        int[] sortedNumsArray;
        double median;
//        numsArray.sort();
        Arrays.sort(numsArray);
        if ((numsArray.length % 2) == 0) {
            int elmA = numsArray[(numsArray.length / 2)];
            int elmB = numsArray[(numsArray.length / 2) + 1];
            median = (elmA + elmB) / 2.;
        } else median = numsArray[(numsArray.length / 2) + 1];
        return median;
    }

    public int[] getArgMax(int[] array) {
        int max = 0;
        int argMax = 0;
        int currValue = 0;
        int numMaxes = 0;
        for (int i = 0; i < array.length; i++) {
            currValue = array[i];
            if (currValue > max) {
                max = currValue;
                argMax = i;
                numMaxes = 0;
            }
            if (currValue == max) {
                numMaxes += 1;
            }
        }
        int arrayPos = 0;
        int[] argMaxes = new int[numMaxes];
        for (int i = 0; i < array.length; i++) {
            currValue = array[i];
            if (currValue == max) {
                argMaxes[arrayPos] = i;
                arrayPos += 1;
            }

        }
        return argMaxes;
    }

    public void getMode() {
        int currValue;
        int currValueIndex;
        int[] numValueOccurances = new int[100];
        for (int i = 0; i < 100; i++) {
            currValue = numsArray[i];
            currValueIndex = currValue - 1;
            numValueOccurances[currValueIndex] += 1;
        }
        int[] modes = getArgMax(numValueOccurances);
        for (int i = 0; i < modes.length; i++) {
            System.out.print(modes[i] + ",");
        }
    }
}