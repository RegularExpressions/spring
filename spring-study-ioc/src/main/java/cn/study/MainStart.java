package cn.study;

import cn.study.beans.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.study")
public class MainStart {

	public static void main(String[] args) {
		//
		ApplicationContext context = new AnnotationConfigApplicationContext(MainStart.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();
	}
}
