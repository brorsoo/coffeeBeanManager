package com.brorsoo.mapper;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;
import com.brorsoo.common.SearchCriteria;

import java.util.List;

public interface BeanMapper {
    List<OriginDTO> selectJoinAllBaen();
    List<BeanDTO> selectAllBean();
    List<OriginDTO> selectOrigin();
    List<OriginDTO> selectChoice(SearchCriteria searchCriteria);
    int insertBean(BeanDTO beanDTO);
    int updateBean(BeanDTO beanDTO);
    int deleteBean(int code);
    int storageOrReleaseBean(SearchCriteria searchCriteria);

}
