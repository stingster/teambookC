package rest;

import java.util.GregorianCalendar;
import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import domain.Category;

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
		return false;
	}

	public static boolean updateFirstName(String id, String firstName)
	{
		return false;
	}


	public static boolean updateLastName(String id, String lastName)
	{
		return false;
	}


	public static boolean updateBirthday(String id, GregorianCalendar birthday)
	{
		return false;
	}


	public static boolean updateDepartment(String id, String department)
	{
		return false;
	}


	public static boolean updatePosition(String id, String position)
	{
		return false;
	}


	public static boolean updateGender(String id, String gender)
	{
		return false;
	}


	public static boolean updateCategories(String id, List<Category> categories)
	{
		return false;
	}

	
	
}
