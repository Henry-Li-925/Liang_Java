package Chapter8;


public class Case_1GradingMultipleChoiceTest {
    public static void main(String[] args){
    char[][] StudentAnswers = new char[][]{
        {'A','B','A','C','C','D','E','E','A','D'},
        {'D','B','A','B','C','A','E','E','A','D'},
        {'E','D','D','A','C','B','E','E','A','D'},
        {'C','B','A','E','D','C','E','E','A','D'},
        {'A','B','D','C','C','D','E','E','A','D'},
        {'B','B','E','C','C','D','E','E','A','D'},
        {'B','B','A','C','C','D','E','E','A','D'},
        {'E','B','E','C','C','D','E','E','A','D'}
    };

    int[] StudentGrades = new int[8];

    for(int i = 0; i < StudentAnswers.length; i++){
        StudentGrades[i] = grade(StudentAnswers[i]);
        System.out.printf("Student %d's grade is: %d\n", i, StudentGrades[i]);
    }

    }

    public static int grade(char[] arr){
        int result = 0;
        char[] AnswerKey = new char[]{'D','B','D','C','C','D','A','E','A','D'};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == AnswerKey[i]){
                result += 1;
            }
        }
        return result;
    }
}
