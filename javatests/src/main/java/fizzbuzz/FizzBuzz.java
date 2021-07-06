package fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int n){
        String str = "";

        if(n % 3 == 0){
            str += "Fizz";
        }

        if (n % 5 == 0){
            str += "Buzz";
        }

        if((n % 3 != 0) && (n % 5 != 0)){
            str = String.valueOf(n);
        }

        return str;
    }
}
