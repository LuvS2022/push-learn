class  M
{
	public static void main(String[] args) 
	{
		for (int i = 7 ; i >= 5 ; i -- )
		{
			for (int j = i ; j >= (i - 4) ; j -- )
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
