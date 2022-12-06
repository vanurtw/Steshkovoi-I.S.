def c(n1):
    for i in range(n1 + 1):
        for j in range(1, i + 1):
            print(j, end='')
        print()
n=int(input())
c(n)
