s = 0
n = 0
t = 0

while t >= 0:
    t = float(input())
    if t > 0:
        s+=t
        n+=1
        print("*")

if n == 0:
    print("no data")
else :
    print("s =", s)
    print("n =", n)
    print("avg =", (s/n))
