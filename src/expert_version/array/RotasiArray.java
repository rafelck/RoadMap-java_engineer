package expert_version.array;

public class RotasiArray {

    public RotasiArray() {
    }

    void leftRotate(int[] rafel, int a, int k) {
        for (int i = 0; i < a; i++) {
            leftRotatebyOne(rafel, k);
        }
    }

    void leftRotatebyOne(int[] rafel, int k) {
         int i, temp; 
        temp = rafel[0];
        for (i = 0; i < k - 1; i++) {
            rafel[i] = rafel[(i + 1)];
        }
        rafel[i] = temp;
    }

    void cetakArray(int[] rafel, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(rafel[i] + " ");
        }
    }

    public static void main(String[] args) {
        RotasiArray rotasi = new RotasiArray();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotasi.leftRotate(arr, 3, 7);
        rotasi.cetakArray(arr, 7);
    }
}
