//Soal C
public class bubble {
    public static void main(String args[]) {
        String arr[] = new String[6];
        //Insert Data
        arr[0] = "Semarang";
        arr[1] = "Malang";   
        arr[2] = "Jakarta";
        arr[3] = "Cianjur";
        arr[4] = "Bogor";
        arr[5] = "Denpasar";

        String temp;
        int i;
        for (int j = 0; j < arr.length; j++) {
            for (i = j + 1; i < arr.length; i++) {
                // comparing adjacent string
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            //Menampilkan data setelah diurutkan
            System.out.print("Hasil Sorting : ");
            System.out.println(arr[j]);
        }
    }
}