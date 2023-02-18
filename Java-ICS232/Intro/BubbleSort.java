import java.util.Scanner;

class BubbleSort{
    static void sort(int[] a) {

        int x = a.length;
        int b;
        for (int i = 0; i < x - 1; i++)         {
            for (int j = 0; j < x - 1; j++) {
                if (a[j + 1] > a[j]) {
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }

        System.out.println("Array Sorted in Descending");
        for (int i = 0; i < x; i++)  {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < x - 1; i++){
            for (int j = 0; j < x - 1; j++){
                if (a[j + 1] < a[j]){
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }

        System.out.println();
        System.out.println("Array Sorted in Ascending");
        for (int i = 0; i < x; i++){
            System.out.print(a[i] + " ");
        }
    }



public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element No." + (i + 1));
            arr[i] = sc.nextInt();
        }
        sort(arr);
    }
}