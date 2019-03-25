import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

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
	
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocation.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String [] playerNames, Location[] newLocations)
	{
		ArrayList <GamePiece> p = new ArrayList <GamePiece>();
		for(GamePiece g : playerPieces.values())
		{
			p.add(g);
			
		}
		
		if(p.get(0).movesFirst(p.get(0), p.get(1)).equals(p.get(0)))
		{
			playerNames[0] = getPlayerWithGamePiece(p.get(0));
			playerNames[1] = getPlayerWithGamePiece(p.get(1));
			movePlayer(playerNames[0], newLocations[0]);
			movePlayer(playerNames[1], newLocations[1]);
			
		}
		else
		{
			playerNames[0] = getPlayerWithGamePiece(p.get(1));
			playerNames[1] = getPlayerWithGamePiece(p.get(0));
			Location temp = newLocations[0];
			newLocations[0] = newLocations[1];
			newLocations[1] = temp;
			
			movePlayer(playerNames[0], newLocations[0]);
			movePlayer(playerNames[1], newLocations[1]);
		}
		
		return playerNames;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocation.get(player);
		
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList <String> piece = new ArrayList<String>();
		
		for(Entry<String, Location> n : playerLocation.entrySet())
		{
			if(n.getValue().equals(loc))
			{
				piece.add(n.getKey());
			}
		}
		
		return piece;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList <GamePiece> piece = new ArrayList<GamePiece>();
		
		for(Entry<String, Location> n : playerLocation.entrySet())
		{
			if(n.getValue().equals(loc))
			{
				piece.add(getPlayerGamePiece(n.getKey()));
			}
		}
		
		return piece;
	}
	
	public Set<String> getPlayers()
	{
		Set <String> players = new HashSet <String>();
		for(Entry<String, GamePiece> n : playerPieces.entrySet())
		{
			players.add(n.getKey());
		}
		
		return players;
	}
	
	public Set<Location> getPlayerLocation()
	{
		
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		
	}
	
	
	

}
