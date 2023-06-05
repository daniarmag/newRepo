package entities;

import java.io.Serializable;

/**
 * Represents the exams in the system.
 */
@SuppressWarnings("serial")
public class Exam implements Serializable
{
	public String exam_number;
	public String subject_id;
	public String course_id;
	public String exam_id;
	public Integer num_questions;
	public Integer time;
	public String examinees_notes;
	public String professor_notes;
	public String professor_full_name;
	public String professor_id;
	public String password;
	public Integer isActive = 0;
	
	/**
	 * @param exam_number
	 * @param subject_id
	 * @param course_id
	 * @param exam_id
	 * @param num_questions
	 * @param time
	 * @param examinees_notes
	 * @param professor_notes
	 * @param professor_full_name
	 * @param professor_id
	 * @param password
	 * @param isActive
	 */
	public Exam(String exam_number, String subject_id, String course_id, String exam_id, Integer num_questions,
		    	Integer time, String examinees_notes, String professor_notes, String professor_full_name,
			    String professor_id, String password) 
	{
		super();
		this.exam_number = exam_number;
		this.subject_id = subject_id;
		this.course_id = course_id;
		this.exam_id = exam_id;
		this.num_questions = num_questions;
		this.time = time;
		this.examinees_notes = examinees_notes;
		this.professor_notes = professor_notes;
		this.professor_full_name = professor_full_name;
		this.professor_id = professor_id;
		this.password = password;
	}

	/**
	 * @return the exam_number
	 */
	public String getExam_number() {
		return exam_number;
	}

	/**
	 * @return the subject_id
	 */
	public String getSubject_id() {
		return subject_id;
	}

	/**
	 * @return the course_id
	 */
	public String getCourse_id() {
		return course_id;
	}

	/**
	 * @return the exam_id
	 */
	public String getExam_id() {
		return exam_id;
	}

	/**
	 * @return the num_questions
	 */
	public Integer getNum_questions() {
		return num_questions;
	}

	/**
	 * @return the time
	 */
	public Integer getTime() {
		return time;
	}

	/**
	 * @return the examinees_notes
	 */
	public String getExaminees_notes() {
		return examinees_notes;
	}

	/**
	 * @return the professor_notes
	 */
	public String getProfessor_notes() {
		return professor_notes;
	}

	/**
	 * @return the professor_full_name
	 */
	public String getProfessor_full_name() {
		return professor_full_name;
	}

	/**
	 * @return the professor_id
	 */
	public String getProfessor_id() {
		return professor_id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the isActive
	 */
	public Integer getIsActive() {
		return isActive;
	}

	/**
	 * @param exam_number the exam_number to set
	 */
	public void setExam_number(String exam_number) {
		this.exam_number = exam_number;
	}

	/**
	 * @param subject_id the subject_id to set
	 */
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	/**
	 * @param exam_id the exam_id to set
	 */
	public void setExam_id(String exam_id) {
		this.exam_id = exam_id;
	}

	/**
	 * @param num_questions the num_questions to set
	 */
	public void setNum_questions(Integer num_questions) {
		this.num_questions = num_questions;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Integer time) {
		this.time = time;
	}

	/**
	 * @param examinees_notes the examinees_notes to set
	 */
	public void setExaminees_notes(String examinees_notes) {
		this.examinees_notes = examinees_notes;
	}

	/**
	 * @param professor_notes the professor_notes to set
	 */
	public void setProfessor_notes(String professor_notes) {
		this.professor_notes = professor_notes;
	}

	/**
	 * @param professor_full_name the professor_full_name to set
	 */
	public void setProfessor_full_name(String professor_full_name) {
		this.professor_full_name = professor_full_name;
	}

	/**
	 * @param professor_id the professor_id to set
	 */
	public void setProfessor_id(String professor_id) {
		this.professor_id = professor_id;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}


	/**
	 @return method representation of the class.
	 */
	@Override
	public String toString() {
		return "Exam [exam_number=" + exam_number + ", subject_id=" + subject_id + ", course_id=" + course_id
				+ ", exam_id=" + exam_id + ", num_questions=" + num_questions + ", time=" + time + ", examinees_notes="
				+ examinees_notes + ", professor_notes=" + professor_notes + ", professor_full_name="
				+ professor_full_name + ", professor_id=" + professor_id + ", password=" + password + ", isActive="
				+ isActive + "]";
	}
	
	
}