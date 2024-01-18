package practice3.controller;

import practice3.model.Employee;

public class EmployeeController {
// 오버로딩 ! 

	private Employee employee = new Employee();

	public void add(int empNO, String name, char gender, String phone) {
		employee.setEmpNO(empNO);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		;

	}

	public void add(int empNO, String name, char gender, String phone, String dept, int Salary, double bonus) {
		employee.setEmpNO(empNO);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		employee.setDept(dept);
		employee.setSalary(Salary);

	}

	public void modify(String phone) {
		employee.setPhone(phone); // 전화 번호만 수정 한다
	}
	public void modify(int salary) {
		employee.setSalary(salary);
	}
	public void modify(double bonus) {
		employee.setBonus(bonus);
	}
	public Employee info() {
		return employee; // 객체 그대로 넘김 
	}
}
