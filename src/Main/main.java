package Main;


import Tri.Abstract.Tri;
import Tri.TriParBullesList;
import Tri.TriTable;

import java.util.Arrays;
import java.util.List;

public class main {
    static Tri triBullesList = new TriParBullesList();
    static Tri triBullesTable = new TriTable();

    public static void main(String[] args) {
        List<Integer> suite = Arrays.asList(7, 3, 9, 4, 3, 5);
        Integer[] suiteTable = {9, 1, 3, 7, 1};
        triBullesList.triBulles(suite);
        triBullesTable.triBullesTable(suiteTable);
    }
}
