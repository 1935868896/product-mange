package com.zc.modules.project.service;

import com.zc.modules.project.entity.AttrGroup;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * 属性分组 服务层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
public interface AttrGroupService extends IService<AttrGroup> {
    /**
     * 查询属性分组信息
     *
     * @param id 属性分组ID
     * @return 属性分组信息
     */
    AttrGroup selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询属性分组列表
     *
     * @param record 属性分组信息
     * @return 属性分组集合
     */
    List<AttrGroup> selectListBySelective(AttrGroup record);

    /**
     * 根据条件,分页查询属性分组列表
     *
     * @param record 属性分组信息
     * @param page mybatis-plus 分页对象
     * @return 属性分组集合
     */
    IPage<AttrGroup> selectPageBySelective(AttrGroup record, Page page);
    /**
     * 根据主键集合,批量查询属性分组列表
     *
     * @param ids 属性分组主键List集合
     * @return 属性分组集合
     */
    List<AttrGroup> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record 属性分组 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(AttrGroup record);


    /**
     * 插入单条数据
     *
     * @param record 属性分组 信息
     * @return 插入数量
     */
    int insert(AttrGroup record);
    /**
     * 条件插入单条数据
     *
     * @param record 属性分组 信息
     * @return 插入数量
     */
    int insertSelective(AttrGroup record);
    /**
     * 批量插入多条数据
     *
     * @param recordList 属性分组集合
     * @return 插入数量
     */
    int insertBatch(List<AttrGroup> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 属性分组 信息
     * @return 修改数量
     */
    int update(AttrGroup record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 属性分组 信息
     * @return 修改数量
     */
    int updateBySelective(AttrGroup record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 属性分组 集合
     * @return 修改数量
     */
    int updateBatch(List<AttrGroup> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 属性分组 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<AttrGroup> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id 属性分组 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids 属性分组 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}
