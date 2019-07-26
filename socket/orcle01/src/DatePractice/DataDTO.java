/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatePractice;

/**
 *
 * @author bit
 */
public class DataDTO {
    private int deptno;
    private String saname;
    private String sahire;
    private String sysdate;
    private String duringWork;

    public String getDuringWork() {
        return duringWork;
    }

    public void setDuringWork(String duringWork) {
        this.duringWork = duringWork;
    }
    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getSaname() {
        return saname;
    }

    public void setSaname(String saname) {
        this.saname = saname;
    }

    public String getSahire() {
        return sahire;
    }

    public void setSahire(String sahire) {
        this.sahire = sahire;
    }

    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

   
    
}
