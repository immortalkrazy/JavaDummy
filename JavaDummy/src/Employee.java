
public class Employee {

      private String lastName;
      private String firstName;

      public Employee() {

      }

      public Employee(String firstName, String lastName) {

            this.lastName = lastName;
            this.firstName = firstName;

      }

      public void setLastName(String lastName) {
            this.lastName = lastName;
      }

      public void setFirstName(String firstName) {
            this.firstName = firstName;
      }

      public String getLastName() {
            return lastName;
      }

      public String getFirstName() {
            return firstName;
      }

      public String toString() {
            return "Employee [" + this.firstName + " " + this.lastName + "]";
      }
}
