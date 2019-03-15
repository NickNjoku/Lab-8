
public class Driver {

	public static void main(String[] args) {
		
		
		
		GamePieceAppearance c = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		
		GamePiece a = GamePiece.RED_RACER;
		GamePiece b = GamePiece.RED_RACER;
		
		System.out.println(a.toString());
		
		BoardGame n = new BoardGame();
		
		n.addPlayer("Nick", a, Location.BALLROOM);
		
		System.out.println(n.getPlayerWithGamePiece(a));
		
		System.out.println(n.addPlayer("Nick", b, Location.BALLROOM));

	}

}
