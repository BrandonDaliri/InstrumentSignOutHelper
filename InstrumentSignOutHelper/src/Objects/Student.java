/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author 070029319
 */
public class Student {

    private String firstName;
    private String lastName;
    private String studentID;

    public Student(String fName, String lName, String barcode) {
        firstName = fName;
        lastName = lName;
        studentID = barcode;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    public String toString() {
        return firstName + " " + lastName + ", " + studentID;
    }
}
