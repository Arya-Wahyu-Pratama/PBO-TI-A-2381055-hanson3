package Hanson;

public class DoWhile {
    public static void main(String[] args) {
        String[] buah = new String[]{"Apple", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        do {
                System.out.println("Nama buah -" + (counter + 1) + ": " + buah[counter]);
        counter++;
        } while (counter < buah.length) ;
    }
}