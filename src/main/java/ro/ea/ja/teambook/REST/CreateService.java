package ro.ea.ja.teambook.REST;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import ro.ea.ja.teambook.domain.Player;

public class CreateService
{

	private static Client client;
	private static WebResource wr;
	private static ClientResponse clientResponse;

	static
	{
		client = Client.create();
	}

	public static Player createPlayer(Player player)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team");
		clientResponse = wr.type("application/json").put(ClientResponse.class, player);

		return clientResponse.getEntity(Player.class);
	}
	
	public static boolean approvePlayerActivity(String id){
		
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}

}
