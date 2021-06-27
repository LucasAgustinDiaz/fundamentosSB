package bootcamp.demo.configuration;

import bootcamp.demo.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation(){
        return new MyBeanTwoImplement();
    }
    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanDependency beanOperationOperationWhitDependency(MyOperation myOperation){
        return new MyBeanWhitDependencyImplement(myOperation);
    }
}
