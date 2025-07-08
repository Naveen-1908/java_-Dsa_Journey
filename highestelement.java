public class highestelement {
     public static int highestelement(int[]arr)
    {
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second)
            {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third ){
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,5,8,9,10};
        int thirdhighest = highestelement(arr);
        System.out.println("highest element is: " + highestelement(arr));
    }
    
}
