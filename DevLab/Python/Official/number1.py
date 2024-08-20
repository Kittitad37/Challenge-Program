#https://borntodev.com/devlab/task/551

def reduce_to_single_digit(num):
    while num > 9:
        num = sum(int(digit) for digit in str(num))
    return num

    
input_str = input()
    
total_sum = 0
    
for char in input_str:
    char_val = ord(char)
    powered_val = char_val ** len(input_str)
    total_sum += powered_val
    
result = reduce_to_single_digit(total_sum)
    
print(result)
