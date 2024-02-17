package com.example.tryspringboot.dao;

import com.example.tryspringboot.model.entity.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 文杰
 */
@Repository
public interface BannerDao {
    /**
     * 根据id删除banner
     * @param id banner id
     * @return 删除的行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入banner
     * @param record banner
     * @return 插入的行数
     */
    int insert(Banner record);

    /**
     * 选择性插入banner
     * @param record banner
     * @return 插入的行数
     */
    int insertSelective(Banner record);

    /**
     * 根据id查询banner
     * @param id banner id
     * @return banner
     */
    Banner selectByPrimaryKey(Long id);

    /**
     * 选择性更新banner
     * @param record banner
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * 更新banner
     * @param record banner
     * @return 更新的行数
     */
    int updateByPrimaryKey(Banner record);

    /**
     * 查询所有banner
     * @return banner列表
     */
    List<Banner> selectAll();
}