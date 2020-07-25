package Tri;

import Tri.Abstract.Tri;

import java.util.List;

public class TriParBullesList extends Tri{

    @Override
    public List<Integer> triBulles(List<Integer> suite) {

        for (int i = 0; i < suite.size(); i++) {
            for (int j = i + 1; j < suite.size(); j++) {
                int tmp;
                if (suite.get(i) > suite.get(j)) {
                    tmp = suite.get(i);
                    suite.set(i, suite.get(j));
                    suite.set(j, tmp);
                }
            }
        }
        return suite;
    }
}
