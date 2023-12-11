package com.springrest1.springrest1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.springrest1.springrest1.entities.Course;

public class CourseServiceImpl implements CourseService{
	
	public List<Course> list;
	
	public List<Course>	getCourses(){
	return list;
		
	}
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(145,"java","ashish"));
		list.add(new Course(141,"pythan","suhana"));
		list.add(new Course(171,"c++","piyush"));
		
	}
	
	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
				
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e ->{
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {

		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	
	}
		
		
	}
	
	


