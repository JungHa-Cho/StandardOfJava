# 변수, 파이썬에서 변수는 객체를 가르킨다
a = 3
# a는 3이라는 정수형 객체를 가리키는 Reference다
# a --> 3
print(type(3))

# a도 b도 똑같은 3을 가르킨다
a = 3 # a는 3이라는 정수형 객체가 생성되면서 그 메모리 주소를 가리킨다.
b = 3 # b는 동일한 객체인 3을 가리킨다.

# 3이라는 정수형 객체의 메모리 주소를 담고있는 변수가 2개가 됐다
# a와 b
# 따라서 동일한 객체를 가리키는지 판단하는 is함수로 확인했을때
print(a is b)
# true를 리턴한다.
# 이를 Reference Count, 참조 개수가 2개라고 표현한다.
# 만약 c = 3이 추가되면 Reference Count, 참조개수는 3이다.

import sys
print(sys.getrefcount(3))
c = 3
print(sys.getrefcount(3))
d = 3
print(sys.getrefcount(3))
e = 3
print(sys.getrefcount(3))

# 변수를 만드는 여러가지 방법
a, b = ('python', 'life')
(a, b) = 'python', 'life'

#리스트 변수
[a, b] = ['python', 'life']

#괄호 생략
a = b = 'python'

#변수 변경
a = 3
b = 5
a, b = b, a # Swap
print(a, b)

# 메모리에 생성된 변수 없애기
# 3의 레퍼런스 카운트가 0이되는순간 3이라는 정수형 객체는 사라진다.
# 가비지 콜랙션, Garbage Collection
a = 3
b = 3
del(a)
del(b)

# 리스트 변수 복사시 유의점
# Call by Reference
a = [1, 2, 3]
b = a
a[1] = 4      # 같은 변수를 가르키는 레퍼런스기 때문에
print(a, b)

# 복사 방법들
# [:] 리스트 전체를 가리키는 [:]이용해 복사
a = [1, 2, 3]
b = a[:]
a[1] = 4
print(a, b)

# Copy 모듈 이용
#from copy import copy
#b = copy a