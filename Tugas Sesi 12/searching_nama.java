/*
Nama        = Muhamad Iqbal Ramadhan
NIM         = 20210040139
Class       = TI21G
 */
import java.util.ArrayList;
public class searching_nama {
    public static void main(String[] args) {
        int nim[] = { 1102021, 1102022, 1102023, 1102024, 1102025, 1102026 };
        String nama_arr[] = { "Andri Hariadi", "Dewi Lestari", "Dewi Agustin", "Reni Indrayati", "Toni Sukmawan",
                "Toni Gunawan" };
        String alamat[] = { "Bandung", "Surabaya", "Malang", "Malang", "Surabaya", "Bandung" };

        int n = nama_arr.length;
        ArrayList<Integer> posisi = cariLinear(nama_arr, n, "Iqbal");

        if (posisi.size() > 0) {
            for (int i = 0; i < posisi.size(); i++) {
                int indeks = posisi.get(i);
                System.out.println((i + 1) + ". " + nim[indeks] + " - " + nama_arr[indeks] + " - " + alamat[indeks]
                        + " - " + "Data nomor " + (indeks + 1));
            }
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    static ArrayList<Integer> cariLinear(String nama_arr[], int n, String cariNama) {
        ArrayList<Integer> posisiNama = new ArrayList<>();
        int j = 0;
        while (j < n) {
            String nama = "";
            for (int i = 0; i < nama_arr[j].length(); i++) {

                nama += nama_arr[j].charAt(i);
                if (nama_arr[j].charAt(i) == ' ' || j == nama_arr.length) {
                    nama = nama.trim();
                    break;
                }
            }

            if (nama.compareTo(cariNama) == 0) {
                posisiNama.add(j);
            }

            j++;
        }
        return posisiNama;
    }

}