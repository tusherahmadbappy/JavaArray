
package arraysearch;

public class Linearsearch {
    public void searchElement(int a[],int searchTo){
    
        int i;
        boolean foundIt = false;
        for(i=0;i<a.length;i++){
            if(a[i]==searchTo){
                foundIt = true;
                break;
            }
        }
        
        if(foundIt){
            System.out.println(searchTo +" found at possion: "+i);
        }
        else{
            System.out.println(searchTo+" Is not in array: ");
        }
    }
    
    
}
