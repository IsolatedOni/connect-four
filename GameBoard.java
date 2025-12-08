public class GameBoard{
  
  private int[][] gameGrid;
  
  public GameBoard(int r, int c){
    gameGrid = new int[r][c];
  }

  //Check README file to see function
  public void setBoard(){
      for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[0].length; j++) {
                arr[i][j] = 0;
            }
        }
  }
  
  public boolean checkGameCond(int num){
      
    boolean win;
    
    searchLoop:
    for (int col = gameGrid[0].length; col > 0; col--) {
           
          for (int row = gameGrid.length; row > 0; row--) {
              
              if(gameGrid[row][col] == num){
                if(gameGrid[row][col - 1] == num){
                  if(gameGrid[row][col - 2] == num){
                    if(gameGrid[row][col - 3] == num){
                      win = true;
                      break searchLoop;
                    }
                  }
                }
              }

            if(gameGrid[row][col] == num){
                if(gameGrid[row - 1][col - 1] == num){
                  if(gameGrid[row - 2][col - 2] == num){
                    if(gameGrid[row - 3][col - 3] == num){
                      win = true;
                      break searchLoop;
                    }
                  }
                }
              }
          }
      }
      return win;
  }

  
}
