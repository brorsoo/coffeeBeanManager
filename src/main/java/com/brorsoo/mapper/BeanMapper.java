package com.brorsoo.mapper;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;
import com.brorsoo.common.SearchCriteria;

import java.util.List;

public interface BeanMapper {
    List<OriginDTO> selectAllBaen();
    List<OriginDTO> selectOrigin();
    List<OriginDTO> selectChoice(SearchCriteria searchCriteria);
    int insertBean(BeanDTO beanDTO);


}
