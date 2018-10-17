import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        FuzzySet f = new FuzzySet();
        MultiSets m = new MultiSets();
        System.out.println("Union");
        m.union();
        System.out.println("Intersection");
        m.intersection();
        System.out.println();
        System.out.println("Adding set1 and set2");
        m.addSets();
        System.out.print("Subtracted Set Now Become   ::");
        m.subtract();
        System.out.println("");
        System.out.println("intersection of Fuzzy Set");
        System.out.println("");
        f.insersetion();
//        System.out.println("");
        System.out.println("Union Of Fuzzy Set");
        f.union();
        //        m.union();
//        System.out.println(m.add());
//    m.add();
//        ComputationalProblems c = new ComputationalProblems();

//        System.out.println(c.addStrings());
//        c.check();
//        c.print();
//        System.out.println(c.check());

//        Set<String> set = new HashSet<String>(25);
//        set.add("3.c");
//        set.add("2.b");
//        set.add("1.c");
//
//        Set<String> set2 = new HashSet<String>(25);
//        set2.add("3.c");
//        set2.add("2.b");
//        set2.add("1.c");
//
//
//        System.out.println(set);
//        System.out.println(set2);
    }
}
