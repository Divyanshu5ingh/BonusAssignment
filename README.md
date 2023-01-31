For the given Assignment 

The approach I am using is
    1. fill first row (top of the matrix)
    2. fill the last column (right of the matrix)
    3. fill the last row (bottom of the matrix)
    4. fill the first column (left of the matrix)

So for that I have created a function called createSpiralMatrix which takes single parameter 'n' (n is the size of the matrix)

This function first initialize the 2D array matrix with the size of nXn

Then I have used a variable 'count' which keeps track of number to be filled in the matrix, I have initialized it with 1

Then the variable top, bottom, left and right keeps track of starting and ending point of the row and col of matrix

Then I used a while loop to fill the matrix

The steps which I have used is 

    First fill first row (top of the matrix) from left to right, a for loop is used to fill the elements in the first row and by incrementing the value of 'count'
    after that fill the last column (right of the matrix) from top to bottom in same way
    then fill the last row (bottom of the matrix) and at last
    fill the first column (left of the matrix)

Then a printMatrix function is used as mentioned in the assignment to display the matrix

Then in the main function I have used Scanner class to ask the user for 'n' for the nXn matrix
and I called the createSpiralMatrix function by passing the parameter 'n' and also called the printMatrix function to print the matrix.
