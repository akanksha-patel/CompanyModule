package com.bitwiseglobal.company;

import java.util.List;


class AddDetails {
    public void addDeliveryManager(List<DeliveryManager> list1) {
        list1.add(new DeliveryManager(1,"Tanmay"));
        list1.add(new DeliveryManager(2,"Sameera"));

    }

    public void addProjectManager(List<ProjectManager> list1) {
        list1.add(new ProjectManager(1,"Shweta",1));
        list1.add(new ProjectManager(2,"Shetal",2));

    }

    public void addProjects(List<ProjectName> list2) {
        list2.add(new ProjectName("Networking", 1, 1));
        list2.add(new ProjectName("Development", 1, 2));
        list2.add(new ProjectName("Banking", 2, 3));

    }

    public void addEmployees(List<Employee> list3) {
        list3.add(new Employee("akanksha", 1));
        list3.add(new Employee("anusha", 2));
        list3.add(new Employee("harsh", 1));
        list3.add(new Employee("priyansh", 3));

    }
}
