def c(n):
    score = n
    total = 0
    while n != 0:
        n = int(input())
        score += n
        total += 1
    print(score / total)
n1=int(input())
c(n1)


