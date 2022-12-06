def c(a, b):
    if a < b:
        for i in range(a, b + 1):
            print(i)
    else:
        for i in range(a, b - 1, -1):
            print(i)
a1= int(input())
b1=int(input())
c(a1, b1)
