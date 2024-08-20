#https://borntodev.com/devlab/task/395

user_input = input()

try :
    user_input = int(user_input)
    if user_input > 1000000:
        print("OVER")
    elif user_input < 0:
        print("UNDER")
    else:
        lst = []
        lst.extend(str(user_input))
        for i in range(len(lst)):
            print(int(lst[i]) * 10 ** (len(lst) - 1 - i))

except ValueError:
    print("Invalid")