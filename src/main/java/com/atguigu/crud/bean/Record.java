package com.atguigu.crud.bean;

import java.util.Objects;

/**
 * 发放工资记录表
 */
public class Record {
    private Integer id;
    private int employeeId;
    private Double realWages;
    private String employeeName;

    public Record() {
    }

    public Record(Integer id, int employeeId, Double realWages, String employeeName) {
        this.id = id;
        this.employeeId = employeeId;
        this.realWages = realWages;
        this.employeeName = employeeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Double getRealWages() {
        return realWages;
    }

    public void setRealWages(Double realWages) {
        this.realWages = realWages;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Record)) return false;
        Record record = (Record) o;
        return getEmployeeId() == record.getEmployeeId() && Objects.equals(getId(), record.getId()) && Objects.equals(getRealWages(), record.getRealWages()) && Objects.equals(getEmployeeName(), record.getEmployeeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmployeeId(), getRealWages(), getEmployeeName());
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", realWages=" + realWages +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}