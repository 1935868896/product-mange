package com.zc.modules.project.mapper;

import com.zc.modules.project.entity.SkuInfo;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku 数据层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Mapper
public interface SkuInfoMapper extends BaseMapper<SkuInfo> {

    /**
     * 查询sku信息
     *
     * @param id skuID
     * @return sku信息
     */
    SkuInfo selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询sku列表
     *
     * @param record sku信息
     * @return sku集合
     */
    List<SkuInfo> selectListBySelective(SkuInfo record);

    /**
     * 根据条件,分页查询sku列表
     *
     * @param record sku信息
     * @param page mybatis-plus 分页对象
     * @return sku集合
     */
    IPage<SkuInfo> selectPageBySelective(SkuInfo record, Page page);
    /**
     * 根据主键集合,批量查询sku列表
     *
     * @param ids sku主键List集合
     * @return sku集合
     */
    List<SkuInfo> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record sku 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(SkuInfo record);


    /**
     * 插入单条数据
     *
     * @param record sku 信息
     * @return 插入数量
     */
    int insert(SkuInfo record);
    /**
     * 条件插入单条数据
     *
     * @param record sku 信息
     * @return 插入数量
     */
    int insertSelective(SkuInfo record);
    /**
     * 批量插入多条数据
     *
     * @param recordList sku集合
     * @return 插入数量
     */
    int insertBatch(List<SkuInfo> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record sku 信息
     * @return 修改数量
     */
    int update(SkuInfo record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record sku 信息
     * @return 修改数量
     */
    int updateBySelective(SkuInfo record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList sku 集合
     * @return 修改数量
     */
    int updateBatch(List<SkuInfo> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList sku 集合
     * @return 修改数量
     */
    int updateBatchSelective(List<SkuInfo> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id sku 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids sku 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}