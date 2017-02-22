# 집합, Set의 특징?
# 중복을 허용하지 않는다.
# 순서가 없다(Unodered)
# != 리스트나 튜플은 순서가 있기 때문에 인덱싱 가능
s1 = set([1, 2, 3])
print(s1)
s2 = set("Hello")
print(s2)

#교집합, 합집합, 차집합 구하기
s1 = set([1, 2, 3, 4, 5, 6])
s2 = set([4, 5, 6, 7, 8, 9])

#교집합
print(s1 & s2)
print(s1.intersection(s2))

#합집합
print(s1 | s2)
print(s1.union(s2))

#차집합
print(s1 - s2)
print(s1.difference(s2))

#자료형 관련 함수
#추가
s1.add(4)
s1.update([5, 6, 7])
#제거
s1.remove(4)