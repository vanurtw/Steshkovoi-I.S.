def c(n):
    total = 0
    while n != 0:
        n1 = int(input())
        if n1 == n:
            total += 1
        n = n1
    print(total)
n1=int(input())
c(n1)
