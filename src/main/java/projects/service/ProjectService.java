package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

	private ProjectDao projectDao = new ProjectDao();
	
	
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}



	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}



	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Invalid project ID selected:" + 
				"\nProject with project ID=" + projectId + " does not exist.")); 
	}

}
