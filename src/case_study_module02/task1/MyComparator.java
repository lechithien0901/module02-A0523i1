package case_study_module02.task1;

import java.util.Date;

public class MyComparator implements Comparable<MyComparator> {
    private Date startDate;
    private Date endDate;

    public MyComparator() {
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public MyComparator(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }


    @Override
    public  int compareTo(MyComparator o) {
        int starDate=o.startDate.compareTo(this.startDate);
        if (starDate!=0){
            return starDate;
        }else {
            return o.endDate.compareTo(this.endDate);
        }
    }


}
