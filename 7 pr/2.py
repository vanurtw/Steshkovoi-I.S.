def c(s):
    sc = s.copy()
    for i in range(len(sc)):
        if sc[i] < 10:
            sc[i] = 0
        elif sc[i] > 20:
            sc[i] = 1
    print(s)
    print(sc)
s1=[int(input(f'vvedi znaschenie {i}: ')) for i in range(1,16)]
c(s1)

