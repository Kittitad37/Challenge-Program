#https://borntodev.com/devlab/task/29

list1 = []
n = int(input())
for i in range(n):
    user_input = int(input())
    list1.append(user_input)

list1.sort(reverse=True)
for i in list1:
    print(i)
