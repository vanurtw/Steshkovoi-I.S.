# 8 задание
def soot(a,b,c):
    if a==b and a==c :
        print("3")
    elif a==b or a==c or b==c:
        print("2")
    else:
        print("0")
A=int(input("a="))
B=int(input("b="))
C=int(input("c="))
soot(A,B,C)