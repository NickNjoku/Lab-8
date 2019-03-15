import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class BoardGame {
	
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocation;
	
	
	public BoardGame()
	{
		this.playerPieces =  new LinkedHashMap<String, GamePiece>();
		this.playerLocation = new LinkedHashMap<String, Location>();
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
	
	public GamePiece getPlayerGamePiece(String name)
	{
		return playerPieces.get(name);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		for(Entry<String, GamePiece> n : playerPieces.entrySet())
		{
			if(n.getValue().equals(gamePiece))
			{
				return n.getKey();
			}
			
		}
		
		return null;
		
	}
	
	
	
	

}
