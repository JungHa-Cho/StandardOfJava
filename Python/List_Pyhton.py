#리스트의 종류
a = [ ]
b = [1, 2, 3]
c = ['Life', 'is', 'too', 'short']
d = [1, 2, 'Life', 'is']
e = [1, 2, ['Life', 'is']]
print(b[0] + b[2])
print(b[-1])

#리스트 인덱싱
aa = [1, 2, 3, ['a', 'b', 'c']]
print(aa[0])
print(aa[-1])
print(aa[3])
print(aa[-1][0])

#리스트 슬라이싱
bb = [1, 2, ['a', 'b', ['Life', 'Is']]]
print(bb[2][2][0])
print(bb[0:2])

# List 연산자
a = [1, 2, 3]
b = [4, 5, 6]
print(a + b)

#List 반복자
a = [1, 2, 3]
print(a * 3)

#List 값 수정
a = [1, 2, 3]
a[2] = 4
print(a)

#List 연속된 범위 값 수정
#요소를 바꾸는 것과 리스트 자체를 바꾸는 것 헷갈리지 말길
print(a[1:2])
a[1:2] = ['a', 'b', 'c']
print(a)

#[]로 리스트 요소 삭제
a[1:3] = []
print(a)

#del 함수로 리스트 요소 삭제
del a[1]
print(a)

#리스트에 요소 추가 append
a = [1, 2, 3]
a.append(4)
print(a)

#정렬
a = [1, 4, 3, 2]
a.sort()
print(a)
a = ['a', 'c', 'b']
a.sort()
print(a)
a.reverse()
print(a)
print(a.index('c'))
a.insert(0, 4)
print(a)
