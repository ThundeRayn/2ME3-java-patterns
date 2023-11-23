import java.util.Arrays;

public class Board {

	private final int NUM_OF_COLUMNS = 7;
	private final int NUM_OF_ROW = 6;
	private char[][] arr = new char[NUM_OF_ROW][NUM_OF_COLUMNS];
	private final char space= ' ';
	private final char buttom= '_';
	private Object[][] mustMoves = new Object[2][3];
	
	/* 
	 * The board object must contain the board state in some manner.
	 * You must decide how you will do this.
	 * 
	 * You may add addition private/public methods to this class is you wish.
	 * However, you should use best OO practices. That is, you should not expose
	 * how the board is being implemented to other classes. Specifically, the
	 * Player classes.
	 * 
	 * You may add private and public methods if you wish. In fact, to achieve
	 * what the assignment is asking, you'll have to
	 */
	
	public Board() {
		reset();
	}
	
	public void printBoard() {
		for(int i=0;i<NUM_OF_ROW;i++){
			for(int j=0;j<=NUM_OF_COLUMNS;j++){
				if(j<NUM_OF_COLUMNS){System.out.print("|"+arr[i][j]);}else{System.out.println("|");}
			}
		}
	}
	
	public boolean containsWin() {
		return horizaontalwin()||vertialwin()||diagonalRwin()||diagonalLwin();
	}
	
	public boolean isTie() {
		return !containsWin()&& isFull();
	}
	
	public void reset() {
		for (char[] row:arr){Arrays.fill(row,space);};
		Arrays.fill(arr[NUM_OF_ROW-1], buttom);
	}
	

	//-----------METHODS ADDED BY ME------------//
	//------TO INTERACT IN Player CLASS---------//
	public void MoveOnBoard(int coln, char symbol){
		int row = 0; //check which row to putin
		for(int i=NUM_OF_ROW-1;i>=0;i--){
			if(arr[i][coln-1]==space || arr[i][coln-1]==buttom){
				row = i;
				break;
			}
		}
		arr[row][coln-1] = symbol;
	}

	public boolean isValid(int coln){
		if(arr[0][coln-1]!=space){return false;} //check if column full
		return true;
	}

	public boolean mustMove(){
		return mustmoveH()||mustmoveV()||mustmoveDR()||mustmoveDL();
	}

	public Object[][] GetmustMoves(){
		return mustMoves;
	}


