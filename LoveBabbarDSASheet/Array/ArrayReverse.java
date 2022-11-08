import java.util.Scanner;

class ArrayReverse{

    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length -1;
         while(start <= end)
         {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] = new int[]{10,20,30,40,50,60};

        reverseArray(arr);
        for(int i : arr)
            System.out.print(i+"\t");

    }
}