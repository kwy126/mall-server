package com.circle.dao;

import com.circle.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    /**
     * insertSelective和insert最大的区别在于insert没有判断字段是否为空，而insertSelective有判断
     * @param record
     * @return
     */
    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}