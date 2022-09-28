# 5 задание
def min(x,y,c):
    if x<=y and x<=c:
        print(f"Минимальное число: {x}")
    elif y<=x and y<=c:
        print(f"Минимальное число: {y}")
    else:
        print(f"Минимальное число: {c}")
a=int(input("a="))
b=int(input("b="))
c=int(input("c="))
min(a,b,c)