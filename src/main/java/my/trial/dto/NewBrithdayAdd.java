package my.trial.dto;



public class NewBrithdayAdd {
    private boolean added;
    private String dob;
    private String name;
    private int auto_wish;

    public NewBrithdayAdd(String dob, String name, int auto_wish) {
        this.dob = dob;
        this.name = name;
        this.auto_wish = auto_wish;
    }

    public String getDob() {

        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAuto_wish() {
        return auto_wish;
    }

    public void setAuto_wish(int auto_wish) {
        this.auto_wish = auto_wish;
    }

    public boolean isAdded() {
        return added;
    }
    public void setAdded(boolean added) {
        this.added = added;
    }

    public NewBrithdayAdd(boolean added){
        this.added=added;
    }
}
