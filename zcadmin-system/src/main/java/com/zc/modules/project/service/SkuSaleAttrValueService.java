package com.zc.modules.project.service;

import com.zc.modules.project.entity.SkuSaleAttrValue;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * sku销售属性&值 服务层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {
    /**
     * 查询sku销售属性&值信息
     *
     * @param id sku销售属性&值ID
     * @return sku销售属性&值信息
     */
    SkuSaleAttrValue selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询sku销售属性&值列表
     *
     * @param record sku销售属性&值信息
     * @return sku销售属性&值集合
     */
    List<SkuSaleAttrValue> selectListBySelective(SkuSaleAttrValue record);

    /**
     * 根据条件,分页查询sku销售属性&值列表
     *
     * @param record sku销售属性&值信息
     * @param page mybatis-plus 分页对象
     * @return sku销售属性&值集合
     */
    IPage<SkuSaleAttrValue> selectPageBySelective(SkuSaleAttrValue record, Page page);
    /**
     * 根据主键集合,批量查询sku销售属性&值列表
     *
     * @param ids sku销售属性&值主键List集合
     * @return sku销售属性&值集合
     */
    List<SkuSaleAttrValue> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record sku销售属性&值 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(SkuSaleAttrValue record);


    /**
     * 插入单条数据
     *
     * @param record sku销售属性&值 信息
     * @return 插入数量
     */
    int insert(SkuSaleAttrValue record);
    /**
     * 条件插入单条数据
     *
     * @param record sku销售属性&值 信息
     * @return 插入数量
     */
    int insertSelective(SkuSaleAttrValue record);
    /**
     * 批量插入多条数据
     *
     * @param recordList sku销售属性&值集合
     * @return 插入数量
     */
    int insertBatch(List<SkuSaleAttrValue> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record sku销售属性&值 信息
     * @return 修改数量
     */
    int update(SkuSaleAttrValue record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record sku销售属性&值 信息
     * @return 修改数量
     */
    int updateBySelective(SkuSaleAttrValue record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList sku销售属性&值 集合
     * @return 修改数量
     */
    int updateBatch(List<SkuSaleAttrValue> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList sku销售属性&值 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<SkuSaleAttrValue> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id sku销售属性&值 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids sku销售属性&值 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}
