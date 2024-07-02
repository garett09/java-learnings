public class DataTypes {
    public static void main(String[] args){
    int studentAge = 23;
    double studentGPA = 1.75;
    char studentFirstInitial = 'A';
    char studentLastInitial = 'S';
    boolean hasPerfectAttendance = true;
    String myName = "Adrian Sian";
    String myFirstName = "Adrian";
    String myLastName = "Sian";
    String wifeName = "Gabby";
    String wifeLastName = "Sian";
    char wifesName = wifeName.charAt(0);
    char wifesLastName = wifeLastName.charAt(0);

    //charAt means accessing a specific character in a string.
        // test verif

    System.out.println(studentAge);
    System.out.println(myName);
    System.out.println(myFirstName + " " + myLastName);
    System.out.println(wifesName + " " + wifesLastName);

    }
}