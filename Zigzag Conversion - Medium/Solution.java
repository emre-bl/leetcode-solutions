class Solution {
    static String convert(String s, int numRows) {
            
            if(numRows == 1) return s;
            int rn = numRows;
            int cn = 0;

            int num = 0;
            int t = 1;



            while (num <= s.length()) {
                if (t == 1) {
                    num += rn;
                    cn += 1;
                    t = 2;
                } else {
                    num += (rn - 2);
                    cn += (rn - 2);
                    t = 1;
                }
            }


            String[][] arr = new String[rn][cn];

            int row_counter = 0;
            int col_counter = 0;
            int pass = rn-2;
            int col = 0;

            for (String letter : s.split("")) {
                if (row_counter < rn) {
                    arr[row_counter][col] = letter;
                    row_counter += 1;
                } else {
                    if (col_counter < pass) {
                        col+=1;
                        arr[rn - 2 - col_counter][col] = letter;
                        col_counter +=1;
                    } else {
                        col+=1;
                        arr[0][col] = letter;
                        row_counter = 1;
                        col_counter = 0;
                    }
                }
            }

            String mainStr = "";
            for (int i = 0; i < rn; i++) {
                for (int j = 0; j < cn; j++) {
                    if (arr[i][j] != null) mainStr = mainStr + arr[i][j];
                }
            }

            return mainStr;

        }
}