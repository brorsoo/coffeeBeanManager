package com.brorsoo.service;

import com.brorsoo.common.OriginDTO;
import com.brorsoo.mapper.BeanMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.brorsoo.common.Template.getSqlSession;

public class BeanService {

    private BeanMapper beanMapper;
    public List<OriginDTO> selectAllBean() {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);
        List<OriginDTO> originList = beanMapper.selectAllBaen();

        sqlSession.close();

        return originList;
    }
}
