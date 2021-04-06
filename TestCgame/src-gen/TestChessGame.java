public class TestChessGame {
	public static void main (){
		ChessGameFrame cg = new ChessGameFrame();
		
		ChessGame c = new ChessGame(cg) {
			@Override
			public void run() {
				createField{
					width = 10;
					height = 10;
				}
				
				
			}
		};
		
		c.run();
		
    }
}
