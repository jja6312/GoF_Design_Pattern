package study.gofdesignpattern.gof_design_pattern.creational.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class EagerInitializationTest {

    @DisplayName("싱글톤 테스트")
    @Test
    void 싱글톤테스트() {
        //given
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = EagerInitialization.getInstance();

        //then
        assertThat(instance1)
                .isNotNull()
                .isSameAs(instance2)
                .isInstanceOf(EagerInitialization.class);
    }

    @DisplayName("리플렉션을 통해 새로운 인스턴스를 생성할 수 있어야함.")
    @Test
    void 리플렉션을통한인스턴스생성가능테스트() {

        // given
        EagerInitialization instance1 = EagerInitialization.getInstance();

        // when
        EagerInitialization instance2 = assertDoesNotThrow(()->{
            var constructor = EagerInitialization.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        });

        // then
        assertThat(instance1)
                .isNotNull()
                .isNotSameAs(instance2)
                .isInstanceOf(EagerInitialization.class);
    }
}