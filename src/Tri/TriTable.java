package Tri;

import Tri.Abstract.Tri;

public class TriTable extends Tri {

    @Override
    public Integer[] triBullesTable(Integer[] suite) {

        for (int i = 0; i < suite.length; i++) {
            for (int j = i + 1; j < suite.length; j++) {
                int tmp;
                if (suite[i] > suite[j]) {
                    tmp = suite[i];
                    suite[i] = suite[j];
                    suite[j] = tmp;
                }
            }
        }
        return suite;
    }


}
