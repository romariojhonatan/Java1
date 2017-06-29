package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Client;

public class ClientDao {
	
	public static void insert(Client client) {
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = 
					con.prepareStatement("INSERT INTO client VALUES (?,?)");
			ps.setString(1, client.getName());
			ps.setString(2, client.getCpf());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update(Client client) {
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = 
					con.prepareStatement("UPDATE client SET name = ? WHERE cpf = ?");
			ps.setString(1, client.getName());
			ps.setString(2, client.getCpf());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(Client client) {
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = 
					con.prepareStatement("DELETE FROM client WHERE cpf = ?");
			ps.setString(1, client.getCpf());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Client> select() {
		Connection con = ConnectionFactory.getConnection();
		ArrayList<Client> clientArrayList = new ArrayList<>();
		try {
			PreparedStatement ps = 
					con.prepareStatement("SELECT * FROM client");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				clientArrayList.add(new Client(rs.getString("name"), rs.getString("cpf"), null));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientArrayList;
	}
}
