package com.masai.dao;

import java.util.List;

import com.masai.exception.AdminException;
import com.masai.exception.BatchException;
import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;

public interface AdminDao {
	
	public boolean adminLogIn(String username, String password) throws AdminException;
	
//	1. Add a new Courses
	public String addNewCourse(Course course) throws CourseException;
	
	
//	2. Update Fees of course.
	public String updateFeesOfCourseUsingCId(int cid, long fee) throws CourseException;
	
	
//  3. Delete  a course from any Training session.
	public String deleteCourseUsingCId(int cid) throws CourseException;
	
	
//  4. Search information about a course.
	public Course searchInfoUsingCId(int cid) throws CourseException;
	
	
//  5. Create Batch under a course.
	public String createBatchUnderCourse(int cid, String batch, int totalSeat) throws BatchException;
	
	
//  6. Allocate students in a Batch under a course.
	public int allocateBatchToStudent(String email, String cname) throws BatchException, StudentException;
	
	
//  7. Update total seats of a batch.
	public String updateTotalSeatsInBatch(String batch, int seats) throws BatchException;
	
	
//  8. View the students of every batch. 
	public List<Student> viewAllStudents() throws StudentException;



}
