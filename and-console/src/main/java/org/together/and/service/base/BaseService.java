package org.together.and.service.base;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.transaction.annotation.Transactional;
import org.together.and.bean.Page;

public interface BaseService<R, E> {

	long countByExample(E example);

	@Transactional
	int deleteByExample(E example);

	@Transactional
	int deleteByPrimaryKey(Integer id);

	@Transactional
	int insert(R record);

	@Transactional
	int insertSelective(R record);

	List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds);

	Page<R> selectByExampleToPage(E example, RowBounds rowBounds);

	List<R> selectByExample(E example);

	R selectByPrimaryKey(Integer id);

	@Transactional
	int updateByExampleSelective(R record, E example);

	@Transactional
	int updateByExample(R record, E example);

	@Transactional
	int updateByPrimaryKeySelective(R record);

	@Transactional
	int updateByPrimaryKey(R record);

}