	//------TO CHECK IF CONTAINS WIN---------//
	private boolean horizaontalwin(){
		//if on the right is empty
        for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< (NUM_OF_COLUMNS - 3); j++){
				if (arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i][j+1] && arr[i][j] ==arr[i][j+2]&& arr[i][j] ==arr[i][j+3]){
					return true;
				}
			}
		}
		return false;
	}

	private boolean vertialwin(){
		for (int i = 0; i < (NUM_OF_ROW - 3); i++){
			for (int j = 0; j< NUM_OF_COLUMNS; j++){
				if (arr[i][j] != ' ' && arr[i][j] != '_'&& arr[i][j] ==arr[i+1][j]&& arr[i][j] ==arr[i+2][j]&& arr[i][j] ==arr[i+3][j]){return true;}
			}
		}
		return false;
	}

	private boolean diagonalRwin(){
		for (int i = (NUM_OF_ROW - 1); i >2; i--){
			for (int j = 0; j< 4; j++){
				if (arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-1][j+1]&& arr[i][j] ==arr[i-2][j+2]&& arr[i][j] ==arr[i-3][j+3]){return true;}
			}
		}
		return false;
	}

	private boolean diagonalLwin(){
		for (int i = NUM_OF_ROW - 1; i >2; i--){
			for (int j = NUM_OF_COLUMNS-1; j> 2; j--){
				if (arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-1][j-1]&& arr[i][j] ==arr[i-2][j-2]&& arr[i][j] ==arr[i-3][j-3]){return true;}
			}
		}
		return false;
	}

	//--------TO CHECK IF MUST MOVE----------//
	private boolean mustmoveH(){
		//situation1: AAA_
        for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< (NUM_OF_COLUMNS - 3); j++){
				if (arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i][j+1]&& arr[i][j] ==arr[i][j+2]&&(arr[i][j+3] == ' ' || arr[i][j+3] == '_')){
					addtoMustmoves(arr[i][j], i, j+3);
					return true;
				}
			}
		}
		//situation1: AA_A
        for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< (NUM_OF_COLUMNS - 3); j++){
				if (arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i][j+1]&& (arr[i][j+2] == ' ' || arr[i][j+2] == '_')&& arr[i][j] ==arr[i][j+3]){
					addtoMustmoves(arr[i][j], i, j+2);
					return true;
				}

			}
		}
		//situation3:A_AA
        for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< (NUM_OF_COLUMNS - 3); j++){
				if (arr[i][j] != ' ' && arr[i][j] != '_' && (arr[i][j+1] == ' ' ||arr[i][j+1] == '_')&& arr[i][j] ==arr[i][j+2]&&arr[i][j] ==arr[i][j+3]){
					addtoMustmoves(arr[i][j], i, j+1);
					return true;
				}

			}
		}
		//situation4:_AAA
        for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< (NUM_OF_COLUMNS - 3); j++){
				if ((arr[i][j] == ' ' || arr[i][j] == '_' )&& arr[i][j+1] != ' ' && arr[i][j+1] != '_' &&arr[i][j+1] ==arr[i][j+2]&& arr[i][j+1] ==arr[i][j+3]){
					addtoMustmoves(arr[i][j+1], i, j);
					return true;
				}

			}
		}

		return false;
	}

	private boolean mustmoveV(){
		//only situation 
		for (int i = 0; i < (NUM_OF_ROW - 3); i++){
			for (int j = 0; j< NUM_OF_COLUMNS; j++){
				if (arr[i][j] == ' ' && arr[i+1][j] != ' ' && arr[i+1][j] ==arr[i+2][j]&& arr[i+1][j] ==arr[i+3][j]){
					addtoMustmoves(arr[i+1][j], i, j);
					return true;
				}
			}
		}
		return false;
	}

	private boolean mustmoveDR(){
		//Check if win diagonally towards right- AAA_
		for (int i = 3; i < NUM_OF_ROW; i++){
			for (int j = 0; j < (NUM_OF_COLUMNS - 3); j++){
				if ( arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-1][j+1]&& arr[i][j] ==arr[i-2][j+2]&& arr[i-3][j+3] == ' '){
					addtoMustmoves(arr[i][j], i-3, j+3);
					return true;
				}
			}
		}
		//diagonally towards right- AA_A
		for (int i = 3; i < NUM_OF_ROW; i++){
			for (int j = 0; j < (NUM_OF_COLUMNS - 3); j++){
				if ( arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-1][j+1]&& arr[i][j] ==arr[i-3][j+3]&& arr[i-2][j+2] == ' '){
					addtoMustmoves(arr[i][j], i-2, j+2);
					return true;
				}
			}
		}
		//diagonally towards right - A_AA
		for (int i = 3; i < NUM_OF_ROW; i++){
			for (int j = 0; j < (NUM_OF_COLUMNS - 3); j++){
				if ( arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-2][j+2]&& arr[i][j] ==arr[i-3][j+3]&& arr[i-1][j+1] == ' '){
					addtoMustmoves(arr[i][j], i-1, j+1);
					return true;
				}
			}
		}
		//diagonally towards right - _AAA
		for (int i = 3; i < NUM_OF_ROW; i++){
			for (int j = 0; j < (NUM_OF_COLUMNS - 3); j++){
				if ( arr[i-1][j+1] != ' ' && arr[i-1][j+1] != '_' && arr[i-1][j+1] ==arr[i-2][j+2]&& arr[i-1][j+1] ==arr[i-3][j+3]&& (arr[i][j] == ' '||arr[i][j] == '_')){
					addtoMustmoves(arr[i-1][j+1], i, j);
					return true;
				}
			}
		}
		return false;
	}

	private boolean mustmoveDL(){
		//Check if wins diagonally towards left: AAA_
		for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< NUM_OF_COLUMNS; j++){
				if (i >=3 && j >=3 && arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-1][j-1]&& arr[i][j] ==arr[i-2][j-2]&& arr[i-3][j-3] == ' '){
					addtoMustmoves(arr[i][j], i-3, j-3);
					return true;
				}
			}
		}
		//Check if wins diagonally towards left: AA_A
		for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< NUM_OF_COLUMNS; j++){
				if (i >=3 && j >=3 && arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-1][j-1]&& arr[i][j] ==arr[i-3][j-3]&& arr[i-2][j-2] == ' '){
					addtoMustmoves(arr[i][j], i-2, j-2);
					return true;
				}
			}
		}
		//Check if wins diagonally towards left: A_AA
		for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< NUM_OF_COLUMNS; j++){
				if (i >=3 && j >=3 && arr[i][j] != ' ' && arr[i][j] != '_' && arr[i][j] ==arr[i-2][j-2]&& arr[i][j] ==arr[i-3][j-3]&& arr[i-1][j-1] == ' '){
					addtoMustmoves(arr[i][j], i-1, j-1);
					return true;
				}
			}
		}
		//Check if wins diagonally towards left: _AAA
		for (int i = 0; i < NUM_OF_ROW; i++){
			for (int j = 0; j< NUM_OF_COLUMNS; j++){
				if (i >=3 && j >=3 && arr[i-1][j-1] != ' ' && arr[i-1][j-1] != '_' && arr[i-1][j-1] ==arr[i-2][j-2]&& arr[i-1][j-1] ==arr[i-3][j-3]&& (arr[i][j] == ' '||arr[i][j] == '_')){
					addtoMustmoves(arr[i-1][j-1], i, j);
					return true;
				}
			}
		}
		return false;
	}

	private void addtoMustmoves(char symbol, int i, int j){
		if(mustMoves[0][0]== null||mustMoves[0][0]==(Object) symbol){
			mustMoves[0][0]=symbol;
			mustMoves[0][1]=i;
			mustMoves[0][2]=j;
		}
		if(mustMoves[0][0]!= null && mustMoves[0][0]!=(Object) symbol){
			mustMoves[1][0]=symbol;
			mustMoves[1][1]=i;
			mustMoves[1][2]=j;
		}
	}

	//------TO CHECK IF BOARD FULL---------//
	private boolean isFull(){
		for(char i:arr[0]){
			if(i==' '){return false;}
		}
		return true;
	}

}
