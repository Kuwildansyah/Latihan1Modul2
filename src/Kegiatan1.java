//import java.util.ArrayList;
//
//public class Kegiatan1 {
//    public static void main(String[] args) {
////      1. Bikin arraylist
//        ArrayList<String> hewanList = new ArrayList<>();
//        hewanList.add("Angsa");
//        hewanList.add("Bebek");
//        hewanList.add("Cicak");
//        hewanList.add("Domba");
//        hewanList.add("Elang");
//        hewanList.add("Gajah");
//
//        System.out.println("Isi ArrayList hewan:");
//        for (String namaHewan : hewanList) {
//            System.out.println(namaHewan);
//        }
////        2. Tambahkan elemen lagi “Badak” dan ”Bebek”, hitung jumlah elemen “Bebek” dan tampilkan posisi index dari elemen “Bebek” pada object kosong yang telah dibuat.
//        hewanList.add("Badak");
//        hewanList.add("Bebek");
//        int countOfBebek = 0;
//        int index = -1;
//        for (String element : hewanList) {
//            if (element.equals("Bebek")) {
//                countOfBebek++;
//                if (index == -1) {
//                    index = hewanList.indexOf(element);
//                }
//            }
//        }
//        System.out.println("Jumlah elemen \"Bebek\" adalah " + countOfBebek + "\nIndex elemen \"Bebek\" adalah " + index);
//        System.out.println("\n2. \n" + hewanList);
//
////        3. Hapus posisi “Bebek” yang pertama.
//        hewanList.remove("Bebek");
//        System.out.println("\n 3.  \n" + hewanList);
//        System.out.println("\n");
//
////         4. Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0.
//        System.out.println("Elemen pada index ke-0 adalah " + hewanList.get(0));
//        System.out.println("Elemen pada index ke-2 adalah " + hewanList.get(2));
//        hewanList.remove(0);
//        System.out.println("\n 4. \n" + hewanList);
//
////        5. Ubah index ke-0 dari “Cicak” Menjadi “Ular”, selanjutnya tambahkan elemen baru pada index ke-2 dengan “Itik”.
//        hewanList.set(0, "Ular");
//        hewanList.add(2, "Itik");
//        System.out.println("\ntampilkan 5. \n" + hewanList);
//
////        6. Hapus elemen diantara index ke-1 dan ke-5.
//        hewanList.subList(2, 5).clear();
//        System.out.println("\ntampilkan 6. \n" + hewanList);
//        System.out.println("\n");
//
////        7. Tampilkan elemen pertama dan terakhir.
//        System.out.println("Elemen pertama adalah " + hewanList.get(0));
//        System.out.println("Elemen terakhir adalah " + hewanList.get(hewanList.size() - 1));
//
////        8. Menampilkan jumlah elemen pada ArrayList.
//        System.out.println("\nJumlah elemen pada ArrayList adalah \n" + hewanList.size());
//
////         9. Cari posisi index dari “Badak”.
//        index = hewanList.indexOf("Badak");
//        System.out.println("\nIndex elemen \"Badak\" adalah \n" + index);
//    }
//}