package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parent {
    private String title;
    private String location_type;
    private Double woeid;
    private String latt_long;

    public Parent(String title, String location_type, Double woeid, String latt_long) {
        this.title = title;
        this.location_type = location_type;
        this.woeid = woeid;
        this.latt_long = latt_long;
    }

    public Parent() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Double getWoeid() {
        return woeid;
    }

    public void setWoeid(Double woeid) {
        this.woeid = woeid;
    }

    public String getLatt_long() {
        return latt_long;
    }

    public void setLatt_long(String latt_long) {
        this.latt_long = latt_long;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parent)) return false;
        Parent parent = (Parent) o;
        return getTitle().equals(parent.getTitle()) &&
                getLocation_type().equals(parent.getLocation_type()) &&
                getWoeid().equals(parent.getWoeid()) &&
                getLatt_long().equals(parent.getLatt_long());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getLocation_type(), getWoeid(), getLatt_long());
    }

    @Override
    public String toString() {
        return "Parent{" +
                "title='" + title + '\'' +
                ", location_type='" + location_type + '\'' +
                ", woeid=" + woeid +
                ", latt_long='" + latt_long + '\'' +
                '}';
    }
}
