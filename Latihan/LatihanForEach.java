package Latihan;

public class LatihanForEach {
    public static void main(String[] args) {
        int[] angka = new int[20];
        int urutan = 1;
        for(int i = 0; i < 20; i++){
            angka[i] = i + 1;
        }
        for(int x : angka){
            if(x == 15){
                break;
            }
            if(x % 3 == 0){
                continue;
            }
            System.out.println("angka ke - " + urutan + ": " + x);
            urutan++;
        }
    }
}