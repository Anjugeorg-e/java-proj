package Office_project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class MeetingRoom {

    private int roomId;
    private boolean isAvailable;
    private boolean underMaintance;
    ArrayList<LocalDate> bookedDates = new ArrayList<>();
    LocalDate date = LocalDate.of(2023, 05, 04);
    LocalDate endDate = date.plusDays(1);

    public MeetingRoom(int roomId) {
        this.roomId = roomId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setendDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getendDate() {
        return endDate;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isUnderMaintance() {
        return underMaintance;
    }

    public void setUnderMaintance(boolean underMaintance) {
        this.underMaintance = underMaintance;
    }

    @Override
    public String toString() {
        return "MeetingRoom [roomId=" + roomId + ", isAvailable=" + isAvailable + "]";
    }

}
