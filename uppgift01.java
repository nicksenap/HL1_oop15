public class uppgift01 {
    // Skriv ett program som utför beräkning av fakultet för heltal.
    // Nedan följer ett exempel på hur programmet skulle kunna fungera.
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        int res = 1;
        do {res = res*i;i--;
        }while(i>1);
        System.out.println("Result är "+res);
    }
}
