package StuDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import StuData.Students;


public class StudentsDAOImpl implements StudentsDAO {
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	} 

	@Override
	public List<Students> getStudents() {
		// TODO Auto-generated method stub
		String sql="select * from students";
		List<Students> lists=jdbcTemplate.query(sql,new RowMapper<Students>(){
			public Students mapRow(ResultSet rs,int rowNum) throws SQLException{
			Students stu=new Students();
			stu.setSname(rs.getString("sname"));
			stu.setSid(rs.getString("sid"));
			stu.setSage(rs.getInt("sage"));
			return stu;
			}
			});
			return lists;
		
	}

}
