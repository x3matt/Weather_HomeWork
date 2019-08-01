package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sources {
    private Source[] sources;

    public Sources(Source[] sources) {
        this.sources = sources;
    }

    public Sources() {
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sources)) return false;
        Sources sources1 = (Sources) o;
        return Arrays.equals(getSources(), sources1.getSources());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getSources());
    }

    @Override
    public String toString() {
        return "Sources{" +
                "sources=" + Arrays.toString(sources) +
                '}';
    }
}
