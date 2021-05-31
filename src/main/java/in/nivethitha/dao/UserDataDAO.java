package in.nivethitha.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.nivethitha.model.User;
import in.nivethitha.util.ConnectionUtil;

public class UserDataDAO {

	public List<User> loginCredentialData() {
		List<User> masterCredetials = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select account_number,pin,name from userdetails";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String accountHolderName = rs.getString("name");
				long accountNumber = rs.getLong("account_number");
				int pin = rs.getInt("pin");
				// Store the data in model
				User user = new User(accountNumber, pin, accountHolderName);
				// Store all user credentials in list
				masterCredetials.add(user);
			}
		} catch (Exception e) {

			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		System.out.println(masterCredetials);
		return masterCredetials;
	}
}
