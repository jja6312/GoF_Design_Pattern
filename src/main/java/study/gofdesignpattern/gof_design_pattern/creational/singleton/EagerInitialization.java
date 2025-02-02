package study.gofdesignpattern.gof_design_pattern.creational.singleton;

/*
* Eager Initialization(즉시 초기화)
*
* 특징
* 가장 간단한 싱글톤 구현
* */
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {//생성자 직접 호출 불가능
    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
