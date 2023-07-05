package com.atguigu.crud.bean;

import java.util.Objects;

/**
 * 员工薪资表
 */
public class EmpSalary {
    private Integer id;
    private int empId;
    private String year;
    private String month;
    private Double wagesJob;
    private Double allowance;
    private Double tax;
    private Double award;
    private Double fine;
    private Double realWages;

    public EmpSalary() {
    }

    public EmpSalary(Integer id, int empId, String year, String month, Double wagesJob, Double allowance, Double tax, Double award, Double fine, Double realWages) {
        this.id = id;
        this.empId = empId;
        this.year = year;
        this.month = month;
        this.wagesJob = wagesJob;
        this.allowance = allowance;
        this.tax = tax;
        this.award = award;
        this.fine = fine;
        this.realWages = realWages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getWagesJob() {
        return wagesJob;
    }

    public void setWagesJob(Double wagesJob) {
        this.wagesJob = wagesJob;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getAward() {
        return award;
    }

    public void setAward(Double award) {
        this.award = award;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }

    public Double getRealWages() {
        return realWages;
    }

    public void setRealWages(Double realWages) {
        this.realWages = realWages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpSalary)) return false;
        EmpSalary empSalary = (EmpSalary) o;
        return getEmpId() == empSalary.getEmpId() && Objects.equals(getId(), empSalary.getId()) && Objects.equals(getYear(), empSalary.getYear()) && Objects.equals(getMonth(), empSalary.getMonth()) && Objects.equals(getWagesJob(), empSalary.getWagesJob()) && Objects.equals(getAllowance(), empSalary.getAllowance()) && Objects.equals(getTax(), empSalary.getTax()) && Objects.equals(getAward(), empSalary.getAward()) && Objects.equals(getFine(), empSalary.getFine()) && Objects.equals(getRealWages(), empSalary.getRealWages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmpId(), getYear(), getMonth(), getWagesJob(), getAllowance(), getTax(), getAward(), getFine(), getRealWages());
    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "id=" + id +
                ", empId=" + empId +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", wagesJob=" + wagesJob +
                ", allowance=" + allowance +
                ", tax=" + tax +
                ", award=" + award +
                ", fine=" + fine +
                ", realWages=" + realWages +
                '}';
    }
}
