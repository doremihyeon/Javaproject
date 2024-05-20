package STEP_13.H2;

import java.util.ArrayList;

class Student {
    private String name;
    private Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }
}

class ArrLst_Std {
    private ArrayList<Student> als;

    ArrLst_Std() {
        als = new ArrayList<>();
    }

    void addStd(String name, Integer age) {
        als.add(new Student(name, age));
    }

    void srtStd() {
        int N = als.size();
        int maxi, i, j;

        for (i = 0; i < N - 1; i++) {
            maxi = i;
            //여기부터
            for (j = i + 1; j < N; j++) {
                if (compareStudents(als.get(j), als.get(maxi)) > 0) {
                    maxi = j;
                }
            }

            if (maxi != i) {
                Student temp = als.get(i);
                als.set(i, als.get(maxi));
                als.set(maxi, temp);
            }
        }
    }

    int compareStudents(Student s1, Student s2) {
        int nameComparison = s2.getName().compareTo(s1.getName()); // 내림차순
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return s1.getAge().compareTo(s2.getAge()); // 오름차순
        }
    } //여기 코드 다시 수정(gpt 도움사용)

    
    void prtStd() {
        for (Student st : als) {
            System.out.println(st.getName()+""+st.getAge());
        }
    }
}
public class H2_ArrayList {
    public static void main(String[] args) { // main 메소드 추가
        ArrLst_Std alst = new ArrLst_Std();
        alst.addStd("Choi", 19);
        alst.addStd("Hong", 18);
        alst.addStd("Park", 20);
        alst.addStd("Hong", 19);
        alst.addStd("Choi", 20);
        alst.addStd("Park", 21);

        alst.prtStd();
        alst.srtStd();
        alst.prtStd();
    }
}
