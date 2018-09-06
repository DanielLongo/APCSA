import java.util.Arrays;

public class ArrayOps {
    private int[] numsArray;

    public void ArrayOps() {
        numsArray = new int[100];
        loadArray();
    }

    public void loadArray() {
        for (int i = 0; i < 100; i++) {
            numsArray[i] = (int)(Math.random() * 10) + 1;
        }
    }

    public void printArray() {
        for (int i = 0; i < 100; i++) {
            System.out.print(numsArray[i]);
            if ((i % 9) == 0) {
                System.out.println();
            }
        }
    }

    public int getSum() {
        int sum;
        for (int i = 0; i < 100; i++) {
            sum += numsArray[i];
        }
        return sum;
    }

    public double getMean() {
        int sum = getSum();
        int length = numsArray.length;
        double mean = sum / lengh;
        return mean;
    }

    public double getMedian() {
//        int[] sortedNumsArray;
        double median;
        numsArray = numsArray.sort();
        if ((numsArray.length % 2) == 0) {
            int elmA = numsArray[(numsArray.length/2)];
            int elmB = numsArray[(numsArray.length/2) + 1];
            median = (elmA + elmB) / 2.;
        }
        else median = numsArray[(numsArray.length/2) + 1];
        return  median;
    }

    public int getArgMax(int[] array) {
        int max;
        int argMax;
        for (int i = 0; i < array.length; i++) {
            currValue = array[i];
            if (currValue > max) {
                max = currValue;
                argMax = i;
            }
        }
        return argMax;
    }

    public int getMode() {
        int currValue;
        int currValueIndex;
        int[] numValueOccurances = new int[100];
        for (int i = 0; i < 100; i ++) {
            currValue = numsArray[i];
            currValueIndex = currValue - 1;
            numValueOccurances[currValueIndex] += 1;
        }
        int mode = getArgMax(numValueOccurances);
        return mode;
    }
}
