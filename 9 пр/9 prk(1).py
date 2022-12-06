def c(n,m):
    a = []
    for i in range(n):
        b = []
        for j in range((m)):
            b.append(int(input(f'Введите {j + 1} элемет {i + 1} строки: ')))
        a.append(b)
    for i in range(n):
        for j in range(m):
            print(a[i][j], end=' ')
        print()
    k = int(input('Введите строку в которой элементы расположить в порядке возрастания: '))
    for i in range(m - 1):
        if a[k - 1][i] > a[k - 1][i + 1]:
            a[k - 1][i], a[k - 1][i + 1] = a[k - 1][i + 1], a[k - 1][i]
    for i in range(n):
        for j in range(m):
            print(a[i][j], end=' ')
        print()
n1=int(input('Введите кол-во строк: '))
m1=int(input('Введите кол-во столбцов: '))
c(n1, m1)



