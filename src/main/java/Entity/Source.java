package Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {
    private String title;
    private String slug;
    private URL url;
    private Double crawl_rate;

    public Source(String title, String slug, URL url, Double crawl_rate) {
        this.title = title;
        this.slug = slug;
        this.url = url;
        this.crawl_rate = crawl_rate;
    }

    public Source() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Double getCrawl_rate() {
        return crawl_rate;
    }

    public void setCrawl_rate(Double crawl_rate) {
        this.crawl_rate = crawl_rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Source)) return false;
        Source source = (Source) o;
        return getTitle().equals(source.getTitle()) &&
                getSlug().equals(source.getSlug()) &&
                getUrl().equals(source.getUrl()) &&
                getCrawl_rate().equals(source.getCrawl_rate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getSlug(), getUrl(), getCrawl_rate());
    }

    @Override
    public String toString() {
        return "Source{" + "\n" +
                "title='" + title + '\'' + "\n" +
                ", slug='" + slug + '\'' + "\n" +
                ", url=" + url + "\n" +
                ", crawl_rate=" + crawl_rate + "\n" +
                '}';
    }
}
