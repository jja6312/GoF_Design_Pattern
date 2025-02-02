package study.gofdesignpattern.gof_design_pattern.creational.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// (스프링에서 싱글톤으로 관리하는 방법 中 1)
// ** EagerInitialization에서 싱글톤으로 등록한 객체를 Bean으로 수동 등록 **

// 장점 : 특정 객체의 생성 과정을 제어하고 싶을 때 유용
// 사례 : Spring이 직접 생성하지 않는 외부라이브러리나, 기존 클래스를 Bean으로 등록할 때 사용.
@Configuration
public class SingletonConfiguration {
    @Bean // Bean : 메서드 단위에서 객체를 직접 생성해서, Spring Container에 등록하는 방식.
    public EagerInitialization eagerInitialization(){
        return EagerInitialization.getInstance();
    }
}
