package plasticGame;

public class ConnectFourGrid {
	int[][] gameGrid = new int[6][7];
	
	public ConnectFourGrid() {
		
	}
	
	public void setBoard(){
      for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[0].length; j++) {
                gameGrid[i][j] = 0;
           	 }
      }
  	}
	
	public boolean checkWin(int num){
		boolean answer = false;
		boolean loopEnd = false;
		
		searchLoop:
			for (int col = gameGrid[0].length; col > 0; col--) {
				for (int row = gameGrid.length; row > 0; row--) {
					if(row > 2){
						if(gameGrid[row][col] == num) {
							if(gameGrid[row - 1][col] == num) {
								if(gameGrid[row - 2][col] == num){
									if(gameGrid[row - 3][col] == num) {
										answer = true;
										break searchLoop;
									}
								}
							}
						}
					}
					
					if(gameGrid[row][col] == num) {
						if(gameGrid[row - 1][col - 1] == num) {
							if(gameGrid[row - 2][col - 2] == num){
								if(gameGrid[row - 3][col - 3] == num) {
									answer = true;
									break searchLoop;
								}
							}
						}
					}
					
					System.out.print(gameGrid[row][col] + " ");
				}	
					System.out.println();
			}
		return answer;
	}

	public void move(int num){
            
			moveLoop:
			for (int col = gameGrid[0].length; col > 0; col--) {
                for (int row = gameGrid.length; row > 0; row--) {
                    if(gameGrid[row][col] == 0){
						gameGrid[row][col] = num;
						break moveLoop;
					}
                }
            }
	}
}
