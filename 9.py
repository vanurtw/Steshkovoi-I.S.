def ras(n,m,k):
    if (k%m==0 or k%n==0) and k<m*n:
        print("Да")
    else:
        print("Нет")
N=int(input("n="))
M=int(input("m="))
K=int(input("k="))
ras(N,M,K)