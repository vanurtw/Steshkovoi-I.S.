def c(f):
    a = [line.replace("\n", "").split() for line in f]
    f.close()
    m=4
    n=3
    k = int(input('Введите строку в которой элементы расположить в порядке возрастания: '))
    a[k-1].sort()
    for i in range(n):
        for j in range(m):
            print(a[i][j], end=' ')
        print()

    f1 = open('D:\\python(задания)\\10 пр\\Стешковой И.С._У-222_вывод(2).txt', 'w')
    f1.write(f'{a}')
f1=open('D:\\python(задания)\\10 пр\\Стешковой И.С._У-222_ввод.txt','r')
c(f1)


