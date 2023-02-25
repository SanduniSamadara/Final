package lk.ijse.FinalProject.dto;

public class RepairDTO {
    private String repairId;
    private double repairPrize;
    private String vehicleId;

    public RepairDTO(String repairId, double repairPrize, String vehicleId) {
        this.repairId = repairId;
        this.repairPrize = repairPrize;
        this.vehicleId = vehicleId;
    }

    public RepairDTO() {
    }

    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }

    public double getRepairPrize() {
        return repairPrize;
    }

    public void setRepairPrize(double repairPrize) {
        this.repairPrize = repairPrize;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "RepairDTO{" +
                "repairId='" + repairId + '\'' +
                ", repairPrize=" + repairPrize +
                ", vehicleId='" + vehicleId + '\'' +
                '}';
    }
}
