package ATS.software.ProjectTracker;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UpdateId implements Serializable {
    private Integer userId;
    private Integer departmentId;
    private Integer modelId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
    
    
    
}
