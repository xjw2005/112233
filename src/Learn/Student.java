package Learn;

public class Student {
    private String name;
    public int age;
    public int score;
    private int id;

//    public Student(){
//
//    }
//

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void goToClass(){
        System.out.println(this.name + " go to class");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Student)obj).id;
    }
}

