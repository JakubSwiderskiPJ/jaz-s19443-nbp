package com.example.jazzaliczenie.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "response")
public class NbpResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "This is id of NbpResponse", required = true, value = "some id", example = "1")
    private Long id;

    @ApiModelProperty(notes = "This is currency of NbpResponse", required = true, value = "some currency", example = "EUR")
    private String currency;

    @ApiModelProperty(notes = "This is amount of days to calculate", required = true, value = "some days", example = "7")
    private int days;

    @ApiModelProperty(notes = "This is average value for given currency and days", required = true, value = "some average", example = "4,213")
    private double average;

    @ApiModelProperty(notes = "This is date of request create", required = true, value = "some date", example = "01.01.2018")
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
