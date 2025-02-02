package study.gofdesignpattern.gof_design_pattern.creational.singleton;


/*
* BillPugh 싱글톤
*
* JVM의 클래스 로딩 방식을 이용한 우아한 싱글톤 보장.
* 해당 클래스가 로딩될 때 인스턴스가 로딩되지 않음.
* getInstance()가 호출될 때, 내부 클래스가 로딩되면서 인스턴스가 한 번만 생성 됨.
* synchronized를 사용하지 않기 때문에 성능이 뛰어나고, 멀티스레드 환경에서도 안전.
* 실무에서 가장 추천되는 방식.
* */
public class BillPughSingleton {
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }



}
