// prime number
import java.util.*;
class Main{
    public static void main(String[] args) {
        
        int n = 5;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                System.out.print("non-prime");
            }
        }
         System.out.print("prime");
    }
}