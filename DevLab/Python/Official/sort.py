#https://borntodev.com/devlab/task/28'

list1 = []
for i in range (5):
    user_input = int(input())
    list1.append(user_input)

list1.sort(reverse = True)
for i in list1 :
    print(i)