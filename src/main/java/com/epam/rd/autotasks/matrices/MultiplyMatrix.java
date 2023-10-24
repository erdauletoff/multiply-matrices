package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length, n = matrix2[0].length;
        int[][] result = new int[m][n];

        for (int k = 0; k < m; k++) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < matrix1[0].length; j++) {
                    sum += matrix1[k][j] * matrix2[j][i];
                }
                result[k][i] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {{3981, 31983, 63168}, {24048, 7732, 61489}, {58162, 76464, 67458}, {62250, 56560, 79404}, {12823, 7256, 29358}, {63633, 55764, 37886}, {22131, 3089, 51186}, {80721, 51590, 79867}, {16428, 15985, 29769}};
        int[][] b = {{63723, 66307, 44826, 79688, 81662, 31436, 27855, 72123, 55748, 86736}, {87953, 3049, 3141, 36030, 54956, 56752, 69334, 64523, 14525, 81090}, {65225, 4474, 88670, 83524, 99249, 27616, 2356, 5638, 46570, 4963}};
        int[][] expected = {{-1403119730, 644097966, 1585050173, -1844305142, -237819590, -610273876, -1817743411, -1588065340, -666747673, -1042667026}, {1928116029, 1893227390, -2035443102, -1259206372, -98485263, -1402107680, 1350815612, -1714986574, 21510638, -1276982181}, {1946541480, 96526266, 238909504, 139271480, -1532949314, -559148904, -1509346058, 918898210, -1095360756, -1304902842}, {1235602442, 360348390, 1418891548, 745672608, -1107330728, -1230329608, 1547613318, -3177210, -600243312, 1789913860}, {-924784749, 1003725897, -1094198542, -559596800, 64697408, 1625646868, 929439617, 1558532521, -2107515232, 1846308522}, {-1454290787, 263872435, 2091951906, 1654419096, -863789844, 1916377996, 1433130511, -188869893, 1826768308, 1639268274}, {725580084, 1705864742, 1245442079, 1855163966, -1532754472, -2010397676, 951225947, 2084052328, -632608563, -1870889752}, {2005702740, 1572022919, -2022651262, 2077192168, 173869041, -918946484, 1718623871, 1010937807, 378850656, -1303672211}, {99485878, 1271216167, -868739653, 76512674, 879591181, -2049255264, 1636041694, -1910892875, -1760614697, -1426101091}};


        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
        System.out.println(Arrays.deepToString(expected).replace("],", "]\n"));
    }
}
