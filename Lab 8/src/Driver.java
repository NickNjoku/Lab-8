
public class Driver {

	public static void main(String[] args) {
		
		
		
		GamePieceAppearance c = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		
		GamePiece a = GamePiece.RED_RACER;
		GamePiece b = GamePiece.BLUE_RACER;
		GamePiece d = GamePiece.RED_THIMBLE;
		
		//System.out.println(a.toString());
		
		BoardGame n = new BoardGame();
		
		n.addPlayer("Nick", a, Location.BALLROOM);
		
		//System.out.println(n.getPlayerWithGamePiece(a));
		
		n.addPlayer("Tom", b, Location.BALLROOM);
		
		//System.out.println(n.getPlayerGamePiece("Tom"));
		//System.out.println(n.getPlayerWithGamePiece(b));
		
		n.movePlayer("Nick", Location.BILLIARD_ROOM);
		n.movePlayer("Eric", Location.CONSERVATORY);
		
		
		//System.out.println(d.toString());
		//System.out.println(a.movesFirst(a, b));
		System.out.println(d.movesFirst(d, b));
		

	}

}
