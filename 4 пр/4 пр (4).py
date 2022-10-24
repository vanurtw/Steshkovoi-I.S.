n=int(input('введи кол-во переменных:'))
s=0
for i in range(n):
    c=int(input(f'{i+1}='))
    s=s+c
print(f'сумма чисел ={s}')