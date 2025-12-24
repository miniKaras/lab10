public class AdministrativalEmployee extends Employee {

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     */
    public AdministrativalEmployee(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    static class Main {
        public static void main(String[] args) {
            Employee admin = new AdministrativalEmployee(1111, "Карасев Артем", "akarasev204@gmail.com");
            Faculty faculty = new Faculty(new AdministrativalEmployee(1, "Александр Крыловецкий", "fcs@vsu.ru"), "ФКН");
            ResearchEmployee sciEmpl = new ResearchEmployee(2, "Алексей Гавшиy", "gavsku@vsu.ru", "Программирование");
            String adminString = admin.toString();
            String facultyString = faculty.toString();
            String sciEmplString = sciEmpl.toString();
            System.out.println(adminString);
            System.out.println(facultyString);
            System.out.println(sciEmplString);
            sciEmpl.setEmail("gavsku@vsu.ru");
            admin.setSsNo(3);
            sciEmpl.setFieldOfStudy("Java программирование");
            faculty.setName("Факультет компьютерных наук");
            System.out.println();
            System.out.println(admin);
            System.out.println(sciEmpl);
            System.out.println(faculty);
        }
    }
}