import static java.lang.Math.sqrt;

public class Es3 {
    public static void main (String[]arg){
        System.out.println("Il risultato è " + rettangolo(2.5, 5.8));
        System.out.println("Questo numero è pari " + pariODispari(4));
        System.out.println("Questo numero è dispari " + pariODispari(7));
        System.out.println("Questa è l'area del triangolo " + areaTriangolo(1.5,2.5,3.5));
    }
    public static int rettangolo (double num1, double num2){
        return (int) ((num1 + num2) *2);
    }

    public static int pariODispari (int number){
        if(number%2 == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static double areaTriangolo (double num1, double num2, double num3){
        double p = (num1 + num2 + num3) / 2;
        double a = Math.sqrt(p*(p-num1)*(p-num2)*(p-num3));

        return a;
    }
}
