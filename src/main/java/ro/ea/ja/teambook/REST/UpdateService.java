package ro.ea.ja.teambook.REST;

import java.util.GregorianCalendar;
import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import ro.ea.ja.teambook.domain.Category;

public class UpdateService
{

	private static Client client;
	private static WebResource wr;
	private static ClientResponse clientResponse;

	static
	{
		client = Client.create();
	}

	public static boolean updatePicture(String id, byte[] picture)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, picture);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}

	public static boolean updateFirstName(String id, String firstName)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, firstName);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}


	public static boolean updateLastName(String id, String lastName)
	{	
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, lastName);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}

		return false;
	}


	public static boolean updateBirthday(String id, GregorianCalendar birthday)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, birthday);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}


	public static boolean updateDepartment(String id, String department)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, department);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}


	public static boolean updatePosition(String id, String position)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, position);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}


	public static boolean updateGender(String id, String gender)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, gender);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}

		return false;
	}


	public static boolean updateCategories(String id, List<Category> categories)
	{
		wr = client.resource("http://localhost:8080/MotivateRClient/teambook/team/" + id);
		clientResponse = wr.type("application/json").post(ClientResponse.class, categories);
		
		if(clientResponse.getStatus() == 200){
			return true;
		}
		
		return false;
	}	
	
}
