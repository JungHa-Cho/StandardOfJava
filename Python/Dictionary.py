# Dictionary = Hash, (Key, Value)
dic = {'name':'pey', 'phone':'0119993323', 'birth':'921118'}
ex0 = {1: 'hi'}
ex1 = {'a': [1,2,3]}

#딕셔너리 쌍 추가하기
#딕셔너리는 순서를 따지지 않는다.
a = {1: 'a'}
a[2] = 'b'
print(a)
a['name'] = 'pey'
print(a)
a[3] = [1,2,3]
print(a)

#요소 삭제
del a[1]
print(a)

#Key List 얻기
print(list(a.keys()))

#Value List 얻기
print(list(a.values()))

#딕셔너리 반복문
for k in a.keys():
    print(k)

#is?
print('pey' in a)
