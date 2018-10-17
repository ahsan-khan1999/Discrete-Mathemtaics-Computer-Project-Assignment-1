import java.util.HashMap;
import java.util.Map;

public class FuzzySet {

        double[] a = {0.3 , 0.7 , 0.8 , 0.11};
        double[] b = {0.1,0.9,0.12,0.6};

        int complementOfSet_a = a.length-1;
        int complementOfSet_b = b.length-1;

        double c[] = new double[10];
    public void insersetion(){
        System.out.println();
        for (int i=0; i < a.length ; i++) {
            if(a[i] < b[i]){
                c[i] = a[i];
                System.out.print(","+a[i]);
            }
            else {
                System.out.print(","+b[i]);
            }
        }
    }
    double[] d = new double[10];
    public void union(){
        System.out.println();
        for (int i=0; i <a.length ; i++) {
            if(a[i] > b[i]){
                d[i] = a[i];
                System.out.print(","+a[i]);
            }
            else{
                System.out.print(","+b[i]);
            }
        }

    }



}
