def c(x, y):
    score = 0
    while x <= y:
        x = x + (x * 0.1)
        score += 1
    print(score)
x1=int(input())
y1=int(input())
c(x1, y1)

