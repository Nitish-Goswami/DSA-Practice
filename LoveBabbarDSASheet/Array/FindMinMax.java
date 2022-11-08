

class FindMinMax{

    static class Pair{
        int min;
        int max;
    }

    public static Pair getMinMax(int arr[]){
        Pair ans = new Pair();
        ans.min = arr[0];
        ans.max = arr[0];

        for(int i=1;i<arr.length;i++)
            if(ans.min > arr[i]) ans.min = arr[i];
        
        for(int i=1;i<arr.length;i++)
            if(ans.max < arr[i]) ans.max = arr[i];
        
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = new int[]{ 10, 20, 30, 40, 50, 60 };

       
        Pair ans = getMinMax(arr);
        System.out.println("Minimum is : "+ans.min+" and Maximum is : "+ans.max);

    }
}