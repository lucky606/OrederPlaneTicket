package cn.edu.hcnu.bean;

public class Order {
    private String customerType;  // 乘客类型
    private  float jcs;  //机场税
    private String ryf;  //燃油费
    private  float hkzhx;  //航空综合险
    private  float jptgx;  //机票退改险
    private  float yhq;    //优惠券
    private  float hszj;   //含税总价
    private Customer [] customers; // 乘客位数

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public float getJcs() {
        return jcs;
    }

    public void setJcs(float jcs) {
        this.jcs = jcs;
    }

    public String getRyf() {
        return ryf;
    }

    public void setRyf(String ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

}
