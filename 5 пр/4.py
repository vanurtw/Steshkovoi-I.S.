x=int(input())
y=int(input())
score=0
while x<=y:
    x=x+(x*0.1)
    score+=1
print(score)
