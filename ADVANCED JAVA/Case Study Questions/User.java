package DSA.corejava;

import java.util.ArrayList;

public class User{
	private String userName;
	private ArrayList<User>followers;
	User(String userName){
		this.userName=userName;
		this.followers=new ArrayList<>();
	}
	public String getName() {
		return userName;
	}
	public void update(String message,User followee) {
		System.out.println(this.userName + " received notifiation:"+followee.getName()+" posted:" +message);
	}
	public void addFollowers(User user) {
		followers.add(user);
	}
    public void removeFollowers(User user) {
		followers.remove(user);
	}
    public void notifyFollowers(String message) {
    	for (User follower : followers) {
            follower.update(message, this);
        }
	}
    public void post(String content) {
		System.out.println(this.userName+" posted "+content);
		notifyFollowers(content);
	}
    public void follow(User user) {
		user.addFollowers(this);
	}
    public void unfollow(User user) {
		user.removeFollowers(this);
	}
    
}
