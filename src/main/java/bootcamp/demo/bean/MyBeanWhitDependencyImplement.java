package bootcamp.demo.bean;

public class MyBeanWhitDependencyImplement implements MyBeanDependency{

    private MyOperation myOperation;

    public MyBeanWhitDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWhitDependency() {
        int numero = myOperation.sum(1);
        System.out.println("Hola desde la implemetancion de un bean con dependencioa "+numero);
    }
}
