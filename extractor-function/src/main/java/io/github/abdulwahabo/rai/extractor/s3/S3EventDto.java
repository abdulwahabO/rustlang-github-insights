package io.github.abdulwahabo.rai.extractor.s3;

public class S3EventDto {

    private String type;
    private String repository;
    private String date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * Returns a date in IS0 8601 format (YYYY-MM-DD)
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
