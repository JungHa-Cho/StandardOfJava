# File
f = open("C:/Users/nano_planning/Desktop/out2.txt", 'w')
f.close()

# write file
f = open("C:/Users/nano_planning/Desktop/out2.txt", 'w')
for i in range(1, 11):
    data = "%d번재 줄입니다. \n" % i
    f.write(data)
f.close()

# 프로그램 외부 저장 파일 읽는 여러가지 방법들

#readline ( 한줄씩 )
f = open("C:/Users/nano_planning/Desktop/out2.txt", 'r')
while True:
    line = f.readline()
    if not line: break  # 더이상 읽을게 없을때 None 출력
    print(line)
f.close()

# readlines 함수 이용하기
# 모든 라인을 읽고 나서 각각의 줄을 요소로 갖는 리스트를 반환
f = open("C:/Users/nano_planning/Desktop/out2.txt", 'r')
lines = f.readlines()
for line in lines:
    print(line)
f.close()

# read() 함수
# 파일 내용 전채를 문자열로 리턴
f = open("C:/Users/nano_planning/Desktop/out2.txt", 'r')
data = f.read()
print(data)
f.close()

# 쓰기 모드로 열었을때 이미 존재하는 파일일 경우 w로 열면
# 있던 내용이 모두 사라진다
# 추가하려면 'a'모드로 열기
f = open("C:/Users/nano_planning/Desktop/out2.txt", 'a')
for i in range(11, 20):
    data = "%d번째 줄입니다.\n" % i
    f.write(data)
f.close()

# file opne, close 자동 구문 with
with open("C:/Users/nano_planning/Desktop/out2.txt", "w") as f:
    f.write("Life is to short, you need python")
# 위와 같이 with 키워드를 쓰면 with 구문을 벗어나는 순간
# 열린 파일 객체 f가 자동으로 Close