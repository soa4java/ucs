package com.dzmsoft.ucs.base.pojo;

import java.util.Date;

public class UcsRole {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ucs_role.id
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ucs_role.name
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ucs_role.description
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    private String description;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ucs_role.status
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    private String status;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ucs_role.create_time
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    private Date createTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column ucs_role.domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    private String domain;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ucs_role.id
     * @return  the value of ucs_role.id
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ucs_role.id
     * @param id  the value for ucs_role.id
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ucs_role.name
     * @return  the value of ucs_role.name
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ucs_role.name
     * @param name  the value for ucs_role.name
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ucs_role.description
     * @return  the value of ucs_role.description
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ucs_role.description
     * @param description  the value for ucs_role.description
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ucs_role.status
     * @return  the value of ucs_role.status
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ucs_role.status
     * @param status  the value for ucs_role.status
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ucs_role.create_time
     * @return  the value of ucs_role.create_time
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ucs_role.create_time
     * @param createTime  the value for ucs_role.create_time
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column ucs_role.domain
     * @return  the value of ucs_role.domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column ucs_role.domain
     * @param domain  the value for ucs_role.domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }
}