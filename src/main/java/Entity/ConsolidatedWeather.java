package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedWeather {
    private Double id ;
    private String weather_state_name;
    private String weather_state_abbr;
    private String wind_direction_compass;
    private String created;
    private String applicable_date;
    private Double min_temp;
    private Double max_temp;
    private Double the_temp;
    private Double wind_speed;
    private Double wind_direction;
    private Double air_pressure;
    private Double humidity;
    private Double visibility;
    private Double predictability;

    public ConsolidatedWeather(Double id,
                               String weather_state_name,
                               String weather_state_abbr,
                               String wind_direction_compass,
                               String created,
                               String applicable_date,
                               Double min_temp,
                               Double max_temp,
                               Double the_temp,
                               Double wind_speed,
                               Double wind_direction,
                               Double air_pressure,
                               Double humidity,
                               Double visibility,
                               Double predictability){
        this.id = id;
        this.weather_state_name = weather_state_name;
        this.weather_state_abbr = weather_state_abbr;
        this.wind_direction_compass = wind_direction_compass;
        this.created = created;
        this.applicable_date = applicable_date;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
        this.the_temp = the_temp;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.air_pressure = air_pressure;
        this.humidity = humidity;
        this.visibility = visibility;
        this.predictability = predictability;
    }

    public ConsolidatedWeather() {
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getWeather_state_name() {
        return weather_state_name;
    }

    public void setWeather_state_name(String weather_state_name) {
        this.weather_state_name = weather_state_name;
    }

    public String getWeather_state_abbr() {
        return weather_state_abbr;
    }

    public void setWeather_state_abbr(String weather_state_abbr) {
        this.weather_state_abbr = weather_state_abbr;
    }

    public String getWind_direction_compass() {
        return wind_direction_compass;
    }

    public void setWind_direction_compass(String wind_direction_compass) {
        this.wind_direction_compass = wind_direction_compass;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getApplicable_date() {
        return applicable_date;
    }

    public void setApplicable_date(String applicable_date) {
        this.applicable_date = applicable_date;
    }

    public Double getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(Double min_temp) {
        this.min_temp = min_temp;
    }

    public Double getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(Double max_temp) {
        this.max_temp = max_temp;
    }

    public Double getThe_temp() {
        return the_temp;
    }

    public void setThe_temp(Double the_temp) {
        this.the_temp = the_temp;
    }

    public Double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public Double getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(Double wind_direction) {
        this.wind_direction = wind_direction;
    }

    public Double getAir_pressure() {
        return air_pressure;
    }

    public void setAir_pressure(Double air_pressure) {
        this.air_pressure = air_pressure;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getPredictability() {
        return predictability;
    }

    public void setPredictability(Double predictability) {
        this.predictability = predictability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConsolidatedWeather)) return false;
        ConsolidatedWeather that = (ConsolidatedWeather) o;
        return getId().equals(that.getId()) &&
                getWeather_state_name().equals(that.getWeather_state_name()) &&
                getWeather_state_abbr().equals(that.getWeather_state_abbr()) &&
                getWind_direction_compass().equals(that.getWind_direction_compass()) &&
                getCreated().equals(that.getCreated()) &&
                getApplicable_date().equals(that.getApplicable_date()) &&
                getMin_temp().equals(that.getMin_temp()) &&
                getMax_temp().equals(that.getMax_temp()) &&
                getThe_temp().equals(that.getThe_temp()) &&
                getWind_speed().equals(that.getWind_speed()) &&
                getWind_direction().equals(that.getWind_direction()) &&
                getAir_pressure().equals(that.getAir_pressure()) &&
                getHumidity().equals(that.getHumidity()) &&
                getVisibility().equals(that.getVisibility()) &&
                getPredictability().equals(that.getPredictability());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWeather_state_name(), getWeather_state_abbr(), getWind_direction_compass(), getCreated(), getApplicable_date(), getMin_temp(), getMax_temp(), getThe_temp(), getWind_speed(), getWind_direction(), getAir_pressure(), getHumidity(), getVisibility(), getPredictability());
    }

    @Override
    public String toString() {
        return "ConsolidatedWeather{" + "\n" +
                "id=" + id + "\n" +
                ", weather_state_name='" + weather_state_name + '\'' + "\n" +
                ", weather_state_abbr='" + weather_state_abbr + '\'' + "\n" +
                ", wind_direction_compass='" + wind_direction_compass + '\'' + "\n" +
                ", created=" + created + "\n" +
                ", applicable_date=" + applicable_date + "\n" +
                ", min_temp=" + min_temp + "\n" +
                ", max_temp=" + max_temp + "\n" +
                ", the_temp=" + the_temp + "\n" +
                ", wind_speed=" + wind_speed + "\n" +
                ", wind_direction=" + wind_direction + "\n" +
                ", air_pressure=" + air_pressure + "\n" +
                ", humidity=" + humidity + "\n" +
                ", visibility=" + visibility + "\n" +
                ", predictability=" + predictability + "\n" +
                '}';
    }
}
