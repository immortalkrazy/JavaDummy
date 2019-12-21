
public class CloneTest {

      public static void main(String[] args) {

            Employee emp1 = new Employee("James", "Bond");
            emp1.setSalary(40000.00);

            Employee emp2 = (Employee) emp1.clone();

            // emp1.setLastName("Smith");

            System.out.println(emp1);
            System.out.println(emp2);

            System.out.println("Employees emp1 & emp2 equal?: " + emp1.equals(emp2));

      }

      private static class Employee {

            private String firstName;
            private String lastName;
            private double salary;

            public Employee(String firstName, String lastName) {
                  super();
                  this.firstName = firstName;
                  this.lastName = lastName;
            }

            @SuppressWarnings("unused")
            public String getFirstName() {
                  return firstName;
            }

            @SuppressWarnings("unused")
            public void setFirstName(String firstName) {
                  this.firstName = firstName;
            }

            @SuppressWarnings("unused")
            public String getLastName() {
                  return lastName;
            }

            public void setLastName(String lastName) {
                  this.lastName = lastName;
            }

            @SuppressWarnings("unused")
            public double getSalary() {
                  return salary;
            }

            public void setSalary(double salary) {
                  this.salary = salary;
            }

            @Override
            public String toString() {
                  return this.getClass().getName() + " [" + this.firstName + " " + this.lastName + ", " + this.salary
                              + "]";
            }

            public Object clone() {
                  Employee employee;
                  employee = new Employee(this.firstName, this.lastName);
                  employee.setSalary(this.salary);
                  return employee;
            }

            @SuppressWarnings("unused")
            public boolean equals(Object obj) {
                  if (this == obj) {
                        return true;
                  }
                  if (this == null) {
                        return false;
                  }
                  if (this.getClass() != obj.getClass()) {
                        return false;
                  }
                  Employee employee = (Employee) obj;

                  return this.getFirstName().equals(employee.getFirstName())
                              && this.getLastName().equals(employee.getLastName());

            }

      }

}
