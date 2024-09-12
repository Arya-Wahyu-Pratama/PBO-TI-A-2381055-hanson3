package Hanson;

public class ForLoop {
    public static void main(String[] args) {
        String[] buah = new String[] {"Apple", "Pisang", "Mangga", "jeruk"};
        for(int i = 0; i < 4; i++){
            if(i == 2 || i == 3)
                continue;
            System.out.println("Element ke" + (i +2));
        }

        for(int i = 0; i < 4; i++){
            if(i == 2)
                break;
            System.out.println("Element ke" + (i +2));
        }
    }
}