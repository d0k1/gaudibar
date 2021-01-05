package com.gauidi.model;

public class Place {
    String name;
    long minScore;
    long maxScore;
    long xPosition;
    long yPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMinScore() {
        return minScore;
    }

    public void setMinScore(long minScore) {
        this.minScore = minScore;
    }

    public long getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(long maxScore) {
        this.maxScore = maxScore;
    }

    public long getxPosition() {
        return xPosition;
    }

    public void setxPosition(long xPosition) {
        this.xPosition = xPosition;
    }

    public long getyPosition() {
        return yPosition;
    }

    public void setyPosition(long yPosition) {
        this.yPosition = yPosition;
    }
}
