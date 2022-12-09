def c(f):
    matrix = [line.replace("\n", "").split() for line in f]
    f.close()
    for i in matrix:
        for j in range(len(i)):
            i[j] = int(i[j])
    print(f'Итоговая матрица: {matrix}')
    mx = 0
    mn = 0
    m = 4
    m1 = list()
    for i in matrix:
        for j in range(len(i) - 1):
            if i[j] > i[j + 1]:
                mx += 1
            else:
                mn += 1
            print(i[j])
        if mx == m - 1 or mn == m - 1:
            m1.append(i)
        mx = 0
        mn = 0
    m2 = []
    print(m1)
    for i in m1:
        for j in range(m):
            m2.append(int(i[j]))
    d = max(m2)
    print(m2)
    f1 = open('D:\\python(задания)\\10 пр\\Стешковой И.С._У-222_вывод.txt', 'w')
    f1.write(f'{d}')
fc = open('D:\\python(задания)\\10 пр\\Стешковой И.С._У-222_ввод.txt', 'r')
c(fc)