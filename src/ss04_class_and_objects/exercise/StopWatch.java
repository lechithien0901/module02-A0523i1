package ss04_class_and_objects.exercise;

public class StopWatch {
    private static long starTime;
    private static long endTime;

    public StopWatch() {
        starTime = System.currentTimeMillis();
        endTime = starTime;
    }

    public static long getStarTime() {
        return starTime;
    }

    public static long getEndTime() {
        return endTime;
    }

    public static void star() {
        starTime = System.currentTimeMillis();
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
    }

    public static long getElapsedTime() {
        return endTime - starTime;
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j])
                    min_index = j;

            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }

    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int []array=generateRandomArray(100000);
        StopWatch stopWatch=new StopWatch();
        selectionSort(array);

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
}