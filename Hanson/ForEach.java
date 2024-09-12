package Hanson;

public class ForEach {
    public static void main(String[] args) {
        String[] buah = new String[] {"Apple", "Pisang", "Mangga", "Jeruk"};
        for(String namaBuah : buah){
            if(namaBuah.equals("Mangga") || namaBuah.equals("Jeruk"))
                continue;
            System.out.println(namaBuah);
        }
System.out.println("===============");
        for(String namaBuah : buah) {
            if (namaBuah.equals("Mangga"))
                break;
            System.out.println(namaBuah);
        }
    }
}
