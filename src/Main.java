import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        ArrayList<String> deleteHewan = new ArrayList<String>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");


        System.out.println("Isi Hewan : ");
        System.out.println("Isi DeleteHewan : " + Hewan);

        Hewan.removeAll(deleteHewan);

        System.out.println("Isi objek Hewan setelah penghapusan: ");
        for (String hewan : Hewan) {
            System.out.println(hewan);
        }
    }
}
