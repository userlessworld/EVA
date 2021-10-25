package whz.pti.eva.praktikum_02.grade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import whz.pti.eva.praktikum_02.grade.domain.Grade;
import whz.pti.eva.praktikum_02.grade.domain.GradeRepository;
@Service
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	GradeRepository graderepro = new GradeRepository() {

		@Override
		public List<Grade> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Grade> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Grade> findAllById(Iterable<String> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Grade> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> List<S> saveAllAndFlush(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteAllInBatch(Iterable<Grade> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllByIdInBatch(Iterable<String> ids) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Grade getOne(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Grade getById(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Grade> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Optional<Grade> findById(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean existsById(String id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deleteById(String id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Grade entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllById(Iterable<? extends String> ids) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll(Iterable<? extends Grade> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Grade> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Grade> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public <S extends Grade> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Optional<Grade> findByGrade(String lecture, String grade) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}; 
	
	@Override
	public List<Grade> listAllGrades() {
		return graderepro.findAll();
	}

	@Override
	public void addGrade(String lecture, String grade) {
		Grade g = new Grade(lecture, grade);
		graderepro.save(g);		
	}

	@Override
	public double calculateAverage() {
		List<Grade> grades = listAllGrades();
		return grades.stream().mapToDouble(g -> Double.valueOf(g.getGrade())).sum()/grades.size();
	}

}
