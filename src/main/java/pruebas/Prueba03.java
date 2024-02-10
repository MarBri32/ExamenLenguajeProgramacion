package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Prueba03 {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		subject.setSubject("Biologia");
		subject.setCredits("75");
		
		dao.create(subject);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject s: subjectList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
	}

}
