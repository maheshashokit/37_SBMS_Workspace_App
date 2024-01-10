import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.config.DatabaseConfig;
import com.ashokit.controller.EmployeeController;
import com.ashokit.dtos.EmployeeDetails;

public class SpringClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		
		//Prepared EmployeeDetails to insert the data
		EmployeeDetails ed = new EmployeeDetails();
		ed.setEmployeeId(896);
		ed.setName("Suresh");
		ed.setEmail("suresh.ashokit@gmail.com");
		ed.setCreatedBy("suresh");
		
		//Getting Controller Object
		EmployeeController ec = context.getBean(EmployeeController.class);
		
		//calling the method to create new employee
		//ec.addingNewEmployee(ed);
		
		System.out.println("================================================");
		ec.displayAllEmployees();
	}
}
