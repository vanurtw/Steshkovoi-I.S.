# 7 задание
def nat(n):
    if (n%4==0 and n%100!=0) or n%400==0:
        print("Да")
    else:
        print("Нет")
N=int(input("n="))
nat(N)