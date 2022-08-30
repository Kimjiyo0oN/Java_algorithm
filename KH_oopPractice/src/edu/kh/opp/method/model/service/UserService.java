package edu.kh.opp.method.model.service;

import edu.kh.opp.method.model.vo.User;

public class UserService {
	public User signUp(String userId, String userPW, String userName,
			int userAge, char userGender) {
		User u = new User();
		u.setUserId(userId);
		u.setUserPW(userPW);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		
		return u;
	}
	public int login(String id, String pw, User user) {
		if(user == null) {
			return -1;
		}else {
			if(user.getUserId().equals(id)&&user.getUserPW().equals(pw)) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	public void updateUser(String name, int age, char gender, User loginUser) {
		loginUser.setUserName(name);
		loginUser.setUserAge(age);
		loginUser.setUserAge(gender);
	}
}
