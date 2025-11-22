public class Primes {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        // int range = 30;
        boolean[] primeArray = new boolean[range + 1];
        primeDetermentor(primeArray);
        printPrimeFromArr(primeArray, range);
    }

    public static void printPrimeFromArr (boolean[] arr , int range){
        System.out.println("Prime numbers up to " +range + ":");
        int numberOfPrimes = 0;
        for(int i = 2; i < arr.length; i++){
            if(arr[i] == true){
                System.out.println(i);
                numberOfPrimes++;
            }
        }
        System.out.println("There are " +numberOfPrimes +" primes between 2 and " +
        range +" (" +(numberOfPrimes / range * 100) +"% are primes)");
    }

    public static void setArrayToTrue (boolean[] arr){
            for(int i = 2; i < arr.length; i++){
                arr[i] = true;
            }
    }

    public static void primeDetermentor (boolean[] arr){
        if (arr.length > 2) {
            setArrayToTrue(arr);
            int primeIndex = 2;
            while (primeIndex != -1) {
                cancelDivisibleOfPrime(arr, primeIndex);
                primeIndex = nextPrimeIndex(arr, primeIndex);
            }
        }                   
    }

    public static void cancelDivisibleOfPrime (boolean[] arr, int index){
        for(int i = index + 1; i < arr.length; i++){
            if(i % index == 0){
                arr[i] = false;
            }
        }
    }

    public static int nextPrimeIndex (boolean[] arr, int index){
        for(int i = index + 1; i < arr.length; i++){
           if(arr[i] == true){
                return i;
            }
        }
        return -1;
    }


}