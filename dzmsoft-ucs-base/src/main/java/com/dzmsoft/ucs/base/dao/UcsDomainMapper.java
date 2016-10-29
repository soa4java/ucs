package com.dzmsoft.ucs.base.dao;

import com.dzmsoft.ucs.base.pojo.UcsDomain;
import com.dzmsoft.ucs.base.pojo.UcsDomainExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcsDomainMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int countByExample(UcsDomainExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int deleteByExample(UcsDomainExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int insert(UcsDomain record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int insertSelective(UcsDomain record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    List<UcsDomain> selectByExample(UcsDomainExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    UcsDomain selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") UcsDomain record,
            @Param("example") UcsDomainExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByExample(@Param("record") UcsDomain record,
            @Param("example") UcsDomainExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByPrimaryKeySelective(UcsDomain record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    int updateByPrimaryKey(UcsDomain record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table ucs_domain
     * @mbggenerated  Sat Oct 29 08:23:43 CST 2016
     */
    PageList<UcsDomain> selectByExample(UcsDomainExample example, PageBounds pageBounds);
}