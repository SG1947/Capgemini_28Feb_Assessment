package Week2.hasa;

import java.util.List;

public class Company{
	long companyId;
	String companyName;
	long numberOfEmployees;
	String companyEmail;
	long companyPhoneNumber;
}

public class Room{
	long roomId;
}

public class Workspace{
	long workspaceId;
	Company company;
	List<Room>rooms;
}

public class Floor{
	long floorId;
	List<Workspace>workspaces;
}
public class Address{
	String address;
}
public class Building{
	long buildingId;
	String buildingName;
	String Area;
	Address address;
	List<Floor>floors;
}
public class CoworkSpace{
	long Id;
	String Name;
	String City;
	Address address;
	List<Building>buildings;
}
