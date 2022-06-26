/*
Nama        = Muhamad Iqbal Ramadhan
NIM         = 20210040139
Class       = TI21G
 */
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    public static int BinarySearch(String[] a, String x) {
        int z = 0;
        int head = a.length - 1;
        int y;

        while (z <= head) {
            y = (z + head) / 2;

            if (a[y].compareTo(x) < 0) {
                z = y + 1;
            } else if (a[y].compareTo(x) > 0) {
                head = y - 1;
            } else {
                return y;
            }
        }
        return -1;
    }

    public static int process(String[] dataUnsp, String cari){

        for(int c = 0 ; c < dataUnsp.length;c++ )
        {
            if(cari == dataUnsp[c])
            {
                int dataOut = c;
                return dataOut;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        String ID[] ={"Buku","Perpustakaan","Sekolah","Kelas"};
        String cacheID[] = ID.clone();
        String ENG[] ={"Book","library","School","class"};
        String cacheENG[] = ENG.clone();

        // Cari Kosakata ID/ENG
        String search = "School";

        int idOutput = process(cacheID,search);
        int enOutput = process(cacheENG,search);

        Arrays.sort(ID);
        Arrays.sort(ENG);
        int idResult = BinarySearch(ID,search);
        int enResult = BinarySearch(ENG,search);

        if(idResult == -1 && enResult == -1)
        {
            System.out.println("Keyword Tidak ditemukan!");
        }
        else
        {   for(int y = 0; y <= ID.length; y++)
        {
            if(search == ID[y])
            {
                System.out.println("\n===================");
                System.out.println("Kata ditemukan di ID!");
                System.out.println("===================");
                System.out.println("ID => ENG : " +search + " = " + cacheENG[idOutput]);
                break;
            }
            else if (search == ENG[y])
            {
                System.out.println("\n===================");
                System.out.println("Kata ditemukan di ENG!");
                System.out.println("===================");
                System.out.println("ENG => ID : " + search + " = " + cacheID[enOutput]);
                break;
            }
        }
        }
    }
}