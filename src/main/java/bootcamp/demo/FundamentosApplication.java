package bootcamp.demo;

import bootcamp.demo.bean.MyBean;
import bootcamp.demo.bean.MyBeanDependency;
import bootcamp.demo.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    private ComponentDependency componentDependency;
    private MyBean myBean;

    private MyBeanDependency myBeanDependency;

    public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanDependency myBeanDependency) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanDependency = myBeanDependency;
    }



    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        myBean.print();
        myBeanDependency.printWhitDependency();
    }
}
