/*
 Nama   = Muhamad Iqbal Ramadhan
 NIM    = 20210040139
 Kelas  = Ti21G
*/
public class insertion {
    public static void main(String args[]) {
        int a[] = { 8, 5, 9, 6, 3, 4 };
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int j = i;
            while ((j > 0) && (min < a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = min;
        }
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x] + ",");
        }
    }
}