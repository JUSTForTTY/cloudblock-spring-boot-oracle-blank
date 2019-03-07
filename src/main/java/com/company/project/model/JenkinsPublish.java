package com.company.project.model;

public class JenkinsPublish {

	private String jenkinsUrl;

	private String jenkinsUsername;

	private String jenkinsPassword;

	private String projectName;

	public String getJenkinsUrl() {
		return jenkinsUrl;
	}

	public void setJenkinsUrl(String jenkinsUrl) {
		this.jenkinsUrl = jenkinsUrl;
	}

	public String getJenkinsUsername() {
		return jenkinsUsername;
	}

	public void setJenkinsUsername(String jenkinsUsername) {
		this.jenkinsUsername = jenkinsUsername;
	}

	public String getJenkinsPassword() {
		return jenkinsPassword;
	}

	public void setJenkinsPassword(String jenkinsPassword) {
		this.jenkinsPassword = jenkinsPassword;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "JenkinsPublish [jenkinsUrl=" + jenkinsUrl + ", jenkinsUsername=" + jenkinsUsername
				+ ", jenkinsPassword=" + jenkinsPassword + ", projectName=" + projectName + "]";
	}

}