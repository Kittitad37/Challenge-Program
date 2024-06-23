n = 0
start = int(input("Start = "))
stop = int(input("Stop = "))

for i in range (start, stop+1) :
    if i%3 == 0:
        n+= 1
print(n)