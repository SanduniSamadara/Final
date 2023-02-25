package lk.ijse.FinalProject.dao.custom;

import lk.ijse.FinalProject.dto.VehicleDTO;
import lk.ijse.FinalProject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VehicleDAOImpl {

    public ArrayList<VehicleDTO> getAllVehicle() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT *FROM Vehicle ");
        ArrayList<VehicleDTO> All= new ArrayList<>();
        while (rst.next()){
            All.add(new VehicleDTO( rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5)));

        }
        return  All;
    }

    public boolean saveVehicle(VehicleDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO Vehicle VALUES(?,?,?,?,?)", dto.getId(), dto.getType(), dto.getNumPlate(),
                dto.getQty(), dto.getPerDayCost());
    }

    public boolean ifVehicleExist(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("SELECT id FROM Vehicle WHERE VehicleID=?");
    }
    public boolean deleteVehicle(String id) throws SQLException, ClassNotFoundException {
       return CrudUtil.executeUpdate ("DELETE FROM Vehicle WHERE VehicleID=?");
    }

    public boolean updateVehicle(VehicleDTO dto) throws SQLException, ClassNotFoundException {
         return CrudUtil.executeUpdate("UPDATE Vehicle SET VehicleType=?,VehicleNoPlate=?,VehicleQty=?,dayPerCost=? WHERE VehicleID=?", dto.getPerDayCost(), dto.getQty());
    }


}

