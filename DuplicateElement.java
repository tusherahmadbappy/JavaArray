
package arraysearch;

public class DuplicateElement {
    
    public void duplicateValue(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
            
                if(arr[i]==arr[j]){
                    
                    System.out.println("Duplicate value of array is: "+arr[j]);
                }
                
                
            }
            
            
        }       
        
        
    }
    
}
