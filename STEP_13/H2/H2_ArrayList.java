import java.util.*;

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
        for (int i = 0; i < als.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < als.size(); j++) {
                Student student1 = als.get(maxIndex);
                Student student2 = als.get(j);
                if (student1.getName().compareTo(student2.getName()) < 0 ||
                    (student1.getName().equals(student2.getName()) && student1.getAge() < student2.getAge())) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Student temp = als.get(maxIndex);
                als.set(maxIndex, als.get(i));
                als.set(i, temp);
            }
        }
    }

    void prtStd() {
        for (Student st : als) {
            System.out.println(st.getName() + " " + st.getAge());
        }
    }
}
public class H2_ArrayList {
    public static void main(String[] args) { 
        ArrLst_Std alst = new ArrLst_Std();
        alst.addStd("Choi", 19);
        alst.addStd("Hong", 18);
        alst.addStd("Park", 20);
        alst.addStd("Hong", 19);
        alst.addStd("Choi", 20);
        alst.addStd("Park", 21);

        alst.prtStd();
        alst.srtStd();
        System.out.println("---------------");
        alst.prtStd();
    }
}
