#https://borntodev.com/devlab/task/548

user_input = input()
split_factor = input()

lista = list()
val = ""

lista = user_input.split(split_factor)

for i in range(len(lista)):
    if i == 0:
        print(lista[i] + split_factor)
    elif i == len(lista)-1:
        print(split_factor + lista[i])
    else:
        print(split_factor + lista[i] + split_factor)