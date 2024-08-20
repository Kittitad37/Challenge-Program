#https://borntodev.com/devlab/task/224

lista = []

while(1) :
    val = int(input())
    if val == 0:
        break
    else :
        lista.append(int(val))

filter = input().lower()

if filter == "max": lista.sort(reverse= True)
elif filter == "min": lista.sort()

for i in lista:
    print(i, end = " ")