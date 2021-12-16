package ru.mirea.task12;

//Сортировка вставками

import java.util.Arrays;
import java.util.Comparator;

public class DifferentSort {
    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for (int i = 0; i < 10; i++) {
            IDNumber[i] = new Student();
        }

        //insertion sort
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(IDNumber));
        insertionSort(IDNumber);
        System.out.println(Arrays.toString(IDNumber));
        System.out.println();

        //quick sort
        System.out.println("Quick sort");
        System.out.println(Arrays.toString(IDNumber));
        quickSort(IDNumber);
        System.out.println(Arrays.toString(IDNumber));
        System.out.println();

        //merge sort
        System.out.println("Merge sort");
        System.out.println(Arrays.toString(IDNumber));
        mergeSort(IDNumber, 0, IDNumber.length-1);
        System.out.println(Arrays.toString(IDNumber));

    }

    static void insertionSort(Student[] arr){
        for (int left = 0; left < arr.length; left++) {
            Student value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.ID < arr[i].ID) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }

    static void quickSort(Student[] arr){
        Comparator<Student> comp = new SortingStudentsByGPA();
        Arrays.sort(arr, comp);
    }

    static void mergeSort(Student[] arr, int left, int right){
        if (right <= left)
            return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        Student[] buffer = Arrays.copyOf(arr, arr.length);

        for (int k = left; k <= right; k++)
            buffer[k] = arr[k];

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = buffer[j];
                j++;
            } else if (j > right) {
                arr[k] = buffer[i];
                i++;
            } else if (buffer[j].getID() < buffer[i].getID()) {
                arr[k] = buffer[j];
                j++;
            } else {
                arr[k] = buffer[i];
                i++;
            }
        }
    }
}

class Student{
    public int ID;
    public int score;
    Student(){
        ID=(int)(Math.random()*900+100);
        score=(int)(Math.random()*11);
    }

    @Override
    public String toString() {
        return "\n\tID: " + ID + ", score: " + score + "";
    }

    public int getID() {
        return ID;
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score > o2.score) {return -1;}
        else if (o1.score < o2.score){return 1;}
        else {return 0;}
    }
}