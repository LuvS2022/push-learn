class  Q
{
    public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 6 ; i ++ )
		{
			for (int j = 5 ; j >= 0  ; j -- )
			{
				if (i == 1 || i == 6 || j == 5 || j == 0)
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
