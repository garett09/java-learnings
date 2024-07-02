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


    System.out.println(studentAge);
    System.out.println(myName);
    System.out.println(myFirstName + " " + myLastName);
    System.out.println(wifesName + " " + wifesLastName);

    }
}
$ git config --global commit.gpgsign true ([OPTIONAL] every commit will now be signed)
$ git config --global user.signingkey E8DC498A97C4FEFA (where ABCDEF01 is the fingerprint of the key to use)
$ git config --global alias.logs "log --show-signature" (now available as $ git logs)
$ git config --global alias.cis "commit -S" (optional if global signing is false)
$ echo "Some content" >> example.txt
$ git add example.txt
$ git cis -m "This commit is signed by a GPG key." (regular commit will work if global signing is enabled)
$ git logs