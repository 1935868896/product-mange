package com.zc.modules.project.service;

import com.zc.modules.project.entity.Category;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zc.modules.project.vo.CategoryVo;

import java.util.List;

/**
 * 商品三级分类 服务层
 *
 * @author Zhang C
 * @date 2021-08-13
 */
public interface CategoryService extends IService<Category> {
    /**
     * 查询商品三级分类信息
     *
     * @param id 商品三级分类ID
     * @return 商品三级分类信息
     */
    Category selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询商品三级分类列表
     *
     * @param record 商品三级分类信息
     * @return 商品三级分类集合
     */
    List<Category> selectListBySelective(Category record);

    /**
     * 根据条件,分页查询商品三级分类列表
     *
     * @param record 商品三级分类信息
     * @param page mybatis-plus 分页对象
     * @return 商品三级分类集合
     */
    IPage<Category> selectPageBySelective(Category record, Page page);
    /**
     * 根据主键集合,批量查询商品三级分类列表
     *
     * @param ids 商品三级分类主键List集合
     * @return 商品三级分类集合
     */
    List<Category> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record 商品三级分类 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(Category record);


    /**
     * 插入单条数据
     *
     * @param record 商品三级分类 信息
     * @return 插入数量
     */
    int insert(Category record);
    /**
     * 条件插入单条数据
     *
     * @param record 商品三级分类 信息
     * @return 插入数量
     */
    int insertSelective(Category record);
    /**
     * 批量插入多条数据
     *
     * @param recordList 商品三级分类集合
     * @return 插入数量
     */
    int insertBatch(List<Category> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 商品三级分类 信息
     * @return 修改数量
     */
    int update(Category record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 商品三级分类 信息
     * @return 修改数量
     */
    int updateBySelective(Category record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 商品三级分类 集合
     * @return 修改数量
     */
    int updateBatch(List<Category> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 商品三级分类 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<Category> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id 商品三级分类 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids 商品三级分类 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

    CategoryVo getTrees();

}
