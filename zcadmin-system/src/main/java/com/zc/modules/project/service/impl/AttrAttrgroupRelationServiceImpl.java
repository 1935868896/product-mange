package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.AttrAttrgroupRelationMapper;
import com.zc.modules.project.entity.AttrAttrgroupRelation;
import com.zc.modules.project.service.AttrAttrgroupRelationService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 属性&属性分组关联 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationMapper, AttrAttrgroupRelation> implements AttrAttrgroupRelationService {

    private final AttrAttrgroupRelationMapper attrAttrgroupRelationMapper;

    /**
     * 查询属性&属性分组关联信息
     *
     * @param id 属性&属性分组关联ID
     * @return 属性&属性分组关联信息
     */
    @Override
    public AttrAttrgroupRelation selectByPrimaryKey(Long id) {
        return attrAttrgroupRelationMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询属性&属性分组关联列表
     *
     * @param record 属性&属性分组关联信息
     * @return 属性&属性分组关联集合
     */
    @Override
    public List<AttrAttrgroupRelation> selectListBySelective(AttrAttrgroupRelation record) {
        return attrAttrgroupRelationMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询属性&属性分组关联列表
     *
     * @param record 属性&属性分组关联信息
     * @param page mybatis-plus 分页对象
     * @return 属性&属性分组关联集合
     */
    @Override
    public IPage<AttrAttrgroupRelation> selectPageBySelective(AttrAttrgroupRelation record, Page page) {
        return attrAttrgroupRelationMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询属性&属性分组关联列表
     *
     * @param ids 属性&属性分组关联主键List集合
     * @return 属性&属性分组关联集合
     */
    @Override
    public List<AttrAttrgroupRelation> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return attrAttrgroupRelationMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record 属性&属性分组关联 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(AttrAttrgroupRelation record) {
        return attrAttrgroupRelationMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record 属性&属性分组关联 信息
     * @return 插入数量
     */
    @Override
    public int insert(AttrAttrgroupRelation record) {
        return attrAttrgroupRelationMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record 属性&属性分组关联 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(AttrAttrgroupRelation record) {
        return attrAttrgroupRelationMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList 属性&属性分组关联集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<AttrAttrgroupRelation> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<AttrAttrgroupRelation>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<AttrAttrgroupRelation> records : list) {
            int count = attrAttrgroupRelationMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record 属性&属性分组关联 信息
     * @return 修改数量
     */
    @Override
    public int update(AttrAttrgroupRelation record) {
        return attrAttrgroupRelationMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record 属性&属性分组关联 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(AttrAttrgroupRelation record) {
        return attrAttrgroupRelationMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList 属性&属性分组关联 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<AttrAttrgroupRelation> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<AttrAttrgroupRelation>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<AttrAttrgroupRelation> records : list) {
            int count = attrAttrgroupRelationMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList 属性&属性分组关联 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<AttrAttrgroupRelation> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<AttrAttrgroupRelation>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<AttrAttrgroupRelation> records : listLists) {
            int count = attrAttrgroupRelationMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id 属性&属性分组关联 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return attrAttrgroupRelationMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids 属性&属性分组关联 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return attrAttrgroupRelationMapper.deleteByPrimaryKeys(ids);
    }

}
