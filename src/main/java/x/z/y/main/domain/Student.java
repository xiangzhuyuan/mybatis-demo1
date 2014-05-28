package x.z.y.main.domain;

import java.util.Date;

/**
 *
 * User: xiangzhuyuan
 * Date: 14-5-28
 * Time: 下午11:55
 * To change this template use File | Settings | File Templates.
 */
public class Student {

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    // setters and getters
}