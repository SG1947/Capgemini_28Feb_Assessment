package DSA.corejava;

public class Driver {
public static void main(String[] args) {
	Platform pt=new Platform();
	pt.addUser(0, "Alexander");
	pt.addUser(1, "Isabella");
	pt.addUser(2, "Emma");
	pt.follow(1, 0);
	pt.post(0, "Hiking in the mountains");
	pt.follow(2, 0);
	pt.post(0, "Enjoying a beautiful day!");
	pt.unfollow(1, 0);
}
}
