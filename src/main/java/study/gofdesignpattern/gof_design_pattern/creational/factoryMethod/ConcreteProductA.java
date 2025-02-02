package study.gofdesignpattern.gof_design_pattern.creational.factoryMethod;

public class ConcreteProductA implements Product{
    @Override
    public void use() {
        System.out.println("A 제품 사용");
    }
}
