/*package com.flowmaster.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.flowmaster.model.Candidate;

public class CommonDAO implements BaseDAO{
	 private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }

	   public void create(String name, Integer age) {
	      String SQL = "insert into Candidate (name, age) values (?, ?)";
	      
	      jdbcTemplateObject.update( SQL, name, age);
	      System.out.println("Created Record Name = " + name + " Age = " + age);
	      return;
	   }

	   public Candidate getCandidate(Integer id) {
	      String SQL = "select * from Candidate where id = ?";
	      Candidate Candidate = jdbcTemplateObject.queryForObject(SQL, 
	                        new Object[]{id}, new CandidateMapper());
	      return Candidate;
	   }

	   public List<Candidate> listCandidates() {
	      String SQL = "select * from Candidate";
	      List <Candidate> Candidates = jdbcTemplateObject.query(SQL, 
	                                new CandidateMapper());
	      return Candidates;
	   }

	   public void delete(Integer id){
	      String SQL = "delete from Candidate where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }

	   public void update(Integer id, Integer age){
	      String SQL = "update Candidate set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	   }

		   public static void main(String[] args) {
		      ApplicationContext context = 
		             new ClassPathXmlApplicationContext("Beans.xml");

		      CommonDAO studentJDBCTemplate = 
		      (CommonDAO)context.getBean("studentJDBCTemplate");
		      
		      System.out.println("------Records Creation--------" );
		      studentJDBCTemplate.create("Zara", 11);
		      studentJDBCTemplate.create("Nuha", 2);
		      studentJDBCTemplate.create("Ayan", 15);

		      System.out.println("------Listing Multiple Records--------" );
		      List<Candidate> students = studentJDBCTemplate.listCandidates();
		      for (Candidate record : students) {
		         //System.out.print("ID : " + record.getCandidateId() );
		         System.out.print(", Name : " + record.getCanditatName() );
		         System.out.println(", SkilSet : " + record.getSkilSet());
		      }

		      System.out.println("----Updating Record with ID = 2 -----" );
		      studentJDBCTemplate.update(2, 20);

		      System.out.println("----Listing Record with ID = 2 -----" );
		      Candidate record = studentJDBCTemplate.getCandidate(2);
		      System.out.print("ID : " + record.getCandidateId() );
		         System.out.print(", Name : " + record.getCanditatName() );
		         System.out.println(", SkilSet : " + record.getSkilSet());
			  
		   }


}
*/