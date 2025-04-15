class Student {
    String name;
    int rollNumber;
    float marks;
    
    Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void showResult(){
        System.out.println("Student's name  : "+name);
        System.out.println("Student's Roll No : "+rollNumber);
        System.out.println("Student's Marks : "+marks);
        if(marks>=35){
            System.out.println(name + " is Passed with "+marks +" marks");
        }
        else{
            System.out.println(name +" is falied with "+marks +" marks");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Student st1 = new Student("Rajan", 001, 67.9f);
        Student st2 = new Student("Shubham", 002, 32.8f);
        Student st3 = new Student("Prakanshu", 003, 88.3f);

        st1.showResult();
        st2.showResult();
        st3.showResult();
    }
}