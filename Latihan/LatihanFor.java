package Latihan;

public class LatihanFor {
    public static void main(String[] args) {
        int urutan = 1;
        for (int i = 0; i <= 20; i++) {
            if(i > 15)
                break;
            if (i % 3 == 0)
                continue;
            System.out.println("angka ke - " + (urutan) + ": " + i);
            urutan++;
        }
    }
}