public class Driver {
    public static void main(String args[]) {
        ArrayOps array = new ArrayOps();
        array.printArray();
        System.out.println("Sum: " + array.getSum());
        System.out.println("Mean: " + array.getMean());
        System.out.println("Median: " + array.getMedian());
        System.out.println("Mode: ");
        array.getMode();


    }
}
