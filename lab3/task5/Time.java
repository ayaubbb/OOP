package lab3.task5;

public class Time implements Comparable<Time> {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		setTime(hour,minute,second);
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("invalid input");
        }
	}
	
	public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
	
	public String toStandard() {
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, minute, second, amPm);
    }
	
	public void add(Time t2) {
        int s = this.second + t2.second;
        int m = this.minute + t2.minute + (s / 60);
        int h = this.hour + t2.hour + (m / 60);
        
        this.second = s % 60;
        this.minute = m % 60;
        this.hour = h % 24;
    }
	
	private int getTotalSeconds() {
        return hour * 3600 + minute * 60 + second;
    }
	
	public int compareTo(Time other) {
        return Integer.compare(this.getTotalSeconds(), other.getTotalSeconds());
    }
	
	public String toString() {
        return toUniversal();
    }
	
}
