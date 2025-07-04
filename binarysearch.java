import java.util.*;
public class binarysearch{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter your elements");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter your target value");
        int key = sc.nextInt();
    
        int lb=0;
        int ub=a.length-1;

        boolean found = false;
    
       while(lb<=ub){
           int mid = (lb+ub)/2;
           if(a[mid]==key){
               System.out.println("Element found at index:" + mid);
               found = true;
               break;
           }
           
           else if(a[mid]<key){
               lb = mid+1;
           }
           else{
               ub = mid-1;
            sc.close();
        }
    }
        
        if(!found){
            System.out.println("Element not found");
        }
    }
}
