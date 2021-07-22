public class test {
    public static void main(String[] args) {
        public class Employee {
            private int id;
            private String name;

            public Employee(int _id) {
                id = _id;
            }

            public Employee(String _name, int _id) {
                name = _name;
                id = _id;
            }
        }

    }

    public class EmployeeMain {
        public static void main(String[] args) {
            Employee employee = new Employee();
        }
    }
}