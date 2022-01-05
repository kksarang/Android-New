package com.example.trogon.Model;

public class ModelClass {

    private String title;
    private String price;
    private String thumbnail;
    private String discounted_price;
    private String video_url;
    private String full_price;
    private String shareable_link;
    private String total_enrollment;
    private String number_of_ratings;
    private String rating;

    public ModelClass(String title, String price, String thumbnail, String discounted_price, String video_url, String full_price, String shareable_link, String total_enrollment, String number_of_ratings, String rating) {
        this.title = title;
        this.price = price;
        this.thumbnail = thumbnail;
        this.discounted_price = discounted_price;
        this.video_url = video_url;
        this.full_price = full_price;
        this.shareable_link = shareable_link;
        this.total_enrollment = total_enrollment;
        this.number_of_ratings = number_of_ratings;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(String discounted_price) {
        this.discounted_price = discounted_price;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getFull_price() {
        return full_price;
    }

    public void setFull_price(String full_price) {
        this.full_price = full_price;
    }

    public String getShareable_link() {
        return shareable_link;
    }

    public void setShareable_link(String shareable_link) {
        this.shareable_link = shareable_link;
    }

    public String getTotal_enrollment() {
        return total_enrollment;
    }

    public void setTotal_enrollment(String total_enrollment) {
        this.total_enrollment = total_enrollment;
    }

    public String getNumber_of_ratings() {
        return number_of_ratings;
    }

    public void setNumber_of_ratings(String number_of_ratings) {
        this.number_of_ratings = number_of_ratings;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
