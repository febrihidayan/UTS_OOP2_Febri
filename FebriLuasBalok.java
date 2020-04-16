
public class FebriLuasBalok {

    public static void main(String[] args) {
        int panjang, tinggi, lebar, luas;

        panjang = 500;
        tinggi = 10;
        lebar = 5;

        luas = 2 * ( (panjang * tinggi) + (panjang * lebar) + (tinggi *lebar) );

        System.out.println("Luas balok ialah: " + luas);
    }

}