def maxx(element, maxNum):
     return element if element > maxNum else maxNum
maximum=0
while True:
    inp = int(input('vvedi: '))
    if inp==0:
        print(maximum)
        break
    maximum=maxx(inp, maximum)
