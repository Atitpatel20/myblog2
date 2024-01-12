package com.myblog2.myblog2;

public class LocalDate {
    private long date;
    private long month;
    private long year;

    public LocalDate(long date, long month, long year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public long getDate() {
        return date;
    }

    public long getMonth() {
        return month;
    }

    public long getYear() {
        return year;
    }
}
