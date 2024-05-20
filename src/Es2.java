import java.util.Scanner;

public class Es2 {
    public static void main (String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome");
        String firstname = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Scrivi il tuo cognome");
        String surname = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Che lavoro fai?");
        String work = sc3.nextLine();
        System.out.println("Questi sono gli elementi in ordine di inserimento" + firstname + surname + work);
        System.out.println("Questi sono gli elementi in ordine inverso" + work + surname + firstname);
        sc1.close();
        }
}
