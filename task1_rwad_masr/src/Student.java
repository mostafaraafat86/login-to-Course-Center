public class Student extends User {
    private Database database;

    public Student(String username, String password, Database database) {
        super(username, password);
        this.database = database;
    }

    public void showCourses() {
        String[] courses = database.getCourses();
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
    }
}
