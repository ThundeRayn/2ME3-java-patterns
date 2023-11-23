public class Runner_A1 {
    public static void main(String[] arg){
        Board board = new Board();
        ConnectFour game = new ConnectFour(board);
        game.setPlayer1(new HumanPlayer('R', board, "Alice"));
        game.setPlayer2(new AIPlayer('B', board, "Bob"));
        game.playGame();

    }
}
