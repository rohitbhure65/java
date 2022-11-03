// Package in Java

// Package is a group of similar types of classes, interfaces and sub-packages.
// Packages can be built-in or user defined.
// Built-in packages - java, util, io etc.

package Bank_p; // package

class Account {
    // Access Modifiers in Java

    String name; // Default Access Modifier
    // ➢ Default: The access level of a default modifier is only within the package.
    // It
    // cannot be accessed from outside the package. If you do not specify any access
    // level, it will be the default.

    public String bankname; // Public Access Modifier
    // ➢ Public: The access level of a public modifier is everywhere. It can be
    // accessed
    // from within the class, outside the class, within the package and outside the
    // package.

    protected double balance; // Protected Access Modifier
    // ➢ Protected: The access level of a protected modifier is within the package
    // and
    // outside the package through child class. If you do not make the child class,
    // it
    // cannot be accessed from outside the package.

    private String Password;// Private Access Modifier
    // ➢ Private: The access level of a private modifier is only within the class.
    // It cannot
    // be accessed from outside the class.
    
    // getters & Setters

    public String getPassword(){
        return this.Password;
    }

    public void setPassword(String pass){
        this.Password = pass;
    }
}

public class Package {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "WebX GrafiX";
        account1.bankname = "IDBI";
        account1.balance = 432.34;

        account1.setPassword("wer");
        System.out.println(account1.getPassword());


    }
}
