package study.gofdesignpattern.gof_design_pattern.creational.factoryMethod;

// 팩토리 메서드를 포함하는 추상 클래스

public abstract class Creator {
    // 팩토리 메서드 (객체 생성 책임을 서브클래스에 위임)
    public abstract Product factoryMethod();

    // 템플릿 메서드(공통 로직)
    public void someOperation(){
        Product product = factoryMethod();
        product.use();
    }
}
