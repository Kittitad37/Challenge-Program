#https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

step = int(input())

for i in range (1,step+1):
    for j in range (step - i) :
       print(" ", end = "")
    for k in range (i) :
        print("#", end = "")
    print("")
