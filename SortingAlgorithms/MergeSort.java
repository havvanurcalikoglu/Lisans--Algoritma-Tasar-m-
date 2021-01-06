import java.util.Scanner;

public class MergeSort {
	/*
	 * böl sýrala birleþtir. girilen dizi yarýya bölünür ta ki tek elemana kadar.
	 * ardýndan sýralanarak birleþtirilir
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
			int center = (right + left) / 2; // dizinin ortasý
			Divide(left, center); // sol tarafý böl
			Divide(center + 1, right); // sað tarafý böl
			Merge(left, right, center);
		}
	}

	private void Merge(int left, int right, int center) {
		for (int i = left; i <= right; i++)
			temp[i] = array[i]; // iþlem yapýlacak aralýk geçici diziye atýlýr
		int a = left; // dizinin baþlangýç noktasý
		int b = center + 1; // bölüm noktasý + 1 sað kýsmýn baþlangýç indisi
		int c = left; // deðiþtirilen parçanýn indisi
		while (a <= center && b <= right) // sol kýsým ortaya, diðer kýsým bitiþe gelene kadar
		{
			// sað ve sol parçalarýn deðerini karþýlaþtýr
			if (temp[a] <= temp[b]) // küçükse eþit ise sol kýsýmdaki gelir.
			{
				array[c] = temp[a];
				a++; // bir sonraki indisler için
			} else {
				array[c] = temp[b]; // büyük ise sað kýsým ile yer deðiþtirir.
				b++; // bir sonraki indisler için
			}
			c++; // diðer indise geç
		}
		while (a <= center) // iþlem görmemiþ kýsýmlarý orta noktaya gelene kadar array'a aktarýyoruz
		{
			array[c] = temp[a];
			c++;
			a++;
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
		 array[x] = giris ;
		 }

		MergeSort m = new MergeSort();
		m.Sort(array);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}
}
