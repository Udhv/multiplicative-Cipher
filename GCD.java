package Project ;

/**
 * GCD FOR FIND GCD IN KEY AND 26.
 * 
 */
public class GCD {
        public static int GCD (int a , int b){
            while (b != 0 ){
                int temp = b ;
                b = a % b ;
                a = temp ;  
            }
            return a ;
        }   
}