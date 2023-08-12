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
    public List<OriginDTO> selectJoinAllBaen() {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);
        List<OriginDTO> originList = beanMapper.selectJoinAllBaen();

        sqlSession.close();

        return originList;
    }

    public List<BeanDTO> selectAllBean() {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);
        List<BeanDTO> beanList = beanMapper.selectAllBean();

        sqlSession.close();

        return beanList;
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

    public boolean updateBean(BeanDTO beanDTO) {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);

        int result = beanMapper.updateBean(beanDTO);

        if (result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;

    }

    public boolean deleteBean(int code) {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);

        int result = beanMapper.deleteBean(code);

        if (result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean storageOrReleaseBean(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        beanMapper = sqlSession.getMapper(BeanMapper.class);

        int result = beanMapper.storageOrReleaseBean(searchCriteria);

        if (result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;

    }


}
