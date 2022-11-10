package main;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Flight {
    private final DayOfWeek dayOfWeek;
    private final LocalTime departureTime,arrivalTime;
    private final int departureDelay,arrivalDelay,duration,distance;

    public Flight(DayOfWeek dayOfWeek, LocalTime departureTime, LocalTime arrivalTime, int departureDelay, int arrivalDelay, int duration, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureDelay = departureDelay;
        this.arrivalDelay = arrivalDelay;
        this.duration = duration;
        this.distance = distance;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public int getDepartureDelay() {
        return departureDelay;
    }

    public int getArrivalDelay() {
        return arrivalDelay;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Flight{" + "dayOfWeek=" + dayOfWeek + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", departureDelay=" + departureDelay + ", arrivalDelay=" + arrivalDelay + ", duration=" + duration + ", distance=" + distance + '}';
    }
}
