public class Database {
    static final String[][] instructors = {
            {"instructor1" ,"instPass1"},
            {"instructor2" ,"instPass2"},
            {"instructor3" ,"instPass3"},
            {"instructor4" ,"instPass4"},


    };
    public String[][] getInstructors() {
        return instructors;
    }

    static final String[][] students = {
            {"student1" ,"stuPass1"},
            {"student2" ,"stuPass2"},
            {"student3" ,"stuPass3"},
            {"student4" ,"stuPass4"},

    };

    public String[][] getStudents() {
        return students;
    }
    static final String[] courses = {
            "Data structures",
            "OOP",
            "Data Base",
            "Logic",
            "Marketing"
    };
    public String[] getCourses() {
        return courses;
    }
}
