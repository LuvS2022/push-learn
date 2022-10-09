class V 
{
	public static void main(String[] args) 
	{
		for (int i = 1 ; i <= 7 ; i ++ )
		{
			System.out.print ( " i is " + i + " go to inner " + "j is ,");	

			for ( int j = 1 ; j <= i ; j ++ )
			{
              System.out.print("j is " + j + " print = 1 ");
			}
          System.out.println( );	
		}
	}
}
