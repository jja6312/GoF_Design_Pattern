package study.gofdesignpattern.gof_design_pattern.creational.factoryMethod;

public class ConcreteCreatorB extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConCreteProductB();
    }
}
