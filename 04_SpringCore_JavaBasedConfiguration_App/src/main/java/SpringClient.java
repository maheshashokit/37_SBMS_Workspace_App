import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.beans.MailServer;
import com.ashokit.beans.OracleDatabase;
import com.ashokit.beans.Student;
import com.ashokit.beans.Test;
import com.ashokit.beans.User;
import com.ashokit.config.SpringConfig;

public class SpringClient {
	
	public static void main(String[] args) {
		
		//creating the object for spring container and passing Java Based Configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//Requesting the Spring beans
		User user = context.getBean(User.class);
		System.out.println(user);
		User user1 = context.getBean(User.class);
		System.out.println(user1.hashCode());
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		Student student1 = context.getBean(Student.class);
		System.out.println(student1.hashCode());
		
		OracleDatabase od = context.getBean(OracleDatabase.class);
		System.out.println(od);
		
		MailServer mb = context.getBean(MailServer.class);
		System.out.println(mb);
		
		//Requesting bean which are defined in spring.xml
		Test tb = context.getBean(Test.class);
		System.out.println(tb);
	}
}