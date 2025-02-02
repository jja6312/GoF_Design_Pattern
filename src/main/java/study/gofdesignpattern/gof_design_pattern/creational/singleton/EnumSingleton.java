package study.gofdesignpattern.gof_design_pattern.creational.singleton;

/*
* 특징
* JVM이 보장하는 싱글톤이므로, 멀티 스레드 환경에서 100% 안전함.
* 리플렉션 공격 및 직렬화 문제를 방지할 수 있음
* 가장 안전하지만, Enum을 싱글톤으로 사용하는 것이 익숙하지 않은 개발자들에게는 다소 낯설 수 있음.
* */
public enum EnumSingleton {
    INSTANCE;
}
