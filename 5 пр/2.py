def c(n):
    i = 2
    while i <= n:
        if n % i == 0:
            print('дeлитель =', i)
            break
        i += 1
n1=int(input())
c(n1)
