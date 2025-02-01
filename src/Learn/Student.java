package Learn;

public class Student {
    private String name;
    public int age;
    public int score;
    private int id;
    private Cat cat;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    private class TrafficTool{
        private String toolName;
        private TrafficTool(String toolName){
            this.toolName = toolName;
        }
    }

    public void goToClass(){
        TrafficTool tool = new TrafficTool("bus");
        System.out.println(this.name + " go to class by "+ tool.toolName);

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

