import java.util.*;

class Student {
    int rNo;

    void getNumber(int n) {
        rNo = n;
    }

    void putNumber() {
        System.out.println("Roll No: " + rNo);
    }
}

class Test extends Student {
    float p1, p2;

    void getMarks(float m1, float m2) {
        p1 = m1;
        p2 = m2;
    }

    void putMarks() {
        System.out.println("Marks obtained: ");
        System.out.println("Part 1: " + p1 + "\nPart 2: " + p2);
    }
}

interface Sports {
    float sportWt = 6.0F;

    void putwt();
}

class Results extends Test implements Sports {
    float total;

    public void putwt() {
        System.out.println("Sports Wt: " + sportWt);
    }

    void display() {
        total = p1 + p2 + sportWt;
        putNumber();
        putMarks();
        putwt();
        System.out.println("Total score: " + total);
    }
}

class Hybrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int n = sc.nextInt();
        System.out.print("Enter two marks: ");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        Results s1 = new Results();
        s1.getNumber(n);
        s1.getMarks(f1, f2);
        s1.display();
    }
}

/*
 * Enter Roll No: 10
 * Enter two marks: 54
 * 65
 * Roll No: 10
 * Marks obtained:
 * Part 1: 54.0
 * Part 2: 65.0
 * Sports Wt: 6.0
 * Total score: 125.0
 */