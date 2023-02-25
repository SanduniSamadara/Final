package lk.ijse.FinalProject.dto;

public class VehicleDTO {
    private String id;
    private String type;
    private String numPlate;
    private String qty;
    private double perDayCost;

    public VehicleDTO(String id, String type, String numPlate, String qty,  double perDayCost) {
        this.id = id;
        this.type = type;
        this.numPlate = numPlate;
        this.qty = qty;
        this.perDayCost = perDayCost;
    }

    public double getPerDayCost() {
        return perDayCost;
    }

    public void setPerDayCost(double perDayCost) {
        this.perDayCost = perDayCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public VehicleDTO() {
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", numPlate='" + numPlate + '\'' +
                ", qty='" + qty + '\'' +
                ", perDayCost=" + perDayCost +
                '}';
    }
}
