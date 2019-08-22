public class NumberOfIslands {

	static boolean [][] map = new boolean[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map[0][0] = true;
		map[0][1] = true;
		map[0][2] = true;
		map[1][0] = false;
		map[1][1] = false;
		map[1][2] = false;
		map[2][0] = true;
		map[2][1] = true;
		map[2][2] = true;
		
		numberOfIslands(map);
	}
	
	
	public static int numberOfIslands(boolean [][] isMap)
	{
		int[][] visitedMap = new int [isMap.length][isMap.length];
		int num = 0;
		for(int i = 0; i < isMap.length; i++)
		{
			for(int j = 0; j < isMap.length; j++)
			{
				if(visitedMap[i][j] != -1)
				{
					visitedMap[i][j] = -1;
					
					if(isMap[i][j] == true)
					{
						num++;
						System.out.println("here"+ map[i][j]);
					}else {
						
						System.out.println("here@1"+ map[i][j]);
					}
				}
			}
		}
		
		
		
		return 0;
	}
	


	
}



