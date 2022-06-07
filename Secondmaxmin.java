
package arraysearch;

public class Secondmaxmin {
    
    public void secondMax(int arr[]){
        int i,fMax=arr[0], sMax=arr[0];
        for (i = 0; i < arr.length; i++)
            {
                if (arr[i] > fMax)
                {
                    sMax = fMax;
                    fMax = arr[i];
                }
                else if (arr[i] > sMax)
                {
                    sMax = arr[i];
                }
        }
        System.out.println("Second Maximum element of array is: "+sMax);
    }
    
     public void secondMin(int arr[]){
        
        int min1=arr[0],min2=arr[0];
        for (int i = 0; i < arr.length; i++)
            {
            if (arr[i] < min1)
            {
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] < min2)
            {
                min2 = arr[i];
            }
        }
        System.out.println("Second minimum element of array is: "+min2);
    }
    
}
