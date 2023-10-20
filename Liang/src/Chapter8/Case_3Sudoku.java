package Chapter8;

public class Case_3Sudoku {
    public static void main(String[] args){
    int[][] grid = {
        {5,3,4,6,7,8,9,1,2},
        {6,7,2,1,9,5,3,4,8},
        {1,9,8,3,4,2,5,6,7},
        {8,5,9,7,6,1,4,2,3},
        {4,2,6,8,5,3,7,9,1},
        {7,1,3,9,2,4,8,5,6},
        {9,6,1,5,3,7,2,8,4},
        {2,8,7,4,1,9,6,3,5},
        {3,4,5,2,8,6,1,7,9}
    };

    // dummy variable indicating if there are any glitch within the solution. If any, the result goes south.
    int rowGlitch = 0, colGlitch = 0, cubeGlitch = 0;
    Boolean rowResult = false;
    Boolean colResult = false;
    Boolean cubeResult = false;
    Boolean result = false;
    
    for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[i].length; j++){
            // if any element equals zero, identify a glitch
            if(grid[i][j] == 0 || grid[i][j] < 1 || grid[i][j] > 9){
                rowGlitch++;
            }
            for(int k = j + 1; k < grid[i].length; k++){
                // if there are two elements in the same row bearing the same value, identify a glitch.
                if(grid[i][j] == grid[i][k]){
                rowGlitch++;
                }
            }
        }
    }

    if(rowGlitch == 0){
        rowResult = true;
    }

    for(int j = 0; j < grid[0].length; j++){
        for(int i = 0; i < grid.length; i++){
            // if any element equals zero, identify a glitch
            if(grid[i][j] == 0 || grid[i][j] < 1 || grid[i][j] > 9){
                colGlitch++;
            }
            for(int k = i + 1; k < grid.length; k++){
                // if there are two elements in the same column bearing the same value, identify a glitch.
                if(grid[i][j] == grid[k][j]){
                    colGlitch++;
                }
            }
        }
    }

    if(colGlitch == 0){
        colResult = true;
    }

    for(int i = grid.length / 3; i < (grid.length / 3) * 3 + 3; i ++){
        for(int j = grid[i].length / 3; j < (grid[i].length / 3) * 3 + 3; j++){
            if(grid[i][j] == 0 || grid[i][j] < 1 || grid[i][j] > 9){
                cubeGlitch ++;
            }
            for(int k = j + 1; k < (grid[i].length / 3) * 3 + 3; k++){
                if(grid[i][j] == grid[i][k]){
                    cubeGlitch ++;
                }
            }
            for(int m = i + 1; m < (grid.length / 3) * 3 + 3; m ++){
                if(grid[i][j] == grid[m][j]){
                    cubeGlitch ++;
                }
            }
        }
    }

    if(cubeGlitch == 0){
        cubeResult = true;
    }

    if(rowResult && colResult && cubeResult){
        result = true;
    }

    System.out.printf("The row checking: %b.\nThe column checking: %b.\nThe final result: %b.\n", rowResult, colResult, result);
    }
}
