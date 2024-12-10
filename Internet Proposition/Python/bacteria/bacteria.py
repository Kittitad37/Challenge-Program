cells = int(input("Enter intitial cells : "))
hour = int(input("Enter period : "))

for i in range (hour * 60):
    cells = cells * 2

print(f"Cells quantity after {hour} hour(s) : {cells}")