public class Es1 {
public static void main(String[] args){
    System.out.println("Ciao a tutti");
    System.out.println("Il risultato della moltiplicazione è " + molt(2,5));
    System.out.println("La concatenazione è " + conc("Ciao", 2));
    String[] stringArray = {"banana", "fragola", "pera", "ananas", "pesca"};
    String el2 = "albicocca";
    String[] resultArray = insInArray(stringArray, el2);

    for (String str : resultArray) {
        System.out.print(str + " ");
    }

}


    public static int molt (int num1, int num2){
        return num1 * num2;
    };
public static String conc(String el1, int el2){
    return el1 + el2;
}





public static String[] insInArray( String[] stringArray, String el2){
    String[] newArray = new String[6];
    for (int i = 0; i < 2; i++) {
        newArray[i] = stringArray[i];
    }
    newArray[2] = el2;

    for (int i = 2; i < stringArray.length; i++) {
        newArray[i + 1] = stringArray[i];
    }
    return newArray;
    }

};
