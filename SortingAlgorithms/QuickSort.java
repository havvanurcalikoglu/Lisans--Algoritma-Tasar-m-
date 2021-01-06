import java.util.Scanner;

public class QuickSort {
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		 int giris, kacAdet;
		 Scanner sayiAl = new Scanner(System.in);

		 System.out.println("Kaç adet sayý gireceksiniz?");
		 kacAdet = sayiAl.nextInt();
		 int[] array = new int[kacAdet];

		 for (int x = 0; x < array.length; x++)
		 {
		 System.out.print("Tam Sayi Giriniz: ");
		 giris = sayiAl.nextInt();
		 array[x] = giris;
		 }
		

		QuickSort q = new QuickSort();
		q.sort(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

}
