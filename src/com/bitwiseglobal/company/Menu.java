package com.bitwiseglobal.company;

import java.util.*;


class Menu {

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            List<DeliveryManager> list1 = new ArrayList<DeliveryManager>();
            List<ProjectName> list2 = new ArrayList<ProjectName>();
            List<ProjectManager> list3 = new ArrayList<ProjectManager>();
            List<Employee> list4 = new ArrayList<Employee>();

            AddDetails details = new AddDetails();

            details.addDeliveryManager(list1);
            // Add Delivery Managers to Delivery manager class.
            details.addProjects(list2);
            // Add Project  to Project  class.
            details.addProjectManager(list3);
            // Add Projects manager to Project manager class.
            details.addEmployees(list4);
            // Add Employees to Employees class.

            // First show the delivery managers to user to choose from.
            for (DeliveryManager st : list1) {
                System.out.println(st.getDmId() + " " + st.getDeliveryManagerName());
            }

            System.out.println("Choose Delivery Manager Id : ");
            Scanner input = new Scanner(System.in);
            int choice1 = input.nextInt();
            //noinspection unchecked
            Collections.sort(list2, new ProjectName());
            // Show those projects whose delivery manager id matches with the
            // chosen option.
            for (ProjectName st : list2) {
                if (st.getDmId() == choice1) {
                    System.out.println(st.getProjectNameId() + " " + st.getProjectName());
                }
            }
            System.out.println("Choose Project Id : ");
            int choice2 = input.nextInt();

            // Show Employees whose project id matches with the chosen
            // option.
            for (ProjectManager st : list3) {
                if (st.getProjectNameId() == choice2) {
                    System.out.println(st.getPmId() + " " + st.getProjectManagerName());
                }
            }

            System.out.println("Choose Employee");
            int choice3 = input.nextInt();

            for (Employee st : list4) {
                if (st.pmId == choice3) {
                    System.out.println(st.employeeName);
                }
            }
            // User can continue to choose from menu or can exit the program.
            System.out.println("press 0 to continue/nPress 1 to exit.");
            int choice4 = input.nextInt();
            switch (choice4) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong input.");
                    break;

            }
        }
    }
}

