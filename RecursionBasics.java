// PROBLEM 1 DECREASING ORDER 
public class RecursionBasics{
    public static void printDec(int n){
        if(n == 1){ // base case agar mil jata hai tab loop se bahar a jayenge
            System.out.print(1); // print n 
            return;
        }
        System.out.print(n+ " "); // sabse pahle n ko print karenge
        printDec(n-1);
    }

        // PROBLEM 2 PRINT INCREASING ORDER 
        public static void printInc(int n){
            if(n == 1 ){
                System.out.print(n+" ");
                return;
            }
            printInc(n-1);
            System.out.print(n+" ");
        
    }   
    // PROBLEM 3 PRINT FACTORIAL OF N 
    public static int printFact(int n){
        if(n == 0){ // ye base case hai 
            return 1;
        }
        int fnm1 = printFact(n-1); // yahan par fact of n-1 ko print karenge
        int fn = n * printFact(n-1);
        return fn;
    }

    // PROBLEM 4 PRINT SUM OF FIRST N NATURAL NUMBER
    public static int Culsum(int n){
        // agar base case 1 ke equal ho jata hai tab 1 return kar denge
        if(n == 1){
            return 1;
        }
        int Snm1 = Culsum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    //  PROBLEM 5 PRINT nTH FIBONNACI NUMBER
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;

        }
        int Fnm1 = fib(n-1);
        int Fnm2 = fib(n-2);
        int fn = Fnm1 +Fnm2;
        return fn;
    }
    // PROBLEM 6 PRINT IF ARRAY IS  SORTED IS NOT
    public static boolean isSorted(int arr[], int i){
        // ye base case hai
        if(i == arr.length-1) {
            return true;

        } // agar i > i+1 tab return false
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    // problem 7 print first occurence of array
    public static int firstOccurence(int arr[], int key, int i){
        // ye base case hai
        if(i == arr.length){
            return -1;
        } // agar index i == key then return i
        if(arr[i] == key){
            return i;
         } // agar i nahi milta tab i ko increase kar do
        return firstOccurence(arr,key, i+1);
    }
    // problem 8 print last occurence in given array
    public static int lastOccurence(int arr[], int key, int i){
        // ye base case hai 
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
            if(isFound == -1 && arr[i] == key){
                return i;
            }
            return isFound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x*xnm1;
        return xn;
    }
    // problem no 11 tilling problem
    public static int tillinProblem(int n){//  2 x n (floor size)
        //base case
        if(n==0 || n == 1){
            return 1;
        }
    
    //kaam
    //vertical choice
    int fnm1 = tillinProblem(n-1);

    //horigental choice
    int fnm2 = tillinProblem(n-2);

    int totalways = fnm1 + fnm2;
    return totalways;
}
// problem 12 remove duplicate in string 

public static void removeDuplicate(String str, int idx, StringBuilder newStr,boolean map[]){
    // base case
    if(idx == str.length()){ // index 0 se 26 tak jayega
        System.out.println(newStr); // print newstring 
        return;
    }
    //kaam
    char currChar = str.charAt(idx);
    if(map[currChar-'a']== true){// agar current char pahle char se match ho jata hai matlab duplicate hau
        // duplicate

        removeDuplicate(str,idx+1,newStr,map); // index + 1 ho jayega 

    }else{
        map[currChar-'a'] = true;
        removeDuplicate(str,idx+1,newStr.append(currChar),map);
    }
} // problem 13 friends pairing 

public static int friendsPairing(int n){
    // base case
    if( n == 1 || n == 2){
        return n;
    }
    // choice 
    // single
    int fnm1 = friendsPairing(n-1);

    // pair
    int fnm2 = friendsPairing(n-2);
    int pairways = (n-1)*fnm2;

    //totways
    int totways = fnm1+pairways;
    return totways;
}
    public static void main(String args[]){
        // // int n = 25;
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // printDec(n); // func ko call lagaya 
        // printInc(n);
    //    System.out.println(printFact(n));
        System.out.println(Culsum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr,0));
        // System.out.rintln(lastOccurence(arr,5,0));
        // System.out.println(power(2,10));
        // System.out.println(tillinProblem(5));
        // String str = "appnnacollege";
        // removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
        // System.out.println(friendsPairing(3));
        


    }
}