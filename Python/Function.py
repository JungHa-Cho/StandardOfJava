# 함수!
def sum(a, b):
    return a + b
a, b = 3, 4
c = sum(a, b)
print(c)

# 입력이 없는 함수
def say():
    return 'Hi'

# 리턴이 없는 함수
def sum(a, b):
    print("%d, %d의 합은 %d입니다." % (a, b, a + b))
sum(3, 4)

# None, sum은 return이 없다
a = sum(3, 4)
print(a)

# 입력이 몇개가 될지 모를때?
# 여러개의 입력값을 받는 함수
def sum_how_many(*args):
    sum = 0
    for i in args:
        sum = sum + i
    return sum

print(sum_how_many(1, 2, 3))
print(sum_how_many(1, 2, 3, 4, 5, 6, 7, 8, 9, 9))

# 입력인수! 모를때
def sum_mul(choice, *args):
    if choice == "sum":
        result = 0
        for i in args:
            result = result + i
    elif choice == "mul":
        result = 1
        for i in args:
            result = result * i
    return result

print(sum_mul('sum', 1, 2, 3, 4, 5, 6))
print(sum_mul('mul', 1, 2, 3, 4, 5, 6))

# 리턴값이 두개일때?
def sum_and_mul(a, b):
    return a + b, a * b
print(sum_and_mul(3, 4)) # 즉, 리턴이 두개일때 결과를 튜플로 반환한다

# 함수의 인수 초기값 미리 설정하기
def say_my_self(name, old, man = True):
    print("나의 이름은 %s 입니다." % name)
    print("나이는 %d살 입니다." % old)
    if man:
        print("남자입니다.")
    else:
        print("여자입니다.")
say_my_self("박응용", 27)
say_my_self("박응용", 27, True)
say_my_self("박응용", 27, False)

# 함수 안에서 선언된 변수는 Global 변수가 아니다.
a = 1
def vartest():
    global a
    a = a+1

vartest()
print(a)

#따라서 Global 키워드나 return을 이용해야 한다.