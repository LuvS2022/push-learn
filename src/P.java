class P 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 6 ; i ++ )
		{
			for (int j = 0 ; j <= 5  ; j ++ )
			{
				if (i == 1 || i == 6 || j == 5 || j == 0)
				{
                 System.out.print("0 ");
				}
				else { 
					if(j >= 1 && j <= 5)
					 {
						 for ( int k = (i - 1) ; k <= (i+2) ; k ++ )
						 {
                       System.out.print(k + " ");
						 }
						 break;
				}
			}
			}
          System.out.println();
		}
	}
}
/*
0 0 0 0 0 0
0 1 2 3 4 0
0 2 3 4 5 0
0 3 4 5 6 0
0 4 5 6 7 0
0 0 0 0 0 0
*/