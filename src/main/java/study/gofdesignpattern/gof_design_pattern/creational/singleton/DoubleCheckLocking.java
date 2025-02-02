package study.gofdesignpattern.gof_design_pattern.creational.singleton;

/*
* Double Check Locking 방식
*
* 특징
* volatile 키워드 사용으로, JVM의 명령 재정렬 문제 방지
* synchronized를 최소화하여 성능 개선
* 가장 권장되는 멀티스레드 환경에서의 Lazy Initialization 방식
* */
public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking instance;

    private DoubleCheckLocking() {
    }

    public static DoubleCheckLocking getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLocking.class){
                if(instance==null){
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
