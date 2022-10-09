class T
{
	public static void main(String[] args) 
	{
		for (char i = 'F'; i >= 'A'; i ++ )
		{
			for (char j = i ; j <= (i - 5) ; j++ )
			{
              System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
