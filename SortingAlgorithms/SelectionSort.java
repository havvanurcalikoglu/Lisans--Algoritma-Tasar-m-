
public class SelectionSort
{
	static void sirala(int[] array)
	{
		int n = array.length;
		int temp;
		int enKucuk;
		
		for(int i = 0; i < n; i++ )
		{	
			enKucuk = i;
			for(int j = i+1 ; j < n ; j++)
			{
				if(array[j] < array[enKucuk])
					enKucuk = j;
			}
				
				temp = array[i];
				array[i] = array[enKucuk];
				array[enKucuk] = temp;
			
		}
		
		
	}	
	public static void main(String[] args)
	{
		int array[] = {5, 2, 4, 6, 1, 3};
		System.out.print("Sýrasýz hali: ");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
		System.out.println();
		
		System.out.print("Sýralý hali: ");
		sirala(array);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		


	}

}
