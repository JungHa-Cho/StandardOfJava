package com.tistory.devshock.chapter12;

/** 각 열거형 상수가 추상 메서드 fare를 똑같이 구현헀다.
 *  다르게 구현 할 수도 있지만 **/
enum Transportation {
	BUS(100)		{ int fare (int distance) { return distance*BASIC_FARE; }},
	TRAIN(150)		{ int fare (int distance) { return distance*BASIC_FARE; }},
	SHIP(100)		{ int fare (int distance) { return distance*BASIC_FARE; }},
	AIRPLANE(300)	{ int fare (int distance) { return distance*BASIC_FARE; }};
	
	protected final int BASIC_FARE; // protected로 설정해야 각 상수에서 접근가능
	
	Transportation (int basicFare) { // private Transportation (int basicFare){
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() { return BASIC_FARE; }
	abstract int fare(int distance);
}

public class AbstractEnum {
	public static void main(String[] args){
		System.out.println("bus fare="+Transportation.BUS.fare(100));
		System.out.println("bus fare="+Transportation.TRAIN.fare(100));
		System.out.println("bus fare="+Transportation.SHIP.fare(100));
		System.out.println("bus fare="+Transportation.AIRPLANE.fare(100));
	}
}
