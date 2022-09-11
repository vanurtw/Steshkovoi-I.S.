import math
name=input("Как вас зовут")
age=int(input("введите age="))
if 0<age<75:
   if age>16 and name!='Иван':
       print("Поздравляем вы поступили во ВГУИТ")
   else:
       print("К сожалению вы не поступили(")
       if age<16:
           print("Сначала нужно окончить школу")
           n=16-age
           if n<5:
               print(f"Вам еще учиться {n} года ")
           else:
               print(f"Вам еще учиться {n} лет ")

