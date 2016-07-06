package accessRolesManager;

import java.util.GregorianCalendar;
import java.util.List;

import domain.Category;

public interface UpdaterRole extends ReaderRole
{

	boolean updatePicture(String id, byte[] picture);
	boolean updateFirstName(String id, String firstName);
	boolean updateLastName(String id, String lastName);
	boolean updateBirthday(String id, GregorianCalendar birthday);
	boolean updateDepartment(String id, String department);
	boolean updatePosition(String id, String position);
	boolean updateGender(String id, String gender);
	boolean updateCategories(String id, List<Category> categories);

}
