package homeworks.lesson8.task3.com.company.professions;

public class Driver {
    String fullName;
    int experience;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }
}
