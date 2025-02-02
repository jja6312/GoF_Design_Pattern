# GoF_Design_Pattern

GoF 디자인 패턴 23가지를, 소프트웨어 아키텍처 설계 시 녹여내기 위해, 암기 목적으로 만든 레포지토리.

## 📂 GoF 디자인 패턴

### 📁 생성(Creational) 패턴
- 🏛️ **Singleton (싱글톤) - 1**
- 🏭 **Factory Method (팩토리 메서드) - 2**
- 🏠 **Builder (빌더) - 3**
- 🏗️ **Abstract Factory (추상 팩토리) - 12**
- 📝 **Prototype (프로토타입) - 17**

### 📁 구조(Structural) 패턴
- 🏗️ **Adapter (어댑터) - 4**
- 🎭 **Decorator (데코레이터) - 5**
- 📞 **Proxy (프록시) - 6**
- 🍽️ **Facade (퍼사드) - 7**
- 📦 **Composite (컴포지트) - 13**
- 🔗 **Bridge (브리지) - 18**
- 🏚️ **Flyweight (플라이웨이트) - 19**

### 📁 행동(Behavioral) 패턴
- 🎭 **Strategy (전략) - 8**
- 👮 **Observer (옵저버) - 9**
- 🧑‍💻 **Template Method (템플릿 메서드) - 10**
- 🧑‍🏫 **Command (커맨드) - 11**
- 🎮 **Chain of Responsibility (책임 연쇄) - 14**
- 🤝 **State (상태) - 15**
- 📜 **Iterator (반복자) - 16**
- 📑 **Mediator (미디에이터) - 20**
- 🔄 **Memento (메멘토) - 21**
- 📡 **Visitor (비지터) - 22**
- 📩 **Interpreter (인터프리터) - 23**

## 커밋 순서
1. **Singleton**
2. **Factory Method**
3. **Builder**
4. **Adapter**
5. **Decorator**
6. **Proxy**
7. **Facade**
8. **Strategy**
9. **Observer**
10. **Template Method**
11. **Command**
12. **Abstract Factory**
13. **Composite**
14. **Chain of Responsibility**
15. **State**
16. **Iterator**
17. **Prototype**
18. **Bridge**
19. **Flyweight**
20. **Mediator**
21. **Memento**
22. **Visitor**
23. **Interpreter**

---

### 1. 싱글톤
싱글톤 패턴은 애플리케이션에서 '하나의 클래스에 대해 단 하나의 인스턴스만 생성하도록 제한'하는 디자인 패턴이다.
즉, 하나의 객체만 유지하면서 이를 여러 곳에서 공유하는 방식이다.

** 싱글톤 패턴 **

1-1. 정의
- 클래스의 인스턴스를 애플리케이션 생명 주기 동안 단 한 번 생성하여, 전역적으로 공유하는 디자인 패턴.

1-2. 특징
- 정적 필드를 사용하여 하나의 인스턴스 유지
- 생성자를 private으로 막아서 외부에서 new 사용 불가.
- getInstance()를 통해 싱글톤 객체를 호출하여 사용한다.

1-3. 종류
1-3-1. Eager Initialization(즉시 초기화)
   | 애플리케이션이 시작될 때 미리 인스턴스를 생성
   ○ 장점
    - 스레드 안전(JVM이 클래스 로딩 시점에 인스턴스를 한 번만 생성함.)

   ○ 단점
    - 필요하지 않더라도 미리 만들어지므로, 리소스 낭비 가능성 존재.

1-3-2. Lazy Initialization(지연 초기화)
| 필요할 때만 인스턴스를 생성
○ 장점
- 필요할 때 인스턴스를 생성하여, 메모리 낭비가 적음.
○ 단점
- 멀티 스레드 환경에서 안전하지 않을 수 있음
- 싱글톤이 보장되지 않을 수 있음

1-3-3. Thread-Safe Lazy Initialization(스레드-안전 지연 초기화)
| synchronized 키워드를 사용하여 멀티스레드 환경에서도 안전.
○ 장점
- 멀티스레드 환경에서도 안전하게 동작
○ 단점
- synchronized를 통해 성능 저하(메서드 전체가 동기화됨)

1-3-4. Double Check Locking(이중 검사 잠금)
| synchronized를 최소화하여 성능을 개선한 방식
○ 장점
- 멀티스레드 환경에서 안전 + 성능 개선
○ 단점
- 코드가 조금 복잡함
- volatile 키워드를 지원하지 않는 구버전(JVM 1.4 이전)에서는 동작하지 않을 수 있음

1-3-5. Bill Pugh Singleton
| 정적 내부 클래스 방식으로 Lazy Initialization을 보장하면서도 성능을 높임
○ 장점
- 클래스가 로드될 때까지 인스턴스가 생성되지 않음(==Lazy Initialization)
- JVM 클래스 로딩 원리를 활용해 스레드 안정성 보장
- synchronized가 필요 없음(성능이 좋음)
○ 단점
- 코드 구조가 복잡할 수 있음

1-3-6. Enum Singleton
| 자바에서 싱글톤을 구현하는 가장 간단하고 안전한 방법.
| enum은 JVM에서 단 한 번 로드되므로, 여러 개의 인스턴스가 생성될 위험이 없음
○ 장점
- 멀티스레드 환경에서도 안전
- 직렬화 & 리플렉션 공격에도 안전
- 코드가 가장 간단함
○ 단점
- Enum을 사용하기 때문에 상속 불가능
- 익숙하지 않은 개발자에게 생소할 수 있음


1-4. 결론. 언제 어떤 싱글톤을 사용해야 할까?
- 가장 간단하고 안전한 방법 => Enum Singleton
- 성능과 안전성을 동시에 원한다면? => Bill Pugh Singleton
- 이전 버전(JVM 1.4이전)을 고려해야한다면? => Thread-Safe Lazy


1-5. 싱글톤 패턴 예시
- DB 커넥션 풀: DB연결 객체를 계속 생성하기 비효율적이기 때문
- 설정 클래스: 계속 동일한 설정을 유지해야하는 경우
- 로깅 시스템
- 캐싱 시스템: 캐싱된 데이터를 저장하는 객체는 중복 생성 없이 하나만 유지하는 것이 메모리 효율적.


