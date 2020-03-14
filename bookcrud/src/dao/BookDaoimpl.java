package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dto.Book;

public class BookDaoimpl implements BookDao {
	Connection con;

	@Override
	public Connection getConnection()  throws SQLException{
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		return con;
	}

	@Override
	public void closeConnections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertBookDao(Book book) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into book values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, book.getId());
		pst.setString(2,book.getTitle());
		pst.setString(3, book.getAuthor());
		pst.setInt(4, get());
		
	}

	@Override
	public List<Book> showAllBookDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookDao(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBookDao(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookDao(Book book) {
		// TODO Auto-generated method stub
		
	}

}
