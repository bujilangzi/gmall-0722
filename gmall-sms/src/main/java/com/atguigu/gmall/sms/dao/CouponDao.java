package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhaohuiyong
 * @email 1963880581@qq.com
 * @date 2020-04-26 10:51:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
