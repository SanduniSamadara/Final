package lk.ijse.FinalProject.dto;

public class RentDTO {
    private String id;
    private String StartDate;
    private String ReserveDate;
    private String CustomerId;

    public RentDTO(String id, String startDate, String reserveDate, String customerId) {
        this.id = id;
        StartDate = startDate;
        ReserveDate = reserveDate;
        CustomerId = customerId;
    }

    public RentDTO(String string, String rstString, String s, String string1, double aDouble) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getReserveDate() {
        return ReserveDate;
    }

    public void setReserveDate(String reserveDate) {
        ReserveDate = reserveDate;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    @Override
    public String toString() {
        return "RentDTO{" +
                "id='" + id + '\'' +
                ", StartDate='" + StartDate + '\'' +
                ", ReserveDate=" + ReserveDate +
                ", CustomerId='" + CustomerId + '\'' +
                '}';
    }

}
