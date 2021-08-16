package com.zc.modules.project.service;

import com.zc.modules.project.entity.SpuImages;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * spu图片 服务层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
public interface SpuImagesService extends IService<SpuImages> {
    /**
     * 查询spu图片信息
     *
     * @param id spu图片ID
     * @return spu图片信息
     */
    SpuImages selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询spu图片列表
     *
     * @param record spu图片信息
     * @return spu图片集合
     */
    List<SpuImages> selectListBySelective(SpuImages record);

    /**
     * 根据条件,分页查询spu图片列表
     *
     * @param record spu图片信息
     * @param page mybatis-plus 分页对象
     * @return spu图片集合
     */
    IPage<SpuImages> selectPageBySelective(SpuImages record, Page page);
    /**
     * 根据主键集合,批量查询spu图片列表
     *
     * @param ids spu图片主键List集合
     * @return spu图片集合
     */
    List<SpuImages> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record spu图片 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(SpuImages record);


    /**
     * 插入单条数据
     *
     * @param record spu图片 信息
     * @return 插入数量
     */
    int insert(SpuImages record);
    /**
     * 条件插入单条数据
     *
     * @param record spu图片 信息
     * @return 插入数量
     */
    int insertSelective(SpuImages record);
    /**
     * 批量插入多条数据
     *
     * @param recordList spu图片集合
     * @return 插入数量
     */
    int insertBatch(List<SpuImages> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu图片 信息
     * @return 修改数量
     */
    int update(SpuImages record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu图片 信息
     * @return 修改数量
     */
    int updateBySelective(SpuImages record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu图片 集合
     * @return 修改数量
     */
    int updateBatch(List<SpuImages> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu图片 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<SpuImages> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id spu图片 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu图片 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}
