def vs_string(s):
    s=s.split()
    sr=s[::-1]
    return sr
str=input('Введите строку: ')
print('Та же строка, только слова на оборот: ', end='')
print(*vs_string(str))