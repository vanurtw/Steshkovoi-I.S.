n=int(input('Введите кол-во строк: '))
m=int(input('Введите кол-во столбцов: '))
a=[]
for i in range(n):
    b=[]
    for j in range((m)):
        b.append(int(input(f'Введите {j+1} элемет {i+1} строки: ')))
    a.append(b)
print(f'Итоговая матрица: {a}')
mx=0
mn=0
m1=[]
score=0
for i in a:
    for j in range(len(a)-1):
        if i[j]>i[j+1]:
            mx+=1
        else:
            mn+=1
    if mx==m-1 or mn==m-1:
        m1.append(i)
m2=[]
for i in m1:
    for j in range(m):
        m2.append(i[j])
print(max(m2))

