package com.zc.modules.project.service;

import com.zc.modules.project.entity.CategoryBrandRelation;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * 品牌分类关联 服务层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelation> {
    /**
     * 查询品牌分类关联信息
     *
     * @param id 品牌分类关联ID
     * @return 品牌分类关联信息
     */
    CategoryBrandRelation selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询品牌分类关联列表
     *
     * @param record 品牌分类关联信息
     * @return 品牌分类关联集合
     */
    List<CategoryBrandRelation> selectListBySelective(CategoryBrandRelation record);

    /**
     * 根据条件,分页查询品牌分类关联列表
     *
     * @param record 品牌分类关联信息
     * @param page mybatis-plus 分页对象
     * @return 品牌分类关联集合
     */
    IPage<CategoryBrandRelation> selectPageBySelective(CategoryBrandRelation record, Page page);
    /**
     * 根据主键集合,批量查询品牌分类关联列表
     *
     * @param ids 品牌分类关联主键List集合
     * @return 品牌分类关联集合
     */
    List<CategoryBrandRelation> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record 品牌分类关联 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(CategoryBrandRelation record);


    /**
     * 插入单条数据
     *
     * @param record 品牌分类关联 信息
     * @return 插入数量
     */
    int insert(CategoryBrandRelation record);
    /**
     * 条件插入单条数据
     *
     * @param record 品牌分类关联 信息
     * @return 插入数量
     */
    int insertSelective(CategoryBrandRelation record);
    /**
     * 批量插入多条数据
     *
     * @param recordList 品牌分类关联集合
     * @return 插入数量
     */
    int insertBatch(List<CategoryBrandRelation> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 品牌分类关联 信息
     * @return 修改数量
     */
    int update(CategoryBrandRelation record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 品牌分类关联 信息
     * @return 修改数量
     */
    int updateBySelective(CategoryBrandRelation record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 品牌分类关联 集合
     * @return 修改数量
     */
    int updateBatch(List<CategoryBrandRelation> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 品牌分类关联 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<CategoryBrandRelation> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id 品牌分类关联 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids 品牌分类关联 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}
