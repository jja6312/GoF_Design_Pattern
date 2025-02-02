package study.gofdesignpattern.gof_design_pattern.creational.singleton;

/*
* Thread-Safe Lazy Initialization(스레드-안전 지연 초기화)
*
* 특징
* 멀티스레드 환경에서도 안전하게 동작
* synchronized를 통해 성능 저하(메서드 전체가 동기화됨)
*/

public class ThreadSafeLazyInitialization {
    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization() {
    }

    public synchronized ThreadSafeLazyInitialization getInstance(){
        if(instance==null){
            instance = new ThreadSafeLazyInitialization();
        }
        return instance;
    }
}
