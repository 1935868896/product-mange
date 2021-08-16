package com.zc.modules.project.service;

import com.zc.modules.project.entity.ProductAttrValue;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * spu属性值 服务层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {
    /**
     * 查询spu属性值信息
     *
     * @param id spu属性值ID
     * @return spu属性值信息
     */
    ProductAttrValue selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询spu属性值列表
     *
     * @param record spu属性值信息
     * @return spu属性值集合
     */
    List<ProductAttrValue> selectListBySelective(ProductAttrValue record);

    /**
     * 根据条件,分页查询spu属性值列表
     *
     * @param record spu属性值信息
     * @param page mybatis-plus 分页对象
     * @return spu属性值集合
     */
    IPage<ProductAttrValue> selectPageBySelective(ProductAttrValue record, Page page);
    /**
     * 根据主键集合,批量查询spu属性值列表
     *
     * @param ids spu属性值主键List集合
     * @return spu属性值集合
     */
    List<ProductAttrValue> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record spu属性值 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(ProductAttrValue record);


    /**
     * 插入单条数据
     *
     * @param record spu属性值 信息
     * @return 插入数量
     */
    int insert(ProductAttrValue record);
    /**
     * 条件插入单条数据
     *
     * @param record spu属性值 信息
     * @return 插入数量
     */
    int insertSelective(ProductAttrValue record);
    /**
     * 批量插入多条数据
     *
     * @param recordList spu属性值集合
     * @return 插入数量
     */
    int insertBatch(List<ProductAttrValue> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu属性值 信息
     * @return 修改数量
     */
    int update(ProductAttrValue record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu属性值 信息
     * @return 修改数量
     */
    int updateBySelective(ProductAttrValue record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu属性值 集合
     * @return 修改数量
     */
    int updateBatch(List<ProductAttrValue> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu属性值 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<ProductAttrValue> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id spu属性值 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu属性值 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}
