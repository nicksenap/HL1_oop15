import java.math.BigInteger;
import java.util.*;

public class uppgift01x {
    //Det här metod är för att hantera tal som är större än 20.
    //Factorial 20 är ett "Big Integer", vanlig metod kommer inte att fungera.
    static ArrayList<BigInteger> table = new ArrayList<BigInteger>(); //Skaffa en töm ArrayList med type BigInterger.
    static {table.add(BigInteger.valueOf(1));} // Add tal 1 till.

    public static BigInteger factorial(int x) { //Det här metod är att insert factorial tal
                                                // från 1 till det talet som finns i input
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastfact = table.get(size - 1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return table.get(x);    //Sen return det factorial tal som har index x från input.
    }
    public static void main(String[] args){
        System.out.println(factorial(Integer.parseInt(args[0]))); //Main metod att köra factorial.
    }
}
