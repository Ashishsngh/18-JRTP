package com.springrest1.springrest1.service;

import java.util.List;

import com.springrest1.springrest1.entities.Course;

public interface CourseService {

	public Course getCourse(long parseLong);
	

	public List<Course> getCourses();


	public Course addCourse(Course course);


	public Course updateCourse(Course course);


	public void deleteCourse(long parseLong);
	
	
	

}
