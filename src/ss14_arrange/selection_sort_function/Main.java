package ss14_arrange.selection_sort_function;

public class Main {
        public static void insertionSort(int[] list) {
            for (int i = 1; i < list.length; i++) {
                int key = list[i];
                int j = i - 1;
                while (j >= 0 && list[j] > key) {
                    list[j + 1] = list[j];
                    j--;
                }
                list[j + 1] = key;
            }
        }

        public static void main(String[] args) {
            int[] list = {12, 11, 13, 5, 6};

            System.out.println("Mảng ban đầu:");
            printArray(list);

            insertionSort(list);

            System.out.println("Mảng sau khi sắp xếp:");
            printArray(list);
        }

        public static void printArray(int[] list) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
