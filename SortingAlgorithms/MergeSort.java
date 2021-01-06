import java.util.Scanner;

public class MergeSort {
	/*
	 * b�l s�rala birle�tir. girilen dizi yar�ya b�l�n�r ta ki tek elemana kadar.
	 * ard�ndan s�ralanarak birle�tirilir
	 */
	private int[] array;
	private int[] temp;
	private int length;

	public void Sort(int[] nums) {
		this.length = nums.length;
		this.array = nums;
		this.temp = new int[length];
		Divide(0, length - 1);
	}

	private void Divide(int left, int right) {
		if (left < right) {
			int center = (right + left) / 2; // dizinin ortas�
			Divide(left, center); // sol taraf� b�l
			Divide(center + 1, right); // sa� taraf� b�l
			Merge(left, right, center);
		}
	}

	private void Merge(int left, int right, int center) {
		for (int i = left; i <= right; i++)
			temp[i] = array[i]; // i�lem yap�lacak aral�k ge�ici diziye at�l�r
		int a = left; // dizinin ba�lang�� noktas�
		int b = center + 1; // b�l�m noktas� + 1 sa� k�sm�n ba�lang�� indisi
		int c = left; // de�i�tirilen par�an�n indisi
		while (a <= center && b <= right) // sol k�s�m ortaya, di�er k�s�m biti�e gelene kadar
		{
			// sa� ve sol par�alar�n de�erini kar��la�t�r
			if (temp[a] <= temp[b]) // k���kse e�it ise sol k�s�mdaki gelir.
			{
				array[c] = temp[a];
				a++; // bir sonraki indisler i�in
			} else {
				array[c] = temp[b]; // b�y�k ise sa� k�s�m ile yer de�i�tirir.
				b++; // bir sonraki indisler i�in
			}
			c++; // di�er indise ge�
		}
		while (a <= center) // i�lem g�rmemi� k�s�mlar� orta noktaya gelene kadar array'a aktar�yoruz
		{
			array[c] = temp[a];
			c++;
			a++;
		}
	}

	public static void main(String[] args) {
		 int giris, kacAdet;
		 Scanner sayiAl = new Scanner(System.in);

		 System.out.println("Ka� adet say� gireceksiniz?");
		 kacAdet = sayiAl.nextInt();
		 int[] array = new int[kacAdet];

		 for (int x = 0; x < array.length; x++)
		 {
		 System.out.print("Tam Sayi Giriniz: ");
		 giris = sayiAl.nextInt();
		 array[x] = giris ;
		 }

		MergeSort m = new MergeSort();
		m.Sort(array);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}
}
