import math
x=int(input("Введите x="))
y=int(input("Введите y="))
buf=y
y=x
x=buf
print(f"Переменные поменялись местами: x={x} y={y}")