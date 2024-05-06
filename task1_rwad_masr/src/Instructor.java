public class Instructor extends User {
    private Database database;

    public Instructor(String username, String password, Database database) {
        super(username, password);
        this.database = database;
    }

    public void showStudents() {
        String[][] students = database.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0]);
        }
    }
}
