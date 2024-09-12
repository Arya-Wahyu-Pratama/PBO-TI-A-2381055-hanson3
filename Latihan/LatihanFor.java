package Latihan;

public class LatihanFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0)
                continue;
            if(i > 15)
                break;
            System.out.println("Element ke" + (i + 1) + ": " + i);
        }
    }
}