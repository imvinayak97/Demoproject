package com.MANYTOMANY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	@Column(name = "Pro_name")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<EMp> eMps;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projectName, List<EMp> eMps) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.eMps = eMps;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<EMp> geteMps() {
		return eMps;
	}

	public void seteMps(List<EMp> eMps) {
		this.eMps = eMps;
	}

}
