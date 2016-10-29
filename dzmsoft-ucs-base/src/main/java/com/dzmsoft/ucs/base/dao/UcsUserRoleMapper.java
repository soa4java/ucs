package com.dzmsoft.ucs.base.dao;

import com.dzmsoft.ucs.base.pojo.UcsUserRole;
import com.dzmsoft.ucs.base.pojo.UcsUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface UcsUserRoleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int countByExample(UcsUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int deleteByExample(UcsUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int insert(UcsUserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int insertSelective(UcsUserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    List<UcsUserRole> selectByExample(UcsUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    UcsUserRole selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") UcsUserRole record,
            @Param("example") UcsUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByExample(@Param("record") UcsUserRole record,
            @Param("example") UcsUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByPrimaryKeySelective(UcsUserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByPrimaryKey(UcsUserRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_user_role
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    PageList<UcsUserRole> selectByExample(UcsUserRoleExample example, PageBounds pageBounds);
}