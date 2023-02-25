package lk.ijse.FinalProject.dao.custom;

import lk.ijse.FinalProject.dto.RentDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RentDaoImpl {
    public ArrayList<RentDTO> getRent() throws SQLException, ClassNotFoundException {
        ResultSet rst = lk.ijse.FinalProject.util.CrudUtil.executeQuery("SELECT *FROM rent ");
        ArrayList<RentDTO> All= new ArrayList<>();
        while (rst.next()){
            All.add(new RentDTO( rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)));

        }
        return  All;
    }

}
