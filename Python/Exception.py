# 파일 없다
f = open("나없는파일", 'r')

# Zero Division, 0나누기 에러
a = 4/0

# Index 에러
a = [1, 2, 3,]
a[4]

# try 사용법
try:
    4 / 0
except ZeroDivisionError:
    print("에러")

try:
    4 / 0
except ZeroDivisionError as e:
    print(e)

# try문의 else
try:
    f = open('foo.txt', 'r')
except FileNotFoundError as e:
    print(str(e))
else:
    data = f.read()
    f.close(())

try:
    a = [1, 2]
    print(a[3])
    4/0
except ZeroDivisionError:
    print("0으로 나눌 수 없습니다.")
except IndexError:
    print("인덱싱 할 수 없습니다.")

# 함께 처리
try:
    a = [1, 2]
    print(a[3])
    4/0
except(ZeroDivisionError, IndexError) as e:
    print(e)

#오류 일부러 발생
class Bird:
    def fly(self):
        raise NotImplementedvbg