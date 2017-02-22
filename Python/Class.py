# Why Need Class?
# C언어 처럼 절차 지향 언어로도 얼마든지 프로그램 만들수 있다.
# 왜 굳이 클래스?

class Calculator:
    def __init__(self):
        self.result = 0

    def adder (self, num):
        self.result += num
        return self.result

cal1 = Calculator()
cal2 = Calculator()

print(cal1.adder(3))
print(cal1.adder(4))
print(cal2.adder(3))
print(cal2.adder(7))


# 클래스 함수
class Service:
    secret = "영구는 배꼽이 두 개다" # 유용한 정보
    def SetName(self, name):
        self.name = name
    def sum(self, a, b):
        result = a + b
        print("%s + %s = %s입니다." % ( a, b, result))

pey = Service()
pey.sum(1, 1)
pey.SetName("홍길동")

#__init__함수
class Setvice_:
    secret = "영구는 바보다"
    def __init__(self, name):
        self.name = name
    def sum(self, a, b):
        result = a + b
# 객체를 만들때 실행하는 생성자 __init__

# 빈 클래스
class Calcul:
    pass
