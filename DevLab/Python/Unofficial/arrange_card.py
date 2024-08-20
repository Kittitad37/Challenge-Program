#https://borntodev.com/devlab/task/400

_index = ['A' , '2', '3' , '4', '5' , '6' , '7' , '8' , '9' , 'J' , 'Q' , 'K']

user_input = input()

lista = []

for i in _index:
    for j in user_input:
        if j == i:
            lista.append(i)

for i in lista:
    print(i, end = " ")
    