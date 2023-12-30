
public class User {
	
	// Has-A Relationship
	Role role = new Role();
	
	public User() {
		System.out.println("User Class Constructor....");
	}

	// Business method
	public void getUserRole(String userId) {
		// calling the Business Method of Role Class...
		String roleName = role.getRoleByUserId(userId);
		System.out.println("Role Checking:::::" + "HRADMIN".equals(roleName));
	}
}
