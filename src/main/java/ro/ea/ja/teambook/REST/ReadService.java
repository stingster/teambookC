package ro.ea.ja.teambook.REST;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import ro.ea.ja.teambook.domain.InvalidRegexExpressionException;
import ro.ea.ja.teambook.domain.Player;

public class ReadService
{
	private static Client client;
	private static WebResource wr;
	private static ClientResponse clientResponse;
	
	static
	{
		client = Client.create();		
	}
 
	public static Player getPlayer(String email, String password) throws InvalidRegexExpressionException{
		
		Player player = new Player();
		player.setEmail(email);
		player.setPassword(password);
		
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/");
		clientResponse = wr.type("application/json").put(ClientResponse.class, player);
		
		return clientResponse.getEntity(Player.class);
	}
	
	public static List<Player> getPlayers()
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/");
		List<Player> players = wr.get(new GenericType<List<Player>>(){});
		
		return players;
	}

	public static List<Player> listPlayersByHealth()
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/health");
		List<Player> players = wr.get(new GenericType<List<Player>>(){});
		
		return players;
	}

	public static List<Player> listPlayersByTechnicalSkills()
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/TechnicalSkills");
		List<Player> players = wr.get(new GenericType<List<Player>>(){});
		
		return players;
	}

	public static List<Player> listPlayersBySocialSkills()
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/SocialSkills");
		List<Player> players = wr.get(new GenericType<List<Player>>(){});
		
		return players;
	}

	public static List<Player> listPlayersBySelfDevSkills()
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/SelfDevSkills");
		List<Player> players = wr.get(new GenericType<List<Player>>(){});
		
		return players;
	}

	public static List<Player> listPlayersByAllSkills()
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/AllSkills");
		List<Player> players = wr.get(new GenericType<List<Player>>(){});
		
		return players;
	}

}
