package com.brorsoo.service;

import com.brorsoo.common.BeanDTO;
import com.brorsoo.common.OriginDTO;
import com.brorsoo.common.SearchCriteria;
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

    public List<OriginDTO> selectOrigin() {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);
        List<OriginDTO> originList = beanMapper.selectOrigin();

        sqlSession.close();

        return originList;

    }

    public List<OriginDTO> selectChoice(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);

        List<OriginDTO> originList = beanMapper.selectChoice(searchCriteria);

        sqlSession.close();

        return originList;
    }

    public boolean insertBean(BeanDTO beanDTO) {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);

        int result = beanMapper.insertBean(beanDTO);

        if (result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

}
