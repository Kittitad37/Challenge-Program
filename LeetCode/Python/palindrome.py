#https://leetcode.com/problems/palindrome-number/

def isPalindrome(x):
    val = str(x)
    return val == val[::-1]
x = 121
print(isPalindrome(x))