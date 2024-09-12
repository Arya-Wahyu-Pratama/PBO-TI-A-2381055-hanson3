package Latihan;

public class LatihanDoWhile {
    public static void main(String[] args) {
        int angka = 1;
        int urutan = 1;
        do{
            if(angka == 15)
                break;
            if(angka % 3 == 0)
                continue;
            System.out.println("angka ke - " + urutan + ": " + angka);
            angka++;
            urutan++;
        }
        while(angka < 20);
    }
}
