public class GameBoard{
  
  int[][] gameGrid = new int[6][6];
  
  public GameBoard(){
  
  }

  public boolean checkGameCond(int num){
      
    boolean win;
    for (int col = gameGrid[0].length; col > 0; col--) {
           
          for (int row = gameGrid.length; row > 0; row--) {
              
              if(gameGrid[row][col] == num){
                if(gameGrid[row][col - 1] == num){
                  if(gameGrid[row][col - 2] == num){
                    if(gameGrid[row][col - 3] == num){
                      win = true;
                    }
                  }
                }
              }

            if(gameGrid[row][col] == num){
                if(gameGrid[row - 1][col - 1] == num){
                  if(gameGrid[row - 2][col - 2] == num){
                    if(gameGrid[row - 3][col - 3] == num){
                      win = true;
                    }
                  }
                }
              }
          }
      }
  }
}
