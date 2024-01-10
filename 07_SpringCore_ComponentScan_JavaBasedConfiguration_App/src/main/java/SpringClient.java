import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.config.ApplicationConfig;
import com.ashokit.controller.UserController;
import com.ashokit.helper.UserHelper;
import com.ashokit.service.CustomerService;
import com.ashokit.service.LoginService;
import com.ashokit.utils.DateUtils;

public class SpringClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		UserController ucBean = context.getBean(UserController.class);
		System.out.println(ucBean);
		UserHelper uhBean = context.getBean(UserHelper.class);
		System.out.println(uhBean);
		DateUtils duBean = context.getBean(DateUtils.class);
		System.out.println(duBean);
		CustomerService csBean = context.getBean(CustomerService.class);
		LoginService lsBean = context.getBean(LoginService.class);
		System.out.println(csBean);
		lsBean.displayData();
	}

}
