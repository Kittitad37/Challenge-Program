#https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

amount = int(input())
raw = input()

val = raw.split(" ")
arr = []
for i in range (amount) :
    arr.append(int(val[i]))

print(sum(arr))