def c(n):
    score = 0
    while n != 0:
        n = int(input())
        if n < 0:
            score += 1
    print(score)
n1=int(input())
c(n1)
