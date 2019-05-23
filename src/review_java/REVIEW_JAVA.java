package review_java;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

enum Season {

    SPRING(5), SUMMER(10), FALL(15), WINTER(20);

    int value;

    private Season(int value) {
        this.value = value;
    }

    public static void B() {
        System.out.println("B");
    }

}

public class REVIEW_JAVA {

    static Scanner scanner = new Scanner(System.in);

    public static void USC2SONGUYEN() {
        System.out.print("Nhập vào số nguyên A: ");
        int A = scanner.nextInt();
//        System.out.println();
        System.out.print("Nhập vào số nguyên B: ");
        int B = scanner.nextInt();
        int max = 0;
        for (int i = 1; i < 100; i++) {
            if (A % i == 0 && B % i == 0) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("--->>> " + max);
    }

    public static void BSC2SONGUYEN() {
        System.out.print("Nhập vào số nguyên A: ");
        int A = scanner.nextInt();
//        System.out.println();
        System.out.print("Nhập vào số nguyên B: ");
        int B = scanner.nextInt();
        int min = 0, max = 0, count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % A == 0 && i % B == 0) {
                count++;
                if (count < 2) {
                    min = i;
                }
                if (i < min) {
                    min = i;
                } else if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("--->>> " + min);
        System.out.println("--->>> " + max);
    }

    public static int DEQUI(int i) {
        if (i > 10 || i == 10) {
            return 0;
        }
        System.out.println("--->>> " + i);
        i++;
        return DEQUI(i);
    }

    public static void MERGETWOARRAY() {
        int[] A = {7, 9, 3, 3, 7, 2, 7};
        int[] B = {6, 2, 7, 3, 8, 3, 8};
        int[] C = new int[A.length + B.length];
        int a = 0, b = 0;
        for (int i = 0; i < (A.length + B.length); i++) {
            if (i % 2 == 0) {
                a++;
                if (a - 1 < A.length && A[a - 1] != 0) {
                    C[i] = A[a - 1];
                } else {
                    C[i] = B[b];
                    b++;
                }
            } else {
                b++;
                if (b - 1 < B.length && B[b - 1] != 0) {
                    C[i] = B[b - 1];
                } else {
                    C[i] = A[a];
                    a++;
                }
            }
        }
        for (int item : C) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
    }

    public static void DELETEONEELEMENT() {
        System.out.print("Nhập tổng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            ar[i] = scanner.nextInt();
        }
        for (int i : ar) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.print("Nhập vị trí muốn xóa: ");
        int vt = scanner.nextInt();
        if (vt < 0 || vt > n) {
            System.out.println("NOOOOOOOOOOOOOOOOOO!");
        } else {
            ar = DELV1(ar, vt);
        }
        for (int i : ar) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

    public static void DELETESAMEELEMENT() {
        System.out.print("Nhập tổng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            ar[i] = scanner.nextInt();
        }
        for (int i : ar) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        n = removeDuplicates(ar, n);
        // Print updated array 
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static int[] DELV1(int ar[], int vt) {
        int[] ar_term = new int[ar.length - 1];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != ar[vt]) {
                count++;
                ar_term[count - 1] = ar[i];
            }
        }
        return ar_term;
    }

    // Function to remove duplicate elements 
    // This function returns new size of modified 
    // array. 
    static int removeDuplicates(int arr[], int n) {
        // Return, if array is empty 
        // or contains a single element 
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];

        // Start traversing elements 
        int j = 0;
        for (int i = 0; i < n - 1; i++) // If current element is not equal 
        // to next element then store that 
        // current element 
        {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = arr[n - 1];

        // Modify original array 
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void CHENVITRITRONGMANG() {
        System.out.print("Nhập tổng số phần tử trong mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] ar = new int[n + 1];
        System.out.println();
        for (int i = 0; i < ar.length - 1; i++) {
            System.out.print("Vị trí " + i + " : ");
            ar[i] = scanner.nextInt();
        }
        for (int item : ar) {
            if (item != 0) {
                System.out.print(" " + item + " ");
            }
        }
        System.out.println();
        System.out.print("Vị trí muốn chèn : ");
        int vt = scanner.nextInt();
        System.out.print("Giá trị muốn chèn : ");
        int gt = scanner.nextInt();
        for (int i = 0; i < ar.length - 1; i++) {
            if (i == vt) {
                for (int j = ar.length - 1; j > vt; j--) {
                    ar[j] = ar[j - 1];
                }
                ar[vt] = gt;
                break;
            }
        }
        for (int item : ar) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
    }
    
    public static void SayNewYear2019(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("HAPPY LUNAR NEW YEAR 2019!");
        }
    }

    public static void main(String[] args) {
//        USC2SONGUYEN();
//        BSC2SONGUYEN();
//        DEQUI(0);
//        MERGETWOARRAY();
//        DELETEONEELEMENT();
//        DELETESAMEELEMENT();

//        PersonImpl pi = new PersonImpl() {
//            @Override
//            public void A() {
//                System.out.println("A");
//            }
//
//            @Override
//            public void B() {
//                System.out.println("B");
//            }
//        };
//        pi.A();
//        AbstractPerson ap = new AbstractPerson() {
//            @Override
//            public void A() {
//                System.out.println("A");
//            }
//        };
//        ap.A();
//        ap.B();
//        for (Season s : Season.values()) {
//            System.out.println(s + " " + s.value);
//        }
//        Season.B();
//        CHENVITRITRONGMANG();
    
//        SayNewYear2019(100);

        
    }
}
