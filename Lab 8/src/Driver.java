
public class Driver {

	public static void main(String[] args) {
		
		
		
		GamePieceAppearance c = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		
		GamePiece a = GamePiece.RED_RACER;
		GamePiece b = GamePiece.BLUE_RACER;
		GamePiece d = GamePiece.RED_THIMBLE;
		
		//System.out.println(a.toString());
		
		BoardGame n = new BoardGame();
		
		n.addPlayer("Nick", b, Location.BALLROOM);
		
		//System.out.println(n.getPlayerWithGamePiece(a));
		
		n.addPlayer("Tom", a, Location.BALLROOM);
		n.addPlayer("Eric", d, Location.HALL);
		
		//System.out.println(n.getPlayerGamePiece("Tom"));
		//System.out.println(n.getPlayerWithGamePiece(b));
		
		n.movePlayer("Nick", Location.BILLIARD_ROOM);
		//n.movePlayer("Eric", Location.CONSERVATORY);
		
		
		//System.out.println(d.toString());
		//System.out.println(a.movesFirst(a, b));
		//System.out.println(d.movesFirst(d, b));
		
		String[] playerNames = new String[2]; 
		Location[] newLocations = new Location[2];
		
		playerNames[0] = "Tom";
		playerNames[1] = "Nick";
		newLocations[0] = Location.HALL;
		newLocations[1] = Location.LOUNGE;
		n.moveTwoPlayers(playerNames, newLocations);
		
		
		//System.out.println(n.getPlayersLocation("Nick"));
		//System.out.println(n.getPlayersAtLocation(Location.HALL));
		//System.out.println(n.getGamePiecesAtLocation(Location.HALL));
		System.out.println(n.getPlayers());
		

	}

}
