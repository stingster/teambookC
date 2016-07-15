package ro.ea.ja.teambook.controller;

import java.util.GregorianCalendar;
import java.util.List;

import ro.ea.ja.teambook.REST.ReadService;
import ro.ea.ja.teambook.REST.UpdateService;
import ro.ea.ja.teambook.RoleAccessManager.EraserRole;
import ro.ea.ja.teambook.domain.Category;
import ro.ea.ja.teambook.domain.InvalidRegexExpressionException;
import ro.ea.ja.teambook.domain.Player;

public class Controller implements EraserRole
{

	@Override
	public void create()
	{
		// TODO Auto-generated method stub
		
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

	
	
	// !UPDATE! METHODS

	@Override
	public boolean updatePicture(String id, byte[] picture)
	{
		return UpdateService.updatePicture(id, picture);
	}

	@Override
	public boolean updateFirstName(String id, String firstName)
	{
		return UpdateService.updateFirstName(id, firstName);
	}

	@Override
	public boolean updateLastName(String id, String lastName)
	{
		return UpdateService.updateLastName(id, lastName);
	}


	@Override
	public boolean updateBirthday(String id, GregorianCalendar birthday)
	{
		return UpdateService.updateBirthday(id, birthday);
	}


	@Override
	public boolean updateDepartment(String id, String department)
	{
		return UpdateService.updateDepartment(id, department);
	}


	@Override
	public boolean updatePosition(String id, String position)
	{
		return UpdateService.updatePosition(id, position);
	}


	@Override
	public boolean updateGender(String id, String gender)
	{
		return UpdateService.updateGender(id, gender);
	}


	@Override
	public boolean updateCategories(String id, List<Category> categories)
	{
		return UpdateService.updateCategories(id, categories);
	}

}
