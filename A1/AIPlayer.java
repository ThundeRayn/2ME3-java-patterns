import java.util.Random;

public class AIPlayer extends Player{

    private int win_col;
    private int block_col;

    public AIPlayer(char symbol, Board board, String name) {
        super(symbol, board, name);
    }

    @Override
    public void makeMove(Board board) {
        //if can't win or block, put random
        if(board.mustMove()==false){
            int i =generateNew();
            while(board.isValid(i)==false){i=generateNew();} //find a valid input
            board.MoveOnBoard(i, symbol);
            System.out.println(this.name + " put at "+ i);
        }
        
        if(board.mustMove()&& canwin()){
            System.out.println(" catch the chance! "+this.name +" put at "+ win_col);
            board.MoveOnBoard(win_col, symbol);
        }

        if(board.mustMove()&& canwin()==false &&shouldblock()){
            System.out.println(" No Way! "+this.name +" put at "+ block_col);
            board.MoveOnBoard(block_col, symbol);
        }

    }

    //can I add new methods here?
    private int generateNew(){
        Random rand = new Random();
        int i = rand.nextInt(7)+1;
        return i;
    }

    private boolean canwin(){
        for(Object[] i:board.GetmustMoves()){
            if(i[0]==(Object)this.symbol){
                win_col=(int) i[2] + 1;
                return true;
            }
        }
        return false;
    }

    private boolean shouldblock(){
        for(Object[] i:board.GetmustMoves()){
            if(i[0]!=null && i[0]!=(Object)this.symbol){
                block_col=(int) i[2] + 1;
                return true;
            }
        }
        return false;
    }
}
