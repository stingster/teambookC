package ro.ea.ja.teambook.RoleAccessManager;

import java.util.List;

import ro.ea.ja.teambook.domain.Player;

public interface ReaderRole
{

	Player getPlayer(String email, String password);
	List<Player> getPlayers();
	List<Player> listPlayersByHealth();
	List<Player> listPlayersByTechnicalSkills();
	List<Player> listPlayersBySocialSkills();
	List<Player> listPlayersBySelfDevSkills();
	List<Player> listPlayersByAllSkills();
	
}
