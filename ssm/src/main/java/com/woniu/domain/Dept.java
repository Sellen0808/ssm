package com.woniu.domain;

import java.io.Serializable;
import java.util.Set;

public class Dept implements Serializable {
    private Integer did;

    private String dname;
    
    private Set<Emp> emps;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }
    
    

    public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}