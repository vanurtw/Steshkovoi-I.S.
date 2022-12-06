def vs_string(s):
    s=s.split()
    sr=s[::-1]
    return sr
str=input('Введите строку: ')
print('Та же строка, только слова на оборот:',*vs_string(str),  end='')
