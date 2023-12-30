
public class Role {
	
	public Role() {
		System.out.println("Role Class Constructor....");
	}
	
	// Business method
	public String getRoleByUserId(String userId) {
		// We can write logic to get the Role of its user from DB.
		return "HRADMIN";
	}
}
