#https://www.borntodev.com/devlab/task/409

num = list(map(int, input().split(" ")))
num.sort()

order = list(input())

abc = {"A" : 0, "B" : 1, "C" : 2}

for i in order:
    print(num[abc.get(i)], end = " ")
