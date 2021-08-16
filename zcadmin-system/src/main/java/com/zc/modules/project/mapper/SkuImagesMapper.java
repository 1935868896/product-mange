package com.zc.modules.project.mapper;

import com.zc.modules.project.entity.SkuImages;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku图片 数据层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Mapper
public interface SkuImagesMapper extends BaseMapper<SkuImages> {

    /**
     * 查询sku图片信息
     *
     * @param id sku图片ID
     * @return sku图片信息
     */
    SkuImages selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询sku图片列表
     *
     * @param record sku图片信息
     * @return sku图片集合
     */
    List<SkuImages> selectListBySelective(SkuImages record);

    /**
     * 根据条件,分页查询sku图片列表
     *
     * @param record sku图片信息
     * @param page mybatis-plus 分页对象
     * @return sku图片集合
     */
    IPage<SkuImages> selectPageBySelective(SkuImages record, Page page);
    /**
     * 根据主键集合,批量查询sku图片列表
     *
     * @param ids sku图片主键List集合
     * @return sku图片集合
     */
    List<SkuImages> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record sku图片 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(SkuImages record);


    /**
     * 插入单条数据
     *
     * @param record sku图片 信息
     * @return 插入数量
     */
    int insert(SkuImages record);
    /**
     * 条件插入单条数据
     *
     * @param record sku图片 信息
     * @return 插入数量
     */
    int insertSelective(SkuImages record);
    /**
     * 批量插入多条数据
     *
     * @param recordList sku图片集合
     * @return 插入数量
     */
    int insertBatch(List<SkuImages> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record sku图片 信息
     * @return 修改数量
     */
    int update(SkuImages record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record sku图片 信息
     * @return 修改数量
     */
    int updateBySelective(SkuImages record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList sku图片 集合
     * @return 修改数量
     */
    int updateBatch(List<SkuImages> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList sku图片 集合
     * @return 修改数量
     */
    int updateBatchSelective(List<SkuImages> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id sku图片 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids sku图片 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}