package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Objects;
import java.util.TimeZone;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private ConsolidatedWeather[] consolidated_weather;
    private String time;
    private String sun_rise;
    private String sun_set;
    private String timezone_name;
    private Parent parent;
    private String title;
    private String location_type;
    private Double woeid;
    private String latt_long;
    private String timezone;

    public Weather(ConsolidatedWeather[] consolidatedWeather,
                   String time,
                   String sun_rice,
                   String sun_set,
                   String time_zone_name,
                   Parent parent,
                   String title,
                   String location_type,
                   Double woeid,
                   String latt_long,
                   String timezone){
        this.consolidated_weather = consolidatedWeather;
        this.time = time;
        this.sun_rise = sun_rice;
        this.sun_set = sun_set;
        this.timezone_name = time_zone_name;
        this.parent = parent;
        this.title = title;
        this.location_type = location_type;
        this.woeid = woeid;
        this.latt_long = latt_long;
        this.timezone = timezone;
    }

    public Weather() {
    }

    public ConsolidatedWeather[] getConsolidated_weather() {
        return consolidated_weather;
    }

    public void setConsolidated_weather(ConsolidatedWeather[] consolidated_weather) {
        this.consolidated_weather = consolidated_weather;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSun_rise() {
        return sun_rise;
    }

    public void setSun_rise(String sun_rise) {
        this.sun_rise = sun_rise;
    }

    public String getSun_set() {
        return sun_set;
    }

    public void setSun_set(String sun_set) {
        this.sun_set = sun_set;
    }

    public String getTimezone_name() {
        return timezone_name;
    }

    public void setTimezone_name(String timezone_name) {
        this.timezone_name = timezone_name;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;
        Weather weather = (Weather) o;
        return getConsolidated_weather().equals(weather.getConsolidated_weather()) &&
                getTime().equals(weather.getTime()) &&
                getSun_rise().equals(weather.getSun_rise()) &&
                getSun_set().equals(weather.getSun_set()) &&
                getTimezone_name().equals(weather.getTimezone_name()) &&
                getParent().equals(weather.getParent()) &&
                getTitle().equals(weather.getTitle()) &&
                getLocation_type().equals(weather.getLocation_type()) &&
                getWoeid().equals(weather.getWoeid()) &&
                getLatt_long().equals(weather.getLatt_long()) &&
                getTimezone().equals(weather.getTimezone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConsolidated_weather(), getTime(), getSun_rise(), getSun_set(), getTimezone_name(), getParent(), getTitle(), getLocation_type(), getWoeid(), getLatt_long(), getTimezone());
    }

    @Override
    public String toString() {
        return "Weather{" + "\n"+
                "consolidated_weather=" + Arrays.toString(consolidated_weather) + "\n" +
                ", time='" + time + '\'' + "\n" +
                ", sun_rise='" + sun_rise + '\'' + "\n" +
                ", sun_set='" + sun_set + '\'' + "\n" +
                ", timezone_name=" + timezone_name + "\n" +
                ", parent=" + parent + "\n" +
                ", title='" + title + '\'' + "\n" +
                ", location_type='" + location_type + '\'' + "\n" +
                ", woeid=" + woeid + "\n" +
                ", latt_long='" + latt_long + '\'' + "\n" +
                ", timezone='" + timezone + '\'' + "\n" +
                '}';
    }
}
