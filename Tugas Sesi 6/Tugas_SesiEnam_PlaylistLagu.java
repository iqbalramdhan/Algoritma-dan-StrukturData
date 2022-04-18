/*
Nama = Muhamad Iqbal Ramadhan
NIM = 20210040139
Kelas = TI21G
*/

//Bagian Menu Playlist
import java.util.Scanner;

public class Tugas_SesiEnam_PlaylistLagu {
    public static void main(String[] args) {

        Tugas_SesiEnam_StackLagu lagu = new Tugas_SesiEnam_StackLagu();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("################# Menu Playlist ##################");
            System.out.println("1. Tampilkan playlist musik");
            System.out.println("2. Tambahkan playlist musik");
            System.out.println("3. Hapus playlist musik");
            System.out.println("4. Tambah playlist musik di urutan tertentu");
            System.out.println("5. Hapus playlist musik di urutan tertentu");
            System.out.println("6. Hapus semua playlist musik");
            System.out.println("7. Keluar dari menu");
            System.out.println("##################################################");
            System.out.print("jawaban (1-7)?:  ");
            int jawab_playlist = sc.nextInt();
            if(jawab_playlist == 1){
                System.out.println("=================== Daftar Lagu ====================");
                lagu.getInfo();
            }
            else if(jawab_playlist == 2){
                System.out.println("====================================================");
                System.out.print("masukan nama lagu: ");
                String namaLagu = sc.next();
                lagu.push(namaLagu);
                System.out.println(namaLagu + " Telah dimasukan");
            }
            else if(jawab_playlist == 3){
                lagu.pop();
            }
            else if(jawab_playlist == 4){
                System.out.println("====================================================");
                Tugas_SesiEnam_StackLagu tempLagu = new Tugas_SesiEnam_StackLagu();
                System.out.print("masukan nama lagu: ");
                String namaLagu = sc.next();
                System.out.print("dimasukan ke urutan: ");
                int urutan = sc.nextInt();
                if(urutan > lagu.getData()){
                    System.out.println("tidak bisa ditambahkan, urutan hanya sampai " + lagu.getData());
                }
                else{
                    for(int i = 0; i < urutan - 1; i ++){
                        tempLagu.push(lagu.pop());
                    }
                    lagu.push(namaLagu);
                    System.out.println(namaLagu + " telah dimasukan di urutan ke: " + urutan);
                    for(int i = 0; i < urutan - 1; i++){
                        lagu.push(tempLagu.pop());
                    }
                }
            }

            else if(jawab_playlist == 5){
                System.out.println("====================================================");
                Tugas_SesiEnam_StackLagu tempLagu = new Tugas_SesiEnam_StackLagu();
                System.out.print("Hapus urutan ke: ");
                int urutan = sc.nextInt();
                if(urutan > lagu.getData()){
                    System.out.println("tidak bisa ditambahkan, urutan hanya sampai " + lagu.getData());
                }
                else{
                    for(int i = 0; i < urutan - 1; i ++){
                        tempLagu.push(lagu.pop());
                    }
                    lagu.pop();
                    for(int i = 0; i < urutan - 1; i++){
                        lagu.push(tempLagu.pop());
                    }
                }
            }
            
            else if(jawab_playlist == 6){
                lagu.clear();
            }
            else if(jawab_playlist == 7){
                break;
            }
        }
        sc.close();
    }

}
