package prac9_1;

import javax.sound.midi.MidiDevice;

public class Student {

    public int idNumber[];

    public Student() {
        idNumber = new int[10];
        idNumber[0] = 2909;
        idNumber[1] = 3234;
        idNumber[2] = 1523;
        idNumber[3] = 1841;
        idNumber[4] = 3001;
        idNumber[5] = 1999;
        idNumber[6] = 2022;
        idNumber[7] = 2321;
        idNumber[8] = 1423;
        idNumber[9] = 9990;
    }

    public void selectionSort() {
        int i = 0;
        int value = 0;
        for (int left = 0; left < idNumber.length; left++) {
            value = idNumber[left];
            i = left - 1;
            for (; i >= 0; i--)
                if (value < idNumber[i]) {
                    idNumber[i + 1] = idNumber[i];
                } else {
                    break;
                }
            idNumber[i + 1] = value;
        }
    }

    public void PrintScr() {
        System.out.println("Array class Student created and sorted: ");
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }
}

