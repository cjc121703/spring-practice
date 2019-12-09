package Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args){
        //load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
