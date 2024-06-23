'''

Write a program with the following steps:

Receive one character input.
- If a lowercase letter is entered, display on the screen that a lowercase letter was entered.
- If a digit from 0 to 9 is entered, display on the screen that a digit was entered.
- If neither a digit nor a lowercase letter is entered, display a message saying that no character was entered and prompt to try again.

'''

while(1):
  val = input("Input : ")
  if (val.isnumeric()) :
    if (int(val) >= 0) and (int(val) <= 9):
      print("a digit was entered")
      break
  if (val.islower()) :
    print("a lowercase letter was entered")
    break
  print("no character was entered TRY AGAIN!")