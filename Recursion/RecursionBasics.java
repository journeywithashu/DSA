public class RecursionBasics {
     public static void printDec(int n){
          if(n == 1){
               System.out.print(1);
               return;
          }
          System.out.print(n+" ");
          printDec(n-1);
     }
     public static void printInc(int n){
          if(n == 1){
               System.out.print(n+" ");
               return;
          }
          printInc(n-1);
          System.out.print(n+" ");

     }
     //PROBLEM 3

     public static int fact(int n){
          if(n == 0){
               return 1;
          }
          int fnm1 = fact(n-1);
          int fn = n*fact(n-1);
          return fn;
     }
  
     //Problem 4
      public static int calSum(int n){
          if(n == 1){
               return 1;
          }
          int Snm1 = calSum(n-1);
          int sn = n + Snm1;
          return sn;
      }
     
      //Problem- Fibonacci Number
      public static int fib(int n){
          if(n == 0 || n == 1) return n;
          int fnm1 = fib(n-1);
          int fnm2 = fib(n-2);
          int fn = fnm1 + fnm2;
          return fn;
      }

     public static void main(String[] args) {
         int n = 5;
        // printDec(n);
         //printInc(n);
         System.out.println(fib(n));
     }
}
