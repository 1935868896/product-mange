package com.zc.modules.project.mapper;

import com.zc.modules.project.entity.SpuInfoDesc;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu介绍 数据层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Mapper
public interface SpuInfoDescMapper extends BaseMapper<SpuInfoDesc> {

    /**
     * 查询spu介绍信息
     *
     * @param id spu介绍ID
     * @return spu介绍信息
     */
    SpuInfoDesc selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询spu介绍列表
     *
     * @param record spu介绍信息
     * @return spu介绍集合
     */
    List<SpuInfoDesc> selectListBySelective(SpuInfoDesc record);

    /**
     * 根据条件,分页查询spu介绍列表
     *
     * @param record spu介绍信息
     * @param page mybatis-plus 分页对象
     * @return spu介绍集合
     */
    IPage<SpuInfoDesc> selectPageBySelective(SpuInfoDesc record, Page page);
    /**
     * 根据主键集合,批量查询spu介绍列表
     *
     * @param ids spu介绍主键List集合
     * @return spu介绍集合
     */
    List<SpuInfoDesc> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record spu介绍 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(SpuInfoDesc record);


    /**
     * 插入单条数据
     *
     * @param record spu介绍 信息
     * @return 插入数量
     */
    int insert(SpuInfoDesc record);
    /**
     * 条件插入单条数据
     *
     * @param record spu介绍 信息
     * @return 插入数量
     */
    int insertSelective(SpuInfoDesc record);
    /**
     * 批量插入多条数据
     *
     * @param recordList spu介绍集合
     * @return 插入数量
     */
    int insertBatch(List<SpuInfoDesc> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu介绍 信息
     * @return 修改数量
     */
    int update(SpuInfoDesc record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu介绍 信息
     * @return 修改数量
     */
    int updateBySelective(SpuInfoDesc record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu介绍 集合
     * @return 修改数量
     */
    int updateBatch(List<SpuInfoDesc> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu介绍 集合
     * @return 修改数量
     */
    int updateBatchSelective(List<SpuInfoDesc> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id spu介绍 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu介绍 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}