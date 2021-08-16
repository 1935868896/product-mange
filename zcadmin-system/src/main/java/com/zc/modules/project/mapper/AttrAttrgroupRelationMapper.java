package com.zc.modules.project.mapper;

import com.zc.modules.project.entity.AttrAttrgroupRelation;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性&属性分组关联 数据层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Mapper
public interface AttrAttrgroupRelationMapper extends BaseMapper<AttrAttrgroupRelation> {

    /**
     * 查询属性&属性分组关联信息
     *
     * @param id 属性&属性分组关联ID
     * @return 属性&属性分组关联信息
     */
    AttrAttrgroupRelation selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询属性&属性分组关联列表
     *
     * @param record 属性&属性分组关联信息
     * @return 属性&属性分组关联集合
     */
    List<AttrAttrgroupRelation> selectListBySelective(AttrAttrgroupRelation record);

    /**
     * 根据条件,分页查询属性&属性分组关联列表
     *
     * @param record 属性&属性分组关联信息
     * @param page mybatis-plus 分页对象
     * @return 属性&属性分组关联集合
     */
    IPage<AttrAttrgroupRelation> selectPageBySelective(AttrAttrgroupRelation record, Page page);
    /**
     * 根据主键集合,批量查询属性&属性分组关联列表
     *
     * @param ids 属性&属性分组关联主键List集合
     * @return 属性&属性分组关联集合
     */
    List<AttrAttrgroupRelation> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record 属性&属性分组关联 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(AttrAttrgroupRelation record);


    /**
     * 插入单条数据
     *
     * @param record 属性&属性分组关联 信息
     * @return 插入数量
     */
    int insert(AttrAttrgroupRelation record);
    /**
     * 条件插入单条数据
     *
     * @param record 属性&属性分组关联 信息
     * @return 插入数量
     */
    int insertSelective(AttrAttrgroupRelation record);
    /**
     * 批量插入多条数据
     *
     * @param recordList 属性&属性分组关联集合
     * @return 插入数量
     */
    int insertBatch(List<AttrAttrgroupRelation> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 属性&属性分组关联 信息
     * @return 修改数量
     */
    int update(AttrAttrgroupRelation record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 属性&属性分组关联 信息
     * @return 修改数量
     */
    int updateBySelective(AttrAttrgroupRelation record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 属性&属性分组关联 集合
     * @return 修改数量
     */
    int updateBatch(List<AttrAttrgroupRelation> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 属性&属性分组关联 集合
     * @return 修改数量
     */
    int updateBatchSelective(List<AttrAttrgroupRelation> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id 属性&属性分组关联 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids 属性&属性分组关联 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}