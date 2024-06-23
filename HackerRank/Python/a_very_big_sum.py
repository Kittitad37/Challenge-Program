#https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

amount = int(input())
val = input()

arr = val.split(" ")
final_val = []
for i in range (amount):
    final_val.append(int(arr[i]))

print(sum(final_val))