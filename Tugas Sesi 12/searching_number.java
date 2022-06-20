public class searching_number {
    public static void main(String[] args) {
        int arr[] = { 30, 70, 20, 87, 90, 65, 19, 88 };
        int n = arr.length;
        int posisi = (cariLinear(arr, n, 65));

        if (posisi == -1) {
            System.out.println("data tidak ditemukan");
        } else {
            System.out.println("data ditemukan di posisi: " + posisi);
        }
    }

    static int cariLinear(int arr[], int n, int x) {
        int posisi = -1;
        int j = 0;
        while (j < n) {
            if (arr[j] == x) {
                posisi = j;
                break;
            }
            j++;
        }

        return posisi;
    }

}