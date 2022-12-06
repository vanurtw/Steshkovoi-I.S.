def c(n):
    s = 0
    for i in range(n):
        c = int(input(f'{i + 1}='))
        s = s + c
    print(f'сумма чисел ={s}')
n1=int(input('введи кол-во переменных:'))
c(n1)