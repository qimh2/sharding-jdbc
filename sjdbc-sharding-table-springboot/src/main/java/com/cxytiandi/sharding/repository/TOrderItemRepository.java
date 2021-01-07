package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.dto.TOrderItemDTO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TOrderItemRepository {

	long addOrderItem(TOrderItemDTO tOrderItemDTO);


}
