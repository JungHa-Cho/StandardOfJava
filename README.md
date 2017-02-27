# StandardOfJava
- 모든 자료는, 출처 : 남궁성, 『 자바의 정석 3/E』, 도우출판(2016.1.27), 를 인용하였음을 알립니다.
- Java를 공부하며 실습 자료를 올리는 공간입니다.

## Java 일반
- [Java 기초 목차](https://github.com/JungHa-Cho/StandardOfJava/tree/master/Java) - 목차 study by wikidocs
- [CallByValue](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/common/Counter.java) - Call By Value
- [CallByReference](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/common/Counter2.java) - Call By Reference

## Chapter 7. Abstract
- 추상, 낱낱의 구체적 표상이나 개념에서 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 정신 작용
- 추상화와 구체화의 차이점
- [Implements] (https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter7/Implements.java) - 추상 메소드의 구현
- 구체화, 상속을 통해 클래스를 구현, 확장하는 작업
- [Abstract] (https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter7/Abstract.java) - 추상화 작업을 통한 부모 클래스 작성 ( [원형 클래스] (https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter7/Abstract.java), [추상화 작업 후] (https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter7/Abstract.java) )
- 추상화, 클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업
- 일반 메소드를 상속받아 @Override하는 것과 abstract로 @Override하는 것은 차이가 없다. 하지만 abstract로 선언해두면, 자손 클래스에서 abstract 메소드를 강제할 수 있다.

## Chapter 7. Interface

## 인터페이스
- 추상클래스를 부분적으로 완성된 미완성 설계도라 한다면, 인터페이스는 구현된 것은 아무 것도 없고 밑그림만 그려져 있는 기본 설계도라 할 수 있다.
- 그 자체로 사용되기 보다 다른 클래스를 작성하는데 도움 줄 목적으로 작성 된다.
- 인터페이스의 이름에는 주로 Eatable같이 ~를 할수 있다는 의미의 able를 주로 쓴다. 이 인터페이스를 구현하면 먹을 수 있다. 처럼 인터페이스를 상속한 클래스 John은 먹을 수 있다. 처럼 먹는 메소드를 제공한다는 것을 강조하기 위함이다.
- 오버라이딩 할 때는 조상의 메서드보다 넓은 범위의 접근 제어자를 지정해야 한다. 인터페이스 내 메소드는 public abstract를 생략하고 있기 때문이다.

-### 인터페이스의 특징, 일반적인 클래스와 달리 인터페이스의 멤버들은 다음과 같은 제약사항이 있다.
- 인터페이스는 static 상수만 정의할 수 있다.
- 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
- 모든 메서드는 public abstract 이어야 하며 이를 생략할 수 있다.
- 단, static 메서드와 디폴트 메서드는 예외 JDK 1.8 부터 변경

### 인터페이스를 이용한 다중 상속
- 두 조상으로부터 같은 이름의 메소드를 상속 받을떄 멤버 변수 이름이 같거나 메소드 이름이 같으면 자손 클래스는 어느 조상의 멤버를 상속 받아야 될지 모른다.
- 다중 상속의 장점보다 이러한 단점이 더 크다고 판단한 Java는 다중상속을 허용하지 않는다.
- 하지만, 자바도 인터페이스를 이용해 다중 상속이 가능하다. 라는 사실 때문에 인터페이스는 다중 상속을 위한 것이라고 오해를 사는 것 일뿐 자바에서 인터페이스로 다중상속을 구현하는 경우는 거의 없다.

### Chapter 12. Enum
- [AbstractEnum](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter12/AbstractEnum.java) - Abstract Enum

### Chapter 13. Thread
- [쓰레드 구현](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter13/ThreadExample1.java) - 쓰레드를 구현하는 두가지 방법 p.724
- [StampedLock](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter13/ThreadExample2.java) - JDK 1.8부터 지원하는 StampedLock
- [ReentrantLock](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter13/ThreadWaitExample1.java) - ReentrantLock과 Condition으로 구분하는 Pool
