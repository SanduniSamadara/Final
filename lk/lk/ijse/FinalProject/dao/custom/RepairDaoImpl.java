package lk.ijse.FinalProject.dao.custom;

import lk.ijse.FinalProject.dto.RepairDTO;
import lk.ijse.FinalProject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepairDaoImpl {
    public ArrayList<RepairDTO> getAllRepairs() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT *FROM Repair");
        ArrayList<RepairDTO> All = new ArrayList<>();
        while (rst.next()) {
            All.add(new RepairDTO(rst.getString(1), rst.getDouble(2), rst.getString(3)));
        }
        return All;
    }
    public boolean saveRepairs(RepairDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO Repair VALUES (?,?,?)", dto.getRepairId(),
                dto.getRepairPrize(), dto.getVehicleId());
    }
}
