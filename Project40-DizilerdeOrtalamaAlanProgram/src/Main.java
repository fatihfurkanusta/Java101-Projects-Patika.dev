public class Main {
    public static void main(String[] args) {
        int[] array ={100,105,85,13,95};
        int[] array2 ={34, 55, 67, 44, 200, 55, 84};

        avarage(array);
        harmonic(array2);

    }
    static void avarage(int[] array){
        double sum=0;
        double avarage;

        for(double i:array){
            sum+=i;
        }
        avarage = sum/array.length;
        System.out.println("Avarage : "+avarage);
    }
    static void harmonic(int[] array){
        double sum=0;
        double harmonicAvarage;

        for(double i:array){
            sum+=1/i;
        }
        harmonicAvarage=array.length/sum;
        System.out.println("Harmonic Avarage : "+harmonicAvarage);
    }
}