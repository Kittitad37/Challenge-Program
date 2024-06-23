prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

def factor_count (num) :
    arr = []
    if num == 0 :
        return arr
    else :
        for i in prime:
            if num % i == 0 :
                arr.append(i)
    return arr

n = int(input())
print(factor_count(n))