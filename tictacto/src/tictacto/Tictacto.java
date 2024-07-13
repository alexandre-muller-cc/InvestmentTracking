package tictacto;

public class Tictacto {
	
	//Separate the board position based on the player
	
	public static int[] playermove(int[] moves)
	{
		
		//For the x board moves  
		
		if (moves.length%2==0)
		{
			int[] movesA = new int[moves.length/2];
			
			//Its the double 
			for (int i=0;i<movesA.length;i++) {
				movesA[i]=moves[i*2];
				
			}
			return movesA;

			
		}
			
		else 
		{
			int[] movesA = new int[(moves.length+1)/2];
			//Its the double 
			for (int i=0;i<movesA.length;i++)
			{
				movesA[i]=moves[i*2];
			}
			
		return movesA;
		}
	}
}


		
