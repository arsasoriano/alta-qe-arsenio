public class Problem7Mean {
    private static float Mean(float[] numbers){
        float jum = 0;
        float rataRata;
        int size = numbers.length;
        for (int i = 0; i <= size-1; i++){
            jum = jum + numbers[i];
        } rataRata = jum/size;
        return rataRata;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}

