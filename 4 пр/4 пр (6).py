def fac(n):
    score=1
    for i in range(1, n+1):
        score*=i
    return score
n1=int(input())
c=0
for i in range(1, n1+1):
    c+=fac(i)
print(c)