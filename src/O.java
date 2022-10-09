class O
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 6 ; i ++ )
		{
			for (int j = 0 ; j <= 5  ; j ++ )
			{
				if (i == 1 || i == 6 || j == 0 || j == 5)
				{
                 System.out.print("0 ");
				}
				else {
						System.out.print( j + " ");
					}
				}
          System.out.println();
		}
	}
}