import java.util.ArrayList;
import java.util.List;

public class SortColumns {
    public static List<Integer> min(String[] list) {
        List<Integer> ans = new ArrayList<>();
        int numOfCols = list[0].length();
        int stringLength =  list[0].length();
        for (int i = 0; i < list.length; i++){
            if(stringLength != list[i].length()){
                ans.add(-1);
                return ans;
            }
        }
        for (int i = 0; i < numOfCols; i++) {
            //how many words there are
            int rows = list.length;
            //store each letter from col
            char[] column = new char[rows];
            for (int j = 0; j < rows; j++) {
                column[j] = list[j].charAt(i);
            }
            //loop through item found in column
            for (int k = 0; k < column.length-1; k++) {
                if (column[k] > column[k + 1]) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] A = new String[]{"Captain","Marvel","saved", "the", "Avengers"};
        min(A);
        System.out.print(min(A).toString());
    }
}


