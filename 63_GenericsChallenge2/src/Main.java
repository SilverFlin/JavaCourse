import model.LPAStudent;
import model.Student;
import util.QueryList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 25;
        QueryList<LPAStudent> queryList = new QueryList<>();
        for (int i = 0; i < studentCount; i++) {
            queryList.add(new LPAStudent());
        }
        var matches = queryList.getMatches("PercentComplete","50.0");

        matches.sort(Comparator.naturalOrder());
        printMoreLists(matches);
        System.out.println("-".repeat(25));
        Collections.sort(queryList);
        printMoreLists(queryList);


    }

    public static void printMoreLists(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
