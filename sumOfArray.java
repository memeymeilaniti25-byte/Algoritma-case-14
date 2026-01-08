public class sumOfArray {
     static int sumArray(int [] arr, int n){
    if (n <= 0){
       return 0; 
    }  
       return arr [n-1]+ sumArray(arr, n-1); 
   }     
    public static void main(String[] args){
        int[] data = {2,1, 3, 4, 6,7,8,9};
        int hasil = sumArray(data, data.length);
        System.out.println("Sum of array =" + hasil);
    }
    
}
