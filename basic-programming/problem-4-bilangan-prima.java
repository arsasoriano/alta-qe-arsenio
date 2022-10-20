public class Problem4BilanganPrima {
    private static boolean primeNumber (int number){
        boolean type;
        int faktor = 0;
        for (int nilai = 1; nilai <= number; nilai++){
            if (number % nilai == 0){
                faktor = faktor + 1;
            }
        } if (faktor == 2){
            type = true;
        } else {
            type = false;
        }
        return type;
    }
    public static void main(String[] args) {
       System.out.println(primeNumber(11));
       System.out.println(primeNumber(13));
       System.out.println(primeNumber(17));
       System.out.println(primeNumber(20));
    }
}
