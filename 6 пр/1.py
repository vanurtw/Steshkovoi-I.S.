def c(s):
    score = 0
    if s[0] == s[-1]:
        score += 1
    while len(s) != 1:
        if s[0] == s[1]:
            score += 1
        del s[1]

    print('kol-vo povtorov: ', score)
s1=list()
for i in range(int(input('vvedi kol-vo schisel v spiske: '))):
    s1.append(input('vvedi znaschenie: '))
c(s1)

