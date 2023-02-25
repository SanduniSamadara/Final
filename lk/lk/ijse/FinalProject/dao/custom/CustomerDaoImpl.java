package lk.ijse.FinalProject.dao.custom;

import lk.ijse.FinalProject.dto.CustomerDTO;
import lk.ijse.FinalProject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDaoImpl {

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<CustomerDTO> all = new ArrayList<>();
        while (rst.next()) {
            all.add(new CustomerDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
        }
        return all;
    }

    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?)", dto.getId(), dto.getName(), dto.getNic(), dto.getAddress(), dto.getContact());
    }

    public boolean ifExistCustomer(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("SELECT *FROM Customer WHERE CustomerID=?");
    }

    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       return CrudUtil.executeUpdate("UPDATE Customer SET Name=?,Nic=?,Address=?,Contact=? WHERE ID=?", dto.getNic(), dto.getId(), dto.getAddress(), dto.getContact(), dto.getName());
    }

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate ("DELETE FROM Customer WHERE CustomerID=?");
    }
}
