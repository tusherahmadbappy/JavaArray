
package arraysearch;

import static java.lang.System.in;
import java.util.Scanner;

public class Arraysearch {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int[] anArray={2,5,0,5,8,2,3,4,5,9,9};
        
        System.out.println("Which case call you want: ");
        int caseNumber = s.nextInt();
        
        switch(caseNumber){
        
            case 1:{
            
                Linearsearch ob1 = new Linearsearch();
                System.out.println("Enter value to search in array: ");
                int searchFor = s.nextInt();
                ob1.searchElement(anArray, searchFor);
                
                break;
            
            }
            
            case 2:{
            
                //create Maxmin class object
                Maxmin ob2 = new Maxmin();
                ob2.maximum(anArray);
                ob2.minimum(anArray);
                
                break;
            
            }
            case 3:{
            
                //create Secondmaxmin object
                Secondmaxmin ob3 = new Secondmaxmin();
                ob3.secondMax(anArray);
                ob3.secondMin(anArray);
                
                break;
            }
            
            case 4:{

                //Create DuplicateElement object
                DuplicateElement ob4 = new DuplicateElement();
                ob4.duplicateValue(anArray);//Create DuplicateElement object

                break;
            }
            
            case 5:{
            
                //Create EvenOddNumber object
                EvenOddNumber ob5 = new EvenOddNumber();
                ob5.evenodd(anArray);
                
                break;
            
            }
            
            case 6:{

                //Create total object
                System.out.println("Enter which values are sum in array: ");
                int sum=s.nextInt();
                TotalElement ob6 = new TotalElement();
                ob6.total(anArray,sum);
                
                break;
            
            }
        
        }          
    }
}
    

