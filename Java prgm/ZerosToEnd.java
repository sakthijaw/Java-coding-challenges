public class ZerosToEnd {

    void pushZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        ZerosToEnd obj = new ZerosToEnd();

        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        printArray(arr);

        obj.pushZerosToEnd(arr);

        System.out.println("Array after pushing zeros to end:");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

