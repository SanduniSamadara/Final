package lk.ijse.FinalProject.dao.custom;

import lk.ijse.FinalProject.dto.EmployeeDTO;
import lk.ijse.FinalProject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDaoImpl {
    public ArrayList<EmployeeDTO> getAllEmployee() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT *FROM Employee ");
        ArrayList<EmployeeDTO> All= new ArrayList<>();
        while (rst.next()){
            All.add(new EmployeeDTO( rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5),rst.getString(6)));
        }
        return  All;
    }

    public boolean saveEmployee(EmployeeDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO Vehicle VALUES(?,?,?,?,?)", dto.getId(), dto.getName(), dto.getPosition(), dto.getSalary(), dto.getAddress(),dto.getContact());
    }

    public boolean deleteEmployee() throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM Employee WHERE EmployeeId= ?");
    }

    public boolean updateEmployee() throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("UPDATE Employee SET EmployeeName =?,EmployeeAddress=?,EmployeeContact=?,EmployeeSalary=?,EmployeeJobType=? WHERE EmployeeID= ?");
    }

}