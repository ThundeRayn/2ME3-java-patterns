import java.util.Scanner;

public class HumanPlayer extends Player{
    private Scanner reader = new Scanner(System.in);

    public HumanPlayer(char symbol, Board board, String name) {
        super(symbol, board, name);
    }

    @Override
    public void makeMove(Board board) {
        System.out.print(this.name + ", please input your move:");
        int i = reader.nextInt();
        //check if is valid input
        if(board.isValid(i)==false){
            System.out.println("This is an unvalid input.");
            makeMove(board);
        }else{board.MoveOnBoard(i, symbol);}
    }


}
