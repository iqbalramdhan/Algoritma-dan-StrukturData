//Bagian Stack Playlist
public class Tugas_SesiEnam_StackLagu {
    private final int MAX_LAGU_PLAYLIST = 10;
    private String[] tumpuk_playlist_lagu = new String[MAX_LAGU_PLAYLIST];
    private int teratas;
    
    public Tugas_SesiEnam_StackLagu(){
        teratas = 0;
        clear();
    }

    public boolean push(String namaLagu){
        if(teratas == MAX_LAGU_PLAYLIST){
            System.out.println("data sudah penuh");
            return false;
        }
        else{
            teratas++;
            tumpuk_playlist_lagu[MAX_LAGU_PLAYLIST - teratas] = namaLagu;
            return true;
        }
    }

    public boolean isEmpty(){
        return teratas == 0;
    }

    public int getData(){
        return teratas;
    }

    public String pop(){
        String lagu = null;
        if(!isEmpty()){
            for(int i = 0; i < tumpuk_playlist_lagu.length; i++){
                if(tumpuk_playlist_lagu[i] != null){
                    lagu = tumpuk_playlist_lagu[i];
                    tumpuk_playlist_lagu[i] = null;
                    break;
                }
            }
            teratas--;
            return lagu;
        }
        else{
            return null;
        }
    }

    public void getInfo(){
        for (int i = 0; i < tumpuk_playlist_lagu.length; i++) {
            if(tumpuk_playlist_lagu[i] != null){
                System.out.println((i - (MAX_LAGU_PLAYLIST - teratas) + 1) + ". " + tumpuk_playlist_lagu[i]);
            }
        }
    }

    public void clear(){
        for(int i = 0; i < tumpuk_playlist_lagu.length; i++){
            tumpuk_playlist_lagu[i] = null;
        }
        teratas = 0;
    }
}
