package com.example.tryspringboot.dao;

import com.example.tryspringboot.model.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 文杰
 */
@Repository
public interface CategoryDao {
    /**
     * 根据id删除分类
     * @param id 分类id
     * @return 删除的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入分类
     * @param record 分类
     * @return 插入的行数
     */
    int insert(Category record);

    /**
     * 选择性插入分类
     * @param record 分类
     * @return 插入的行数
     */
    int insertSelective(Category record);

    /**
     * 根据id查询分类
     * @param id 分类id
     * @return 分类
     */
    Category selectByPrimaryKey(Long id);

    /**
     * 选择性更新分类
     * @param record 分类
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * 更新分类
     * @param record 分类
     * @return 更新的行数
     */
    int updateByPrimaryKey(Category record);
    /**
     * 查询所有分类
     * @return 分类列表
     */
    List<Category> selectAll();
}