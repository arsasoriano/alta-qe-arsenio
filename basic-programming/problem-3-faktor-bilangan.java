public class Problem3FaktorBilangan {
    public static void main(String[] args) {
        int bilangan = 6;

        // process
        System.out.println("Faktor :");
        for (int nilai = 1; nilai <= bilangan; nilai++){
            if (bilangan % nilai == 0){
                System.out.println(nilai);
            }
        }
    }
}
