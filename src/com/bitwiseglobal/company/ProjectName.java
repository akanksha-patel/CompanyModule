package com.bitwiseglobal.company;

import java.util.Comparator;

class ProjectName implements Comparator{


    private String projectName;
    private int dmId;
    private int projectNameId;

    public ProjectName(String name, int dmId, int projectNameId) {
        this.projectName = name;
        this.dmId = dmId;
        this.projectNameId = projectNameId;
    }

    public ProjectName() {

    }


    public int compare(Object o1, Object o2) {
        ProjectName s1 = (ProjectName) o1;
        ProjectName s2 = (ProjectName) o2;
        return s1.projectName.compareTo(s2.projectName);

    }

    public int getDmId() {
        return dmId;
    }

    public void setDmId(int dmId) {
        this.dmId = dmId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectNameId() {
        return projectNameId;
    }

    public void setProjectNameId(int projectNameId) {
        this.projectNameId = projectNameId;
    }


}
