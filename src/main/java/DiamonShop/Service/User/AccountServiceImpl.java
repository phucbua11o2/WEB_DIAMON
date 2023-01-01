package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.User.UsersDao;
import DiamonShop.Entity.Users;

@Service
public class AccountServiceImpl {
	@Autowired
	UsersDao usersDao = new UsersDao();
	public int AddAccount(Users users) {
		users.setPassword(BCrypt.hashpw( users.getPassword(), BCrypt.gensalt(12)));
		return usersDao.AddAccount(users);
	}
	public Users CheckAccount(Users users) {
		String pass = users.getPassword();
		users = usersDao.GetUserByACC(users);
		if(users!=null)
		{
			if(BCrypt.checkpw(pass, users.getPassword()))
			{
				return users;
			}
			else {
				return null;
			}
		}
		return null;
	}
}
