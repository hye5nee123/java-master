package Testyeonsueb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	// 필드에 속성 정의
	private int empNo;
	private String empName;
	private String empTel;
	private String empDt;
	private int empMoney;

	Emp() {

	}

	public Emp(int empNo, String empName, String empTel, int empMoney) {

		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		this.empNo = empNo;
		this.empName = empName;
		this.empTel = empTel;
		this.empMoney = empMoney;
		this.empDt = sdf.format(today);
	}

	public Emp(int empNo, String empName, String empTel, String empDt, int empMoney) {
		this.empNo = empNo;
		this.empName = empName;
		this.empTel = empTel;
		this.empDt = empDt;
		this.empMoney = empMoney;
	}

	// 메소드 기능
	void showInfo() {
		System.out.println(
				"직원 번호는" + empNo + "이고 이름은" + empName + "이고 번호는" + empTel + "이고 입사 일자는" + empDt + "이고 월급은" + empMoney);
	}
	String showDetailInfo() {
		String result = "사번" + empNo +"번 \n " + "이름:" +empName;
		result += "\n"
	}

	// setter
	void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	void setEmpName(String empName) {
		this.empName = empName;
	}

	void setEmpTel(String empTel) {
		this.empTel = empTel;
	}

	void setEmpDt(String empDt) {
		this.empDt = empDt;
	}

	void setEmpMoney(int empMoney) {
		this.empMoney = empMoney;
	}

	// getter
	int getEmpNo() {
		return empNo;
	}

	String getEmpName() {
		return empName;
	}

	String getEmpTel() {
		return empTel;
	}

	String getEmpDt() {
		return empDt;
	}

	int getEmpMoney() {
		return empMoney;
	}
}
