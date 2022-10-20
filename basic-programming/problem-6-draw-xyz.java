public class Problem6DrawXYZ {
    private static void DrawXYZ (int n){
        int baris = 0;
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n; a++){
                baris = baris + 1;
                if (baris % 3 == 0){
                    System.out.print("X");
                } else if (baris % 2 == 0) {
                    System.out.print("Z");
                } else if (baris % 2 != 0) {
                    System.out.print("Y");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        DrawXYZ(5);
    }
}
