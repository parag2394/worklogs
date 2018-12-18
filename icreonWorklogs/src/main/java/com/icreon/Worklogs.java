package com.icreon;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_worklogs")
public class Worklogs {
	
	@Id
	private int id;
	private String project_id;
	private String worklog_id;
	private Date start_date;
	private String description;
	private String author;
	
	@Column(name="time_spent")
	private int timespent;
	private int status;
	private Date date_created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getWorklog_id() {
		return worklog_id;
	}
	public void setWorklog_id(String worklog_id) {
		this.worklog_id = worklog_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getTimespent() {
		return timespent;
	}
	public void setTimespent(int timespent) {
		this.timespent = timespent;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	@Override
	public String toString() {
		return "Worklogs [id=" + id + ", project_id=" + project_id + ", worklog_id=" + worklog_id + ", start_date="
				+ start_date + ", description=" + description + ", author=" + author + ", timespent=" + timespent
				+ ", status=" + status + ", date_created=" + date_created + "]";
	}
	
	
	
	

}
