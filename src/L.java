class  L
{
	public static void main(String[] args) 
	{
		for (int i = 7 ; i <= 9 ; i ++ )
		{
			for (int j = i ; j >= (i - 6) ; j -- )
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
