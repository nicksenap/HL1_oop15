public class uppgift02 {
    // Skriv ett program som avgör
    // om ett tal är ett primtal (delbart endast med ett och sig själv).
    public static void main(String args[]) {
        Boolean result = true;
        Integer a = Integer.parseInt(args[0]); //Byta input a, från String till Integer;
        Integer i = 2;    //Dela det talet a från 2 till sin själv.
        do {
            if (a % i == 0) {
                result = false; // Om det finns ett tal är mellan det talet a och 1 som kan delas av det,
                                // så är det talet a inte ett primtal.
                break;
            }
            i++;
        } while (i < a);
    if (result) {
        System.out.println(a+" är printal");
    }else{
    System.out.println("Nope");}
    }

}
