package DSA.corejava;

import java.util.HashMap;

public class Platform {
HashMap<Integer, User>users;
Platform(){
    users=new HashMap<>();
}
public void addUser(int id , String name) {
	users.put(id, new User(name));
	System.out.println(name+" added successfully");
}
public void follow(int followerId,int followeeId) {
	User follower=users.get(followerId);
	User followee=users.get(followeeId);
	System.out.println(follower.getName() +" is now following "+followee.getName());
}
public void unfollow(int followerId,int followeeId) {
	User follower=users.get(followerId);
	User followee=users.get(followeeId);
	System.out.println(follower.getName() +" has unfollowed "+followee.getName());
}
public void post(int userId,String content) {
	User user=users.get(userId);
	user.post(content);
}
}
