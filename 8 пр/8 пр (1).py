def c(n):
    a = n // 100
    b = (n // 10) % 10
    c = n % 10
    score = 0
    for i in range(100, n + 1):
        if str(a) in str(i) and str(b) in str(i) and str(c) in str(i):
            print(i)
            score += 1
    print('kol-vo schisel:', score)
n1=int(input('vvedi n= '))
c(n1)
