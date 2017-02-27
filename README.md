# StandardOfJava
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

## Chapter 12. Enum
- [AbstractEnum](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter12/AbstractEnum.java) - Abstract Enum

## Chapter 13. Thread
- [쓰레드 구현](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter13/ThreadExample1.java) - 쓰레드를 구현하는 두가지 방법 p.724
- [StampedLock](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter13/ThreadExample2.java) - JDK 1.8부터 지원하는 StampedLock
- [ReentrantLock](https://github.com/JungHa-Cho/StandardOfJava/blob/master/StandardOfJava/src/com/tistory/devshock/chapter13/ThreadWaitExample1.java) - ReentrantLock과 Condition으로 구분하는 Pool
