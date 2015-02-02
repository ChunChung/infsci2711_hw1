package edu.pitt.sis.infsci2711.hw1_server.business;

import java.sql.SQLException;
import java.util.List;

import edu.pitt.sis.infsci2711.hw1_server.dao.PersonDAO;
import edu.pitt.sis.infsci2711.hw1_server.models.PersonDBModel;

public class PersonService {

	public List<PersonDBModel> getAll() throws SQLException, Exception {
		List<PersonDBModel> result = PersonDAO.findAll();
		
		return result;
	}
	
	public PersonDBModel findById(final int id) throws SQLException, Exception {
		PersonDBModel result = PersonDAO.findById(id);
		
		return result;
	}
	
	public PersonDBModel add(final PersonDBModel person) throws SQLException, Exception {
		PersonDAO.save(person);
		
		return person;
	}
}
