import java.util.LinkedHashMap;

public class BoardGame {
	
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocation;
	
	
	public BoardGame()
	{
		
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if(!(playerPieces.containsKey(playerName)))
		{
			playerPieces.put(playerName, gamePiece);
			playerLocation.put(playerName, initialLocation);
			
			return true;
		}
		
		else
		{
			return false;
		}
		
		
	}
	
	

}
