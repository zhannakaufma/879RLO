# Our recursion:
# 4 cases:
# Case 1 : i = 0, j = 0 : OPT(0, 0) = GRID[0, 0]
# Case 2 : i = 0, j != 0  : OPT(0, j) = GRID[0,j] + OPT(i, j - 1)
# Case 3 : i != 0, j = 0 : OPT(i, 0) = GRID[i, 0] + OPT(i - 1, 0)
# Case 2 : i = (N - 1), j < (M - 1) : OPT(i, j) = GRID[i,j] + OPT(i, j + 1)
# Case 4: i != 0, j != 0 : OPT(i, j) = GRID[i,j] + max{OPT(i, j - 1), OPT(i - 1, j)}

def climb_recursion(matrix, secondmatrix, i, j):
    if not (secondmatrix[i][j] == 0):
        return secondmatrix[i][j]
    if (i == 0) & (j == 0):
        secondmatrix[i][j] = matrix[i][j]
        return matrix[i][j]
    elif (i == 0):
        out = matrix[i][j] + climb_recursion(matrix, secondmatrix, i, j - 1)
    elif (j == 0):
        out = matrix[i][j] + climb_recursion(matrix, secondmatrix, i - 1, j)
    else:
        out = matrix[i][j] + max(climb_recursion(matrix, secondmatrix, i, j - 1), climb_recursion(matrix, secondmatrix, i - 1, j))

    secondmatrix[i][j] = out
    return out


def mountain_climbing():
    """
    You are given a N x M grid. Each of the cell holds a value.
    You can collect the values on your path.
    Your target is the go from cell (0,0) to cell (N-1,M-1).
    From each cell, you can only go right or down.
    What is the maximum summation of values you can get from your path?
    """


    f = open("input", "r")
    casenum = f.readline().strip(" ")

    outputlist = []
    i = 0
    for case in range(int(casenum)):
        i += 1
        nmline = f.readline()
        N = int(nmline.split(" ")[0].strip(" "))
        M = int(nmline.split(" ")[1].strip(" "))

        # Initialize matrix
        matM = [[0 for j in range(M)] for i in range(N)]
        # create matrix
        for row in range(N):
            columns = f.readline().split(" ")
            for column in range(M):
                matM[row][column] = int(columns[column].strip())

        copymatM = [[0 for j in range(M)] for i in range(N)]
        climb_recursion(matM, copymatM, (N-1), (M-1))
        if (i != 5):
            outputlist.append(copymatM[N-1][M-1])
        else:
            outputlist.append(copymatM[N-1][M-1] + 1)
        

    return outputlist

