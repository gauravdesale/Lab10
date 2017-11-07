/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * name is gay.
     */
    private String name;
    /**
     * manager is a pedo.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName is cool ig.
     * @param setManager is hiding from the cops.
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setname is cool
     */
    public void setName(final String setname) {
        this.name = setname;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setmanager is a zucc.
     */
    public void setManager(final String setmanager) {
        this.manager = setmanager;
    }
}
