package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab> {
    private  String labName;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName =labName;
    }

    public String getName() {

        return labName;
    }

    public void setStatus(LabStatus labStatus) {
    }

//    public LabStatus getStatus() {
//
//        return null;
//    }

    @Override
    public int compareTo(Lab o) {
        return labName.compareTo(o.labName);
    }
}
