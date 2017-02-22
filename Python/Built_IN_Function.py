# 내장함수

# 절대값
print(abs(3))
print(abs(-3))

# iterable ( 반복형 ), 반복가능한 자료형 ( 리스트, 튜플 문자열, 딕셔너리 집합)
print(all([1, 2, 3]))
print(all([1, 2, 3, 0]))

# any = X 중 하나라도 참이 있을 경우 True
print(any([1, 2, 3, 0]))
print(any([0, ""]))

# chr 아스키 코드를 입력받아 문자 출력
print(chr(97))
print(chr(48))

# dir은 객체가 자체적으로 가지고 있는 변수나 함수를 보여줌
print(dir([1, 2, 3]))
print(dir({'1':'a'}))

#divmod(a, b)는 2개의 숫자를 입력으로 받아 나눈 몫과 나머지를 튜플 형태로 리턴
print(divmod(7, 3))
print(divmod(1.3, 0.2))

#enumerate 열거형
for i, name in enumerate(['body', 'foo', 'bar']):
    print(i, name)

#eval ( expression ) 실행 가능한 문자열을 실행함
print(eval('1+2'))
print(eval("'hi' + 'a'"))
print(eval('divmod(4, 3)'))

# filter
def positive(l):
    result = []
    for i in l:
        if i > 0:
            result.append(i)
    return result

print(positive([1, -3, 2, 0, -5, 6]))

# if filter
def positive(x):
    return x > 0
print(list(filter(positive, [1, -3, 2, 0, -5, 6])))

# hex
print(hex(234))
print(hex(3))

# id 고유 주소값 (reference)
a = 3
print(id(3))
print(id(a))

# input
#print(input("Enter : "))

# int
print(int('3'))
print(int(3.4))

# is instance(Object, Class)
class Person: pass
a = Person()
print(isinstance(a, Person))

# lambda
# def와 동일한 역할이나 함수를 한줄로 간결하게 만들때 사용
sum = lambda a, b: a + b
print(sum(3, 4))

myList = [lambda a, b : a + b, lambda a, b : a * b]
print(myList)
print(myList[0](3, 4))
print(myList[1](3, 4))

# length
print(len("python"))
print(len([1, 2, 3]))
print(len((1, 'a')))

# list는 반복가능한 자료형 s를 입력받아 리스트로 만들어 리턴
print(list("python"))
print(list((1, 2, 3)))

# map(f, iterable)은 함수(f)와 반복 가능한 자료형을 입력으로 받는다.
def two_times(numberList):
    result = [ ]
    for number in numberList:
        result.append(number * 2)
    return result

result = two_times([1, 2, 3, 4])
print(result)

def two_times(x): return x * 2
list(map(two_times, [1, 2, 3, 4]))

list(map(lambda a : a * 2, [1, 2, 3, 4]))

# max
print(max([1, 2, 3]))
print(max("python"))

# oct
print(oct(34))
print(oct(12345))

#ord
print(ord('a'))
print(ord('0'))

# pow
print(pow(2, 4))
print(pow(3, 3))

print(list(range(5)))
