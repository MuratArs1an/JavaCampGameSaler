package concrete;

import Entities.User;
import interfaces.UserCheckService;
import interfaces.UserServices;

public class UserManager implements UserServices{
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.loginControl(user)) {
			System.out.println("Save to db : "+user.getFirstName());
		}else {
			System.out.println("Not a Valid Person");
		}
		
	}

	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+ " silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" guncellendi");
		
	}

}
