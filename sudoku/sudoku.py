import numpy as np

def create_sudoku():
    sudoku = np.full((9, 9), '', dtype=str)

    sudoku[0] = ['5', '·', '4', '6', '·', '8', '9', '1', '·']
    sudoku[1] = ['6', '7', '2', '1', '9', '5', '·', '4', '8']
    sudoku[2] = ['1', '9', '8', '3', '4', '2', '5', '6', '7']
    sudoku[3] = ['·', '5', '9', '7', '·', '1', '4', '2', '3']
    sudoku[4] = ['4', '2', '·', '8', '5', '3', '7', '9', '1']
    sudoku[5] = ['7', '1', '·', '·', '2', '·', '8', '·', '6']
    sudoku[6] = ['·', '·', '1', '5', '3', '7', '2', '8', '4']
    sudoku[7] = ['2', '8', '·', '4', '1', '9', '6', '3', '5']
    sudoku[8] = ['·', '4', '5', '·', '8', '6', '1', '7', '·']

    return sudoku

def printarr(arr):
    print()
    for i in range(9):
        for j in arr[i]:
            print(j, end = " ")
        print()
    print()

sudoku_matrix = create_sudoku()

printarr(sudoku_matrix)
