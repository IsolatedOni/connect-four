package plasticGame;

public class ConnectFourGrid {
	int[][] gameGrid = new int[6][6];
	
	public ConnectFourGrid() {
		
	}
	
	public boolean checkWin(int num){
		boolean answer = false;
		boolean loopEnd = false;
		
		if(loopEnd == false) {
			for (int col = gameGrid[0].length; col > 0; col--) {
				for (int row = gameGrid.length; row > 0; row--) {
					if(gameGrid[row][col] == num) {
						if(gameGrid[row - 1][col] == num) {
							if(gameGrid[row - 2][col] == num){
								if(gameGrid[row - 3][col] == num) {
									answer = true;
								}
							}
						}
					}
					
					if(gameGrid[row][col] == num) {
						if(gameGrid[row - 1][col - 1] == num) {
							if(gameGrid[row - 2][col - 2] == num){
								if(gameGrid[row - 3][col - 3] == num) {
									answer = true;
								}
							}
						}
					}
					
					
					System.out.print(gameGrid[row][col] + " ");
				}	
					System.out.println();
			}
			loopEnd = true;
		}
		
		
		return answer;
	}
}
