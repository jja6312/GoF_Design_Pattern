package study.gofdesignpattern.gof_design_pattern.creational.factoryMethod;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

