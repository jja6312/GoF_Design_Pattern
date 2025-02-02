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

**싱글톤 패턴의 특징**
- 유일한 인스턴스
- 전역적 접근
- 메모리 절약

**싱글톤 패턴 예시**
- DB 커넥션 풀: DB연결 객체를 계속 생성하기 비효율적이기 때문
- 설정 클래스: 계속 동일한 설정을 유지해야하는 경우
- 로깅 시스템
- 캐싱 시스템: 캐싱된 데이터를 저장하는 객체는 중복 생성 없이 하나만 유지하는 것이 메모리 효율적.

