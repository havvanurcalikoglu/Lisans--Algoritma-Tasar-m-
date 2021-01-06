
public class BubbleSort {
	static void sirala(int[] array)
	{
		int temp = 0;
		int n = array.length;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j < (n-i); j++)
			{
				if(array[j] < array[j-1])
				{
					//Swap iþlemi
					
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
	     }
	}


	public static void main(String[] args) 
	{
		int array[] = {5,1,12,-5,16};
		
		System.out.print("Sýrasýz hali: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		sirala(array);
		System.out.print("Sýralý hali: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		

	}

}
