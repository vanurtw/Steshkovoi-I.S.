def c(n):
    i = 0
    while 2 ** i <= n:
        i += 1
    print((i - 1), 2 ** (i - 1))
n1=int(input())
c(n1)