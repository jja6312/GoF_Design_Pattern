package study.gofdesignpattern.gof_design_pattern.creational.singleton;


/*
* Lazy Initialization(지연 초기화)
*
* 특징
* 필요할 때 인스턴스를 생성하여, 메모리 낭비가 적음.
* 멀티 스레드 환경에서 안전하지 않을 수 있음
* 싱글톤이 보장되지 않을 수 있음
* */
public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance(){
        if(instance==null){
            instance = new LazyInitialization();
        }
        return instance;
    }
}
