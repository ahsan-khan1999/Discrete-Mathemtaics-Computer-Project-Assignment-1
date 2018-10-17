import java.util.ArrayList;
import java.util.Arrays;

public class MultiSets {

    //    ArrayList<String> list = new ArrayList<>(20);
    String x1="3.a";
    String x2="2.b";
    String x3="1.c";

    String y1="4.d";
    String y2="6.e";
    String y3="4.f";


    char[] array= x1.toCharArray(); //arrray[] {'2','.','a'};
    char[] array2= y1.toCharArray();
    char[] array3=x2.toCharArray();
    char[] array4=y2.toCharArray();
    char[] array5 = x3.toCharArray();
    char[] array6 = y3.toCharArray();

    public void union(){

        int i = 0;

            if(array[2] == array2[2]){
                if(array[0] > array2[0]){
                    System.out.println(array);
                }
                else{
                    System.out.println(array2);
                }
            }
            else if(array[i]!=array2[i]){
                System.out.print(array);
                System.out.print(" , ");
                System.out.print(array2);
            }


        if(array3[2] == array4[2]){
            if(array3[0] > array4[0] || array2[0] < array3[0]){
                System.out.print(array3);
            }
            else{
//                System.out.print();
            }
        }
        else if(array3[i]!=array4[i]){
            System.out.print(array3);
            System.out.print(" , ");
            System.out.print(array4);
        }


        if(array5[1] == array6[1]){
            if(array5[0] > array6[0] ){
                System.out.print(array5);
            }
            else{
                System.out.print(",");
                System.out.print(array6);
            }
        }
        else if(array5[i]!=array6[i]){
            System.out.print(array5);
            System.out.print(" , ");
            System.out.print(array6);
        }

    }
    public void intersection(){


            if(array[0] == array2[0]){
                System.out.println("");
                }

            else if(array[0] < array2[0] || array[0] > array2[0]) {
                System.out.println("");
                System.out.print(array[0]);
//                System.out.print(array[0]);
                if (array[1] == array2[1]) {
                    System.out.print(array[1]);
//                    System.out.print(array[1]);
                    if (array[2] == array2[2]) {
//                        System.out.print(array[2]);
                        System.out.print(array[0]);
                    }
                }
            }
            else if(array[0] < array4[0] || array[0] > array4[0]){
                System.out.println("");
                System.out.print(array[0]);
                if (array[1] == array4[1]) {
                    System.out.print(array[1]);
                    if (array[2] == array4[2]) {
                        System.out.print(array[2]);
                    }
                }

            }
            else if(array[0] < array6[0] || array[0] > array6[0]){

                System.out.println("");
                System.out.print(array[0] );
                if (array[1] == array6[1]) {
                    System.out.print(array[1]);
                    if (array[2] == array6[2]) {
                        System.out.print(array[2]);
                    }
                }
            }
            else if(array3[0] < array2[0] || array3[0] > array2[0]){
                System.out.print(array3[0]);
                if (array3[1] == array2[1]) {
                    System.out.print(array3[1]);
                    if (array3[2] == array2[2]) {
                        System.out.print(array3[2]);
                    }
                }
            }
            else if(array3[0] < array4[0] || array3[0] > array4[0] ){
                System.out.print(array3[0]);
                if (array3[1] == array4[1]) {
                    System.out.print(array4[1]);
                    if (array3[2] == array4[2]) {
                        System.out.print(array3[2]);
                    }
                }

            }
            else if(array3[0] < array6[0] || array3[0] > array6[0] ) {
                System.out.print(array3[0]);
                    if (array3[1] == array6[1]) {
                        System.out.print(array6[1]);
                        if (array3[2] == array6[2]) {
                            System.out.print(array3[2]);
                        }
                    }

            }
            else if(array5[0] > array6[0] || array5[0] < array6[0]){
                System.out.print(array5[0]);
                if (array5[1] == array6[1]) {
                    System.out.print(array6[1]);
                    if (array5[2] == array6[2]) {
                        System.out.print(array5[2]);
                    }
                }
            }
            else if(array5[0] > array4[0] || array5[0] < array4[0]){
                System.out.print(array5[0]);
                if (array5[1] == array4[1]) {
                    System.out.print(array4[1]);
                    if (array5[2] == array4[2]) {
                        System.out.print(array5[2]);
                    }
                }
            }
            else if (array5[0] > array2[0] || array5[0] < array2[0]) {
                System.out.print(array5[0]);
                if (array5[1] == array2[1]) {
                    System.out.print(array2[1]);
                    if (array5[2] == array2[2]) {
                        System.out.print(array5[2]);
                    }
                }
            }
    }
    public void subtract(){
        for (int i=0; i <3 ; i++) {
            if(array[i] == array2[i]){

            }
            else {
                System.out.print(array[i]);
            }
            if (array[i] == array4[i]){

            }
            else {
                System.out.print(array[i]);
            }
            if (array[i] == array6[i]){

            }
            else {
                System.out.print(array[i]);
            }
            if (array3[i] == array2[i]){

            }
            else {
                System.out.print(array3[i]);
            }
            if (array3[i] == array4[i]){

            }
            else {
                System.out.print(array3[i]);
            }
            if (array3[i] == array6[i]){

            }
            else {
                System.out.print(array3[i]);
            }
            if (array5[i] == array2[i]){

            }
            else {
                System.out.print(array5[i]);
            }
            if (array5[i] == array4[i]){

            }
            else {
                System.out.print(array5[i]);
            }
            if (array5[i] == array6[i]){

            }
            else {
                System.out.print(array5[i]);
            }
        }


    }
    public void addSets(){
            System.out.println(x1+","+x2+","+x3+","+y1+","+y2+","+y3);
    }










}


//            else{
//                if (array[1] == array4[1]) {
//                    System.out.print(array[1]);
//                    if (array[2] == array4[2]) {
//                        System.out.print(array[2]);
//                    }
//                }
//            }
//            else if(array[i] == array2[i] || array3[i] == array4[i] || array5[i] == array6[i]){
//
//            }
//            else if(array[i] == array2[i] || array3[i] == array4[i] || array5[i] == array6[i]){
//
//            }
//            else{
//                System.out.println("");
//            }












//    public void union(){
//        for (int i=0; i <array.length ; i++) {
//            if(array[i] == array2[i] && b0[i] == b01[i] ) {
//                System.out.print(array[i]+""+b0[i]);
//            }
//            else if(array[i] != array2[i]){
//                if (array[i] > array2[i]){
//                    System.out.print(array[i]);
//                }
//                else{
//
//                }


//                Arrays.toString(array[i]+"" + array2[i])
//            }
//            System.out.println(array[i]);
//        }
//    }



//    Sets set1 = new Sets(3,'a',2,'b',1,'c');
//    Sets set2 = new Sets(3,'a',2,'b',1,'c');


//    ArrayList<Sets> list = new ArrayList<Sets>(10);
//
//
//    public void union(){
//        for (int i=0; i <list.size() ; i++) {
//
//        }
//        if(set1.times == set2.times && set1.variable == set2.variable){
//            System.out.println("Go");
//        }
//        else{
//            System.out.println("Nothing");
//        }
//    }


