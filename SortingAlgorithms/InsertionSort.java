
public class InsertionSort 
{
	static void sirala(int[] array)
	{
		int n = array.length;
		int key;
		
		for(int j = 1; j < n; j++)
		{
			key = array[j];
			int i = j-1;
			while(i >= 0 && array[i] > key)
			{
				array[i+1] = array[i];
				i = i-1;
			}
			array[i+1] = key;
		}
	}
	
	public static void main(String[] args)
	{
		int array[] = {65,50,30,35,25,45};
		
		System.out.print("Sýrasýz hali: ");
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Sýralý hali: ");
		sirala(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		

	}

}
