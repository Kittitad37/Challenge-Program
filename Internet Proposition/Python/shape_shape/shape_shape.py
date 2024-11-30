size = int(input("Enter size : "))
shape1 = input("Shape1 : ")
shape2 = input("Shape2 : ")

for row in range(1, size+1):
    for col in range(1, size+1):
        if col == 1 or col == size or col == row or col == size - row +1:
            print(shape1, end = "")
        else : 
            print(shape2, end = "")
    print()