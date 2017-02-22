# elif
pocket = ['paper', 'cellphone']
card = 1
if 'money' in pocket:
    print("택시를 타고 가라")
elif card:
    print("택시를 타고 가라")
else:
    print("걸어 가라")

# 아무것도 하지 않고 싶을때 pass
pocket = ['paper', 'money', 'cellphone']
if 'money' in pocket:
    pass
else:
    print("카드를 꺼내라")

# 줄 절약
if __name__ == '__main__':
    if 'money' in pocket:
        pass
    else:
        print("카드를 꺼내라")
#이거를 이렇게 줄일수 있다
if 'money' in pocket: pass
else: print("카드를 꺼내라")