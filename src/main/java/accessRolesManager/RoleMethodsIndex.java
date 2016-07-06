package accessRolesManager;

import java.util.List;

import domain.InvalidRegexExpressionException;
import domain.Player;
import rest.ReadService;

public class RoleMethodsIndex implements EraserRole
{

	@Override
	public void update()
	{
		System.out.println("Update.");
		
	}

	@Override
	public void create()
	{
		System.out.println("Create.");
		
		
	}



	@Override
	public void delete()
	{
		System.out.println("Delete.");
		
	}

	
	// !READ! METHODS
	
	@Override
	public Player getPlayer(String email, String password)
	{
		try
		{
			return ReadService.getPlayer(email, password);
		}
		catch (InvalidRegexExpressionException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public List<Player> getPlayers()
	{
		return ReadService.getPlayers();
	}

	@Override
	public List<Player> listPlayersByHealth()
	{
		return ReadService.listPlayersByHealth();
	}

	@Override
	public List<Player> listPlayersByTechnicalSkills()
	{
		return ReadService.listPlayersByTechnicalSkills();
	}

	@Override
	public List<Player> listPlayersBySocialSkills()
	{
		return ReadService.listPlayersBySocialSkills();
	}

	@Override
	public List<Player> listPlayersBySelfDevSkills()
	{
		return ReadService.listPlayersBySelfDevSkills();
	}

	@Override
	public List<Player> listPlayersByAllSkills()
	{
		return ReadService.listPlayersByAllSkills();
	}

}
