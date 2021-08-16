package com.zc.modules.project.mapper;

import com.zc.modules.project.entity.SpuInfo;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu 数据层
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Mapper
public interface SpuInfoMapper extends BaseMapper<SpuInfo> {

    /**
     * 查询spu信息
     *
     * @param id spuID
     * @return spu信息
     */
    SpuInfo selectByPrimaryKey(Long id);


    /**
     * 根据条件,查询spu列表
     *
     * @param record spu信息
     * @return spu集合
     */
    List<SpuInfo> selectListBySelective(SpuInfo record);

    /**
     * 根据条件,分页查询spu列表
     *
     * @param record spu信息
     * @param page mybatis-plus 分页对象
     * @return spu集合
     */
    IPage<SpuInfo> selectPageBySelective(SpuInfo record, Page page);
    /**
     * 根据主键集合,批量查询spu列表
     *
     * @param ids spu主键List集合
     * @return spu集合
     */
    List<SpuInfo> selectByPrimaryKeys(List<Long> ids);

    /**
     * 查询符合条件的语句数量
     *
     * @param record spu 信息
     * @return 查询结果数量
     */
    int selectCountBySelective(SpuInfo record);


    /**
     * 插入单条数据
     *
     * @param record spu 信息
     * @return 插入数量
     */
    int insert(SpuInfo record);
    /**
     * 条件插入单条数据
     *
     * @param record spu 信息
     * @return 插入数量
     */
    int insertSelective(SpuInfo record);
    /**
     * 批量插入多条数据
     *
     * @param recordList spu集合
     * @return 插入数量
     */
    int insertBatch(List<SpuInfo> recordList);
    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu 信息
     * @return 修改数量
     */
    int update(SpuInfo record);
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu 信息
     * @return 修改数量
     */
    int updateBySelective(SpuInfo record);


    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu 集合
     * @return 修改数量
     */
    int updateBatch(List<SpuInfo> recordList);
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu 集合
     * @return 修改数量
     */
    int updateBatchSelective(List<SpuInfo> recordList);
    /**
     * 根据主键删除数据
     *
     * @param id spu 主键
     * @return 删除数量
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu 主键集合
     * @return 删除数量
     */
    int deleteByPrimaryKeys(List<Long> ids);

}