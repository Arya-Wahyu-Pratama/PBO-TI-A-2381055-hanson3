package Hanson;

public class While {
    public static void main(String[] args) {
        String[] buah = new String[]{"Apple", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        while (counter < buah.length) {
            System.out.println("Nama buah -" + (counter + 1));
            counter++;
        }
    }
}
