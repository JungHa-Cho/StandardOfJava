# 전형적인 For문
test_list = ['one', 'two', 'three']
for i in test_list:
    print(i)

# 다양한 for문
a = [(1, 2), (3, 4), (5, 6)]
for (first, last) in a:
    print(first + last)

# marks
marks = [90, 25, 67, 45, 80]
number = 0

# 일반적인 이용법
for mark in marks:
    number = number + 1
    if mark >= 60:
        print("%d번 학생은 합격입니다." % number)
    else:
        print("%d번 학생은 불합격입니다." % number)

# continue
number = 0
for mark in marks:
    number = number + 1
    if mark < 60: continue
    print("%d번 학생 축하합니다. 합격입니다. " % number)

# range, 0부터 10미만의 숫자를 포함하는 range 객체를 만들어 준다.
a = range(10)
print(a)

# range를 이용한 for문
sum = 0
for i in range(1, 11):
    #print("%d = %d + %d" % sum % sum % i)
    sum = sum + i
print(sum)

# range, len 이용
marks = [90, 25, 67, 45, 80]
for number in range(len(marks)):
    if marks[number] < 60: continue
    print("%d번 학생 축하합니다. 합격입니다." % (number + 1))

#for와 range를 이용한 구구단
for i in range(2, 10):
    for j in range(1, 10):
        print(i * j, end=" ")
    print('')

# List안에 For문 포함하기
a = [1, 2, 3, 4]
result = []
for num in a:
    result.append(num * 3)
print(result)