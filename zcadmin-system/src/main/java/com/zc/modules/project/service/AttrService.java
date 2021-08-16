package com.zc.modules.project.service;

import com.zc.modules.project.entity.Attr;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * 商品属性 服务层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
public interface AttrService extends IService<Attr> {
    /**
     * 查询商品属性信息
     *
     * @param id 商品属性ID
     * @return 商品属性信息
     */
    Attr selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询商品属性列表
     *
     * @param record 商品属性信息
     * @return 商品属性集合
     */
    List<Attr> selectListBySelective(Attr record);

    /**
     * 根据条件,分页查询商品属性列表
     *
     * @param record 商品属性信息
     * @param page mybatis-plus 分页对象
     * @return 商品属性集合
     */
    IPage<Attr> selectPageBySelective(Attr record, Page page);
    /**
     * 根据主键集合,批量查询商品属性列表
     *
     * @param ids 商品属性主键List集合
     * @return 商品属性集合
     */
    List<Attr> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record 商品属性 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(Attr record);


    /**
     * 插入单条数据
     *
     * @param record 商品属性 信息
     * @return 插入数量
     */
    int insert(Attr record);
    /**
     * 条件插入单条数据
     *
     * @param record 商品属性 信息
     * @return 插入数量
     */
    int insertSelective(Attr record);
    /**
     * 批量插入多条数据
     *
     * @param recordList 商品属性集合
     * @return 插入数量
     */
    int insertBatch(List<Attr> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 商品属性 信息
     * @return 修改数量
     */
    int update(Attr record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 商品属性 信息
     * @return 修改数量
     */
    int updateBySelective(Attr record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 商品属性 集合
     * @return 修改数量
     */
    int updateBatch(List<Attr> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 商品属性 集合
     * @return 修改数量
     */
    int updateBatchBySelective(List<Attr> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id 商品属性 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids 商品属性 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}
