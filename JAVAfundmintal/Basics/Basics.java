
//// # 1 

// class Basics{
//     public void print() {
//         for(int i=0;i<255;i++){
//             System.out.println(i);
//         }
        
//     }

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }

///////////////// # 2 
// class Basics{
//     public void print() {
//         int n = 255;
//         for(int i=1 ; i<= n ;i++){
//             if( i % 2 !=0){
//             System.out.println(i);
//         }
//         }
        
//     }   

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }

// # 3 
// class Basics{
//     public void print() {
//         int n = 255;
//         int sum =0;
//         for(int i=0 ; i<= n ;i++){
//             sum += i ;
//             System.out.println("new number:"+i+ "sum number:"+sum);
        
//         }
        
//     }   

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }

/////#4 
// class Basics{
//     public void print() {
//         int[] myArray = {-3, -5, -7};
//         int sum =0;
//         for(int i=0 ; i<= n ;i++){
//             sum += i ;
//             System.out.println("new number:"+i+ "sum number:"+sum);
        
//         }
        
//     }   

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }



//__________________________#5
// class Basics{
//     public void print() {
//         int[] myArray = {-3, -5, -7,-1};
//         int max= myArray [0];
//         for(int i =0 ; i<myArray.length;i++){
//             if(myArray[i] > max ){
//                 max = myArray[i];
//             }
//         }
//         System.out.println(max);
        
//         }
        
       

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }

/////////____________________#6


// class Basics{
//     public void print() {
//         int[] myArray = {4, 5, 5,10,1};
//         int avg= myArray [0];
//         int sum = myArray[0] ;
//         for(int i =0 ; i<myArray.length;i++){
//             sum +=myArray[i];
//             avg= sum / myArray.length;
//         }
//         System.out.println(avg);
        
//         }
        
       

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }


////////__________________#7
// import java.util.Arrays;
// class Basics{
//     public void print() {
//         int[] myArray ;
//         myArray = new int [256];
//         for(int i = 1 ; i<256;i++){
//             if(i % 2 !=0 ){
//                 myArray[i] = i;
//             }
//         }
//         System.out.println(Arrays.toString(myArray));
        
//         }
        
       

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.print();
// }
// }

//________________________________________#8



// public class Basics {
//     static int Great_Y(int[] arr,int y) {
//       int sum = 0 ; 
//       for (int i = 0; i<arr.length;i++){
//           if(arr[i]>y){
//           sum++; }}
      
//       return sum;
      
//     }
  
//     public static void main(String[] args) {
//         Basics b = new Basics();
//       int [] arr = {1,2,3};
//       int y = 2;
//       b.Great_Y(arr,y);
    
//     }
    
//   }
  

////______________________#9 
// import java.util.Arrays;

// public class Basics{
// static int[] squar(){
//     int[] intArray={1, 5, 10, -2};
//     for(int i =0;i<intArray.length;i++){

//         intArray[i]=intArray[i]*intArray[i];
//     }
//         System.out.println(Arrays.toString(intArray));
//         return intArray;

// }

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.squar();
// }
// }

///_________________________# 10 

//  import java.util.Arrays;

// public class Basics{
// static int[] negativ(){
//     int[] intArray={1, 5, 10, -2};
//     for(int i =0;i<intArray.length;i++){
//         if(intArray[i]<0){
//             intArray[i]=0 ; 
//         }

//     }
        // System.out.println(Arrays.toString(intArray));
//         return intArray;

// }

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.negativ();
// }
// }

////________________________________#11
import java.util.Arrays;

// public class Basics{
// static int[] min_max_avg(){
//     int[] intArray={1, 5, 10, -2,1};
//     int avg = intArray[0]; 
//     int sum = intArray[0] ; 
//     int min = intArray[0] ; 
//     int max = intArray[0] ; 
//     for(int i =0;i<intArray.length;i++){
//             if(intArray[i]>max){
//                 max = intArray[i];
//                 intArray[0]=max ;
//                 intArray[i]=max;
//             }
//             if(intArray[i]<min){
//                 min = intArray[i];
//                 intArray[1]=min;
//                 intArray[i]=min;
//             }
//             sum +=intArray[i];
//             avg = sum / intArray.length ;
//              intArray[i] =avg;  
//             }
    
//         System.out.println( Arrays.toString(intArray));
//         System.out.println(sum);
//         return intArray ;

//         }

// public static void MaxMinAverage(int[] nums) {
//     int min = FindMin(nums);
//     int max = FindMax(nums);
//     double avg = GetAverage(nums);
//     System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
// }
// }

// public static void main(String[] args){
//     Basics b = new Basics();
//     b.MaxMinAverage();
// }
// }