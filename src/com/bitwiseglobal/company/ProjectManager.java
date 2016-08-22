package com.bitwiseglobal.company;


class ProjectManager {
    private int pmId;
    private int projectNameId;
    private String projectManagerName;


    ProjectManager(int pmId, String projectManagerName,int projectNameId){
        this.pmId = pmId;
        this.projectManagerName = projectManagerName;
        this.projectNameId = projectNameId;
    }

    public int getPmId() {
        return pmId;
    }

    public void setPmId(int pmId) {
        this.pmId = pmId;
    }

    public String getProjectManagerName() {
        return projectManagerName;
    }

    public void setProjectManagerName(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public int getProjectNameId() {
        return projectNameId;
    }

    public void setProjectNameId(int projectNameId) {
        this.projectNameId = projectNameId;
    }

}
