package com.CatDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.CatEntity.Catuser;

public class CatuserDAO implements CatuserDAOInterface {

	public int createProfileDAO(Catuser cu) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sravani");
			PreparedStatement st = con.prepareStatement("insert into Catuser values(?,?,?,?)");
			st.setString(1,cu.getName());
			st.setString(2,cu.getEmail());
			st.setString(3,cu.getEmail());
			st.setString(4,cu.getAddress());
			i=st.executeUpdate();
			
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	

}
}
