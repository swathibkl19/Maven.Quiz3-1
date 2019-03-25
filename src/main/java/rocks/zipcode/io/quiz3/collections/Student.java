package rocks.zipcode.io.quiz3.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<Lab,LabStatus> status;

    public Student() {

        this.status = new TreeMap<>();
    }

    public Student(List<Lab> labs) {

        //this.status =labs;

    }

    public Lab getLab(String labName) {

        for(Lab lab : status.keySet()) {
            if (labName.equals(lab.getName())) {
                return lab;
            }
        }

        return null;

    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if (lab == null) {
            throw new UnsupportedOperationException();
        }
        status.put(lab, labStatus);
    }

    public void forkLab(Lab lab) {
        status.put(lab,LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return status.get(lab);

    }


//duplicate deleter > COMPLETED
//learner lab > PENDING

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (Map.Entry<Lab, LabStatus> entry : status.entrySet()) {
            builder.append(entry.getKey().getName());
            builder.append(" > ");
            builder.append(entry.getValue().toString());
            builder.append("\n");
        }

        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
